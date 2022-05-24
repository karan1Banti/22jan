package com.qa.TestLayer;

import org.testng.annotations.Test;

import com.qa.TestBase.TestBase;

public class TestCase extends TestBase {

	@Test
	public void verifyBuyingOfSamsungGalaxyS6()
	{
		h.clickOnPhone();
		h.clickOnSamsungGalaxyS6();
	}
	
	@Test
	public void verifyBuyingOfNexus6()
	{
		h.clickOnPhone();
		h.clickOnNexus6();
	}
	
	@Test
	public void verifyBuyingOfNokiaLumia1520()
	{
		h.clickOnPhone();
		h.clickOnNokiaLumia1520();
	}
}
