package com.testng;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Sample {
@BeforeSuite
public void tc2() {
	System.out.println("testcase1");
}
@BeforeTest
public void tc1() {
	//Assert.assertTrue(false);
	System.out.println("testcase2");
}
@AfterTest
public void tc3() {
	//Assert.assertTrue(false);
	System.out.println("testcase2");
	}
@AfterSuite
public void tc4() {
	Assert.assertTrue(false);
	System.out.println("testcase2");
}
public static void main(String[] args) {
	Sample samp = new Sample();
	samp.tc1();
	samp.tc2();
	samp.tc4();
}
}


