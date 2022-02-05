package koreait.day15;

public class Member {
	
	private String name;
	private int age;
	
	public Member(String name,int age) {
		this.name=name;
		this.age= age;
	}
	
	@Override
	public String toString() {
		return "name:" + name + ", age:" + age ;
	}

}
