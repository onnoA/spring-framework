package com.onnoa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <br/>
 *
 * @author onnoA
 * @date 2024/7/14 14:56
 */
@Configuration
@ComponentScan
public class JavaConfig {

	@Bean
	public User user() {
		return new User("1001", "onnoA");
	}

}
