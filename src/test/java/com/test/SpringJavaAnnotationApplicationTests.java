package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.testng.Assert;

import com.test.scopes.MathService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringJavaAnnotationApplication.class)
public class SpringJavaAnnotationApplicationTests {

	

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

