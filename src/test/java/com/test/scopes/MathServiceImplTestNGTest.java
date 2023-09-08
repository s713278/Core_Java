package com.test.scopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.SpringJavaAnnotationApplication;

@ContextConfiguration(classes = SpringJavaAnnotationApplication.class)
public class MathServiceImplTestNGTest extends AbstractTestNGSpringContextTests {
	@BeforeTest
	public void beforeTest() {
		System.out.println("#3");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("#4");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("#1");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("#2");
	}

	@Autowired
	MathService mathService;

	@Test
	public void sum1() {
		Assert.assertEquals(mathService.sum(2, 5), 7);
	}
	
	@Test
	public void sum2() {
		Assert.assertEquals(mathService.sum(2, -5), -3);
	}
}
