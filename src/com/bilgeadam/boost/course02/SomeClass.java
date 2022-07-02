package com.bilgeadam.boost.course02;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SomeClass<MembersType, MapKey, MapValue> {
	private String name;
	private int age;
	private String color;
	private List<MembersType> members;
	private Map<MapKey, MapValue> maps;
	
	
	public SomeClass(String name, int age, String color) {
		super();
		this.name    = name;
		this.age     = age;
		this.color   = color;
		this.members = new ArrayList<>();
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public List getMembers() {
		return this.members;
	}
	public void setMembers(List members) {
		this.members = members;
	}
}
