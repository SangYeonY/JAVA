package koreait.day16;

public abstract class CreditCard {
		//1) *부모클래스는 자식클래스가 사용하도록 protected 로 합니다.
	
			protected String owner;	//소유자
			protected int limit;	//총이용한다.
			protected int payTotal;	//이용(결제)금액
			
		//2)	
			public CreditCard(String owner) {
				this.owner = owner;
			}
			
		//4)			
			public abstract int upLimit(int plus);
			public abstract int pay(int money) ;
		
		//3)	
			public int getLimit() {
				return limit;
			}
			
			public String getOwner() {
				return owner;
			}
			
			public int getPayTotal() {
				return payTotal;
			}
			
			
}
