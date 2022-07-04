package org.zhl;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zhl.bean.Person;

/**
 * @author zhanghanlin
 * @date 2022/7/1
 **/
public class XMLContextRunner {

	public static void main(String[] args) {
		final ClassPathXmlApplicationContext classPathXmlApplicationContext =
				new ClassPathXmlApplicationContext("classpath:Spring-Learning.xml");
		final Person person = classPathXmlApplicationContext.getBean("person", Person.class);
		person.sayHi();
	}
}
