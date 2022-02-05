package koreait.day16_interface;

public interface InterfaceA {

//오늘의 주제 : 인터페이스 (클래스의 상속, 추상클래스의 추상메소드가 관련성 있는 내용입니다.)	
/*   자바인터페이스의 특징
 *   1. 객체를 생성하지 않습니다.
 *   2. 필드는 상수만 있습니다.		public static final 생략합니다.
 * 	 3. 추상메소드를 갖고 있습니다.    public abstract  생략합니다. 
 *   4. static 메소드와 인스턴스메소드(반드시 키워드 default 사용) 도 사용할 수 있습니다.
 *   
 *   자바 객체지향프로그래밍 특징 : 다형성. 인터페이스는 다형성 구현을 위한 대표적인 방법입니다.
 */
	
		//2.
		int SIZE=10;
		
		//3.
		void methodA();
		int methodB(int num);
		
		//4. 접근한정자: public 
		static void methodC() {
			System.out.println("나는 static 메소드 입니다.");
		}
		
		default void methodD(String message) {
			System.out.println("수신된 메시지는 " + message +" 입니다.");
		}
	
}
