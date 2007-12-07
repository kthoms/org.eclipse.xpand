package org.eclipse.xtend.expression;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;

import junit.framework.TestCase;

public class ResourceManagerDefaultImplTest extends TestCase {
	private final static String CONTENT = 
		tag("IMPORT ecore")+"\r\n"
		+tag("AROUND Root FOR EPackage")+"\r\n"
		+tag("ENDAROUND");
	
	class TestResourcManager extends ResourceManagerDefaultImpl {
		public Reader _createReader(InputStream in) {
			return super.createReader(in);
		}
	};
	private TestResourcManager resMgr = new TestResourcManager();
	
	public void testCreateReader_UTF () throws Exception {
		checkResourceLoading("UTF8", "templatefile-utf8.xpt");
	}

	public void testCreateReader_ISO () throws Exception {
		checkResourceLoading("ISO-8859-1", "templatefile-iso-8859-1.xpt");
	}
	
	public void testCreateReader_UTF8_autodetect () throws Exception {
		checkResourceLoading(null, "templatefile-utf8.xpt");
	}

	public void testCreateReader_ISO_autodetect () throws Exception {
		checkResourceLoading(null, "templatefile-iso-8859-1.xpt");
	}

	public void testCreateReader_MacRoman_autodetect () throws Exception {
		checkResourceLoading(null, "templatefile-macroman.xpt");
	}

	private void checkResourceLoading (String encoding, String testfile) throws IOException {
		resMgr.setFileEncoding(encoding);
		InputStream is = getClass().getResourceAsStream(testfile);
		assertNotNull (is);
		Reader reader = resMgr._createReader(is);
		String read = read(reader);
		assertNotNull(read);
		assertEquals(CONTENT, read);
		
	}
	
	private String read (Reader r) throws IOException {
		StringWriter s = new StringWriter();
		char[] buf = new char[1024];
		int len;
		len = r.read(buf,0,buf.length);
		while (len!=-1) {
			s.write(buf, 0, len);
			len = r.read(buf,0,buf.length);
		}
		return s.getBuffer().toString();
	}
	
	/**
	 * Returns a string encapsuled within Xpand guillemot brackets
	 * @param s Some string
	 * @return String with brackets - <code<b>«s»</b></code>
	 */
    protected static String tag(final String s) {
        return '\u00ab' + s + '\u00bb';
    }

}
