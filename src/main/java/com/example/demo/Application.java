package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	static void printBeans(ApplicationContext ctx) {
		System.out.printf("\nbeans(start):\n\n");
		var beanNames = ctx.getBeanDefinitionNames();
		for (var beanName : beanNames) {
			System.out.printf("> %s\n", beanName);
		}
		System.out.printf("\nbeans(end)\n\n");
	}

	public static void main(String[] args) {
		var ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		printBeans(ctx);
		ctx.getBean(Store.class);
		ctx.close();
	}
}
