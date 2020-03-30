package com.wangchuchao.common.utils;

import java.util.Date;
/**
 * 
 * @ClassName: Person 
 * @Description: Person类
 * @author: 61466
 * @date: 2020年3月30日 下午3:18:42
 */
public class Person {
	private String name;//姓名
	private int age;//年龄
	private String about;//介绍
	private Date created;//注册日期
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Person(String name, int age, String about, Date created) {
		super();
		this.name = name;
		this.age = age;
		this.about = about;
		this.created = created;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", about=" + about + ", created=" + created + "]";
	}
	
	
}
