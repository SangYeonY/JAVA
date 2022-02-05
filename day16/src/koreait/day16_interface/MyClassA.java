package koreait.day16_interface;


//이 클래스는 인터페이스 InterfaceA를 사용합니다.
public class MyClassA implements InterfaceA{

	//InterfaceA에 선언된 추상메소드를 구현하는 것이 핵심입니다.
	
	@Override
	public void methodA() {
		System.out.println("MyClassA - methodA 실행");
	}
	
	@Override
	public int methodB(int num) {
		System.out.println("MyClassA - methodB 실행 (arg: "+num + ")");
		return num+10;
	}
	
	
}
