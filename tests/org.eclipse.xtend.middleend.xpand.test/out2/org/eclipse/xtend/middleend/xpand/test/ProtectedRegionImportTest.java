package org.eclipse.xtend.middleend.xpand.test;

public class ProtectedRegionImportTest {
	
	public String firstProtectedOperation () {
/*PROTECTED REGION ID(ImportTestPerson1) ENABLED START*/
return "firstProtectedOperation";
/*PROTECTED REGION END*/		
	}

	public String secondProtectedOperation () {
/*PROTECTED REGION ID(ImportTestPerson2) ENABLED START*/
return "secondProtectedOperation";
/*PROTECTED REGION END*/		
	}
	
}
