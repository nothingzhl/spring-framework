package org.zhl.bean;

/**
 * @author zhanghanlin
 * @date 2022/3/18
 **/
public class Person implements Action {

	private String skill;
	private String name;

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public void sayHi() {
		System.out.println("hi");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void action() {
		System.out.println(this.getClass().getSimpleName());
	}
}
