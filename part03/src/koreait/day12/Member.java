package koreait.day12;

import java.util.Set;

public class Member {
	private String name;
	private int age;
	protected boolean valid;
	
	public Member(String name, int age) {
		this.name=name;
		this.age=age;
		
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", valid=" + valid + "]";
	}
	
	

}
