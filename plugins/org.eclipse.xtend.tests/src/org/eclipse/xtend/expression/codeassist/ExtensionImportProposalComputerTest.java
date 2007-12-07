package org.eclipse.xtend.expression.codeassist;

import org.eclipse.internal.xtend.expression.codeassist.ExtensionImportProposalComputer;

import junit.framework.TestCase;

public class ExtensionImportProposalComputerTest extends TestCase {
    private ExtensionImportProposalComputer tpc;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        tpc = new ExtensionImportProposalComputer();
    }

    public final void testGetPrefix() {
        
        assertEquals(null, tpc.test__computePrefix("blfddgfg dfg fdgd extension"));
        assertEquals("holla::die::Waldfee", tpc.test__computePrefix("import x;\n extension holla::die::Waldfee"));
        
    }
}
