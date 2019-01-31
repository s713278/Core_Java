package com.zensar;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zensar.scopes.MathService;

@Configuration
@ComponentScan("com.zensar")
public class SpringJavaAnnotationApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaAnnotationApplication.class);
		MathService mathService = context.getBean("mathService",MathService.class);
		System.out.println("daoService >>"+mathService);
		context.close();
	}

}

