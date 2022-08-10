package com.lti.suitex;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

public class TestsuitEx {
	@Suite//@SelectPackages({"com.lti.demo"})
	@SelectPackages({"com.lti.demos"})
	class TestSuitEx {



	}
	
}
