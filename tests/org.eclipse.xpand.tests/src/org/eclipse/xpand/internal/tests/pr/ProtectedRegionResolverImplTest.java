package org.eclipse.xpand.internal.tests.pr;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;

import junit.framework.TestCase;

import org.eclipse.internal.xpand2.pr.ProtectedRegionResolverImpl;
import org.eclipse.internal.xpand2.pr.ProtectedRegionSyntaxException;
import org.eclipse.internal.xpand2.pr.ProtectedRegionResolverImpl.ProtectedRegionImpl;
import org.eclipse.internal.xpand2.pr.util.FSIO;


public class ProtectedRegionResolverImplTest extends TestCase {
	private File file1;
	private File tempDir;
	/**
	 * Provides access to protected methods
	 */
	class ProtectedRegionResolverTestImpl extends ProtectedRegionResolverImpl {
	    public Collection<ProtectedRegionImpl> _getAllRegions(final File file) throws ProtectedRegionSyntaxException, IOException {
	    	return super.getAllRegions(file);
	    }
	}
	
	private ProtectedRegionResolverTestImpl prResolver;
	
	public void setUp () throws Exception {
		prResolver = new ProtectedRegionResolverTestImpl();
		tempDir = new File(System.getProperty("java.io.tmpdir")+"/oaw/");
		tempDir.mkdir();
		tempDir.deleteOnExit();
		
		prResolver.setSrcPathes(tempDir.getPath());

		file1 = new File(tempDir.getPath(),"file1.txt");
		file1.deleteOnExit();
		FSIO.writeSingleFile(new FileWriter(file1), new InputStreamReader(getClass().getResourceAsStream("testfile1.txt")));
	}
	
	
	public void testGetAllRegions () throws Exception {
		Collection<ProtectedRegionImpl> allRegions = prResolver._getAllRegions(file1);
		assertNotNull(allRegions);
		assertTrue("File must contain protected regions", !allRegions.isEmpty());
		// disabled protected regions are overread
		assertEquals("Enabled protected regions", 2, allRegions.size());
	}
	
	public void testGetProtectedRegion () throws Exception {
		assertNull ("Disabled protected region must not be found", prResolver.getProtectedRegion("region1"));
		assertNotNull ("Enabled protected region must be found", prResolver.getProtectedRegion("region2"));
	}
	
	public void testGetEnabledRegion2 () throws Exception {
		ProtectedRegionImpl pr = (ProtectedRegionImpl) prResolver.getProtectedRegion("region2");
		assertNotNull ("Enabled protected region must be found", pr);
		assertEquals("id", "region2", pr.getId());
		assertEquals("body", "this is an enabled protected region", pr.getBody("//", "").trim());
		assertEquals("startString", "//PROTECTED REGION ID(region2) ENABLED START", pr.getStartString("//", ""));
		assertEquals("endString", "//PROTECTED REGION END", pr.getEndString("//", ""));
		// these tests do not make sense, as if the value would be wrong, the previous test would fail (see implementation)
//		assertEquals("startIndex", 225, pr.getStartIndex());
//		assertEquals("endIndex", 264, pr.getEndIndex());
		assertNull("fileEncoding", pr.getFileEncoding());
		assertEquals("file", file1, pr.getFile());
		assertEquals("useBASE64", false, pr.isUseBASE64());
		assertEquals("disabled", false, pr.isDisabled());
	}
	
	public void testBug185493 () throws Exception {
		File file = new File(tempDir.getPath(),"testbug185493.txt");
		FSIO.writeSingleFile(new FileWriter(file), new InputStreamReader(getClass().getResourceAsStream("testbug185493.txt")));
		file.deleteOnExit();
		ProtectedRegionImpl pr = (ProtectedRegionImpl) prResolver.getProtectedRegion("&&");
		assertNotNull(pr);
	}
}
