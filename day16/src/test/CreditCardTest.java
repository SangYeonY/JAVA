package test;

import koreait.day16.KakaoMini;
import koreait.day16.KakaoVIP;

public class CreditCardTest {

	public static void main(String[] args) {
		//카드 객체 생성해서 이용한도, 카드사용을 메소드로 테스트해보세요.
		//KakaoMini 카드 객체 생성 - 이름 "모모" , 한도 5만원
		KakaoMini mini = new KakaoMini("모모");
		System.out.println("현재 한도 : " + mini.getLimit());
		mini.upLimit(50000);
		System.out.println(mini);
		System.out.println(":::::::::::::::::::::::::::::");
		
		//KakaoVIP 카드 객체 생성 - 이름 "사나" , 한도 200만원
		KakaoVIP vip = new KakaoVIP("사나", 2000000);
		System.out.println(vip);
		System.out.println(":::::::::::::::::::::::::::::");
		
		
		System.out.println("\n모모 학생이 점심 돈까스 금액 5000원 사용");
		System.out.println("\n모모 학생이 스마트폰 구매 : 금액 20만원");
		
		if(mini.pay(5000)==0) System.out.println("사용한도가 초과되었습니다.결제 승인거부!!");  
		else System.out.println("결제 승인완료!!");
		
		System.out.println(mini);
		
		System.out.println("\n사나가 스마트워치 구매 : 금액 50만원");
		vip.pay(500000); System.out.println(vip);
		
		System.out.println("\n사나가 냉장고 구매 : 금액 550만원");
		vip.pay(5500000); System.out.println(vip);
		
		System.out.println("\n모모 학생이 스마트폰 구매 : 금액 20만원");
		if(mini.pay(200000)==0) System.out.println("사용한도가 초과되었습니다.결제 승인거부!!");  
		else System.out.println("결제 승인완료!!");
		System.out.println(mini);
		

	}

}
