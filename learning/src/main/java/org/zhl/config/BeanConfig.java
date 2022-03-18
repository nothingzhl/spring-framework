package org.zhl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zhl.bean.Person;

/**
 * @author zhanghanlin
 * @date 2022/3/18
 **/
@Configuration
public class BeanConfig {

	@Bean
	public Person person() {
		return new Person();
	}
}
