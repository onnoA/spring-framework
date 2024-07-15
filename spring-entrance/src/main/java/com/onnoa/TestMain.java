package com.onnoa;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <br/>
 *
 * @author onnoA
 * @date 2024/7/14 14:44
 */
public class TestMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = ctx.getBean(User.class);
		System.out.println(user);
	}
}