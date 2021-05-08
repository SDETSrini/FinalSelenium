package com.qa.test;

import org.testng.annotations.Test;

import com.qa.core.Base;

public class Login extends Base {

	@Test
	public void TC001() {
		browserSetup();
		passSiteURL();
	}
}
