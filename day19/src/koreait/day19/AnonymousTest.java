package koreait.day19;

public class AnonymousTest {
	//익명 내부클래스(Anonymous Inner Type) 연습합니다.
	
	public static void main(String[] args) {
		
//		RemoteControl rc = new RemoteControl();
//		Animal animal = new Animal();
//			오류 : 인터페이스와 추상클래스는 직접 객체를 생성하지 않습니다.		
		
		RemoteControl rc = new RemoteControl() {	//Anonymous Inner Type - 한번만 사용할 클래스
			//추상메소드 정의
			@Override
			public void turnOnOff() {
				System.out.println("전원 On/Off");
				
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("볼륨 up/down :" + volume);
				
			}
		};	//익명클래스 정의 끝날 때 ;
		
		
		rc.turnOnOff();
		rc.setVolume(10);
		rc.setBattery();
		rc.setMute(false);
		
		Animal animal = new Animal() {
			
			@Override
			public void sound() {
				System.out.println("아직 모릅니다.");
				
			}
		};
		
		animal.sound();
		
	}
}
