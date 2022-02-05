package koreait.day14;

public class Cat extends Animal{
	
	static final String TYPE="고양이";
	
	public Cat() {
	}
	
	public Cat(String name,String color) {
		super(name,color);
	}
	
	@Override
	public void sound() {
		// 추상메소드 구현합니다.
		System.out.println("고양이🐱🐱는 야옹야옹 대화합니다.");
	}
	
	@Override
	public String toString() {
		return super.toString() +  TYPE;   //super는 Animal 클래스 toString
	}

}
