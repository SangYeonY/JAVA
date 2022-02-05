package koreait.day17;

public class Member {   //Member 타입은 비교가능한 객체가 아닙니다. -> sort할때 Comparator (비교자) 인자로 전달해야 합니다.
	
	private String name;
	private int age;
	
	public Member(String name,int age) {
		this.name=name;
		this.age= age;
		System.out.println("새로운 회원 <"+this.name+"> 님 환영합니다.");
	}
	
	
	@Override
	public String toString() {
		return "(name=" + name + ", age=" + age + ")";
	}

	//getter
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
}
