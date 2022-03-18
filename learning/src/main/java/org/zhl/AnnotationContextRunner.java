package org.zhl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.zhl.bean.Person;
import org.zhl.config.BeanConfig;

/**
 * @author zhanghanlin
 * @date 2022/3/18
 **/
public class AnnotationContextRunner {

	public static void main(String[] args) {
		final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

		final Person bean = ctx.getBean(Person.class);

		bean.sayHi();
	}
}
