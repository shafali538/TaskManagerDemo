package com.shafali.Tests;

import org.testng.annotations.Test;

import com.shafali.SecondAPIDemo.*;


public class UnitTests {

	@Test(groups={"unit"})
	public void demotest()
	{
		ActualTaskManager2 demoTaskManager=new ActualTaskManager2();
		demoTaskManager.executeMehtodTaskManager();
	}
}
