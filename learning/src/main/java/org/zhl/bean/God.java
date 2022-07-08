package org.zhl.bean;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @author zhanghanlin
 * @date 2022/7/6
 **/
public class God implements Action, MethodReplacer {

	private String skill;

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public void killSome() {
		System.out.println("i will kill " + this.skill);
	}

	@Override
	public void action() {
		System.out.println(this.getClass().getSimpleName());
	}

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		this.action();
		return null;
	}
}
