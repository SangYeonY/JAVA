package koreait.day11;

public class ClassCC extends ClassC{
	int cc;		//자식클래스만의 필드

/*	
	public ClassCC(int c) {
		super(c);	//부모클래스의 생성자 호출 : 없는 형식이므로 오류
	}
*/	
	public ClassCC(int cc) {
		this.cc = cc;		//현재 자식 클래스의 필드를 다루는것은 가능
	}
}

//super() : 부모클래스 생성자 ClassC() 호출
//super(c) :       "     ClassC(c) 호출
