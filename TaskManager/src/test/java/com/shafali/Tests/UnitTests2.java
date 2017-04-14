package com.shafali.Tests;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class UnitTests2 {

	@Test
	public void demotest2()
	{
		System.out.println("DemoTest2");
	}
	@Test
	public void demotest3()
	{
		System.out.println("DemoTest3");
		Assert.fail();
	}
}
