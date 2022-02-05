package koreait.day16;

import java.text.DecimalFormat;
						//1)
public class KakaoMini extends CreditCard{
	//시나리오 : 카카오미니는 학생용 카드. 한도 최대금액 있습니다.이용한도 있습니다.
	
	//3)
	public static final int MAX_LIMIT = 100000;   //한도 최대금액
	
	//2)
	public KakaoMini(String owner) {  
		super(owner);
	}
	
	
	//5)
	@Override
	public int upLimit(int plus) {  //한도 5만원 , 조정금액+5만
		if (limit+plus > MAX_LIMIT) return 0;    
		else {
			limit +=plus;
			return plus;
		}		
	}
	
	@Override
	public int pay(int money) {
		if(payTotal+money>limit) return 0;
		else { payTotal+=money;
		return money;
		}
	}
	
	
	@Override
	public String toString() { //4)
		DecimalFormat df = new DecimalFormat("###,###,### 원");   //정수 또는 실수 값 출력패턴을 설정하는 클래스입니다.
		return owner + " 님. 이번 달 결제 예정 금액 " + df.format(payTotal) 
				+" 입니다.\n[이용한도 " + df.format(limit) + " ]";
	}
}	