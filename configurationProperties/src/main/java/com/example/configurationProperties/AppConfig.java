package com.example.configurationProperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.example.configurationProperties.bean.BeanTarget;

@Configuration
@PropertySource("classpath:db/datasource.properties")
public class AppConfig {

	@Value("${username}")
	private String username;
	@Value("${password}")
	private String password;
	
	@Bean
	public BeanTarget beanTarget() {
		return new BeanTarget(username, password);
	}
}
