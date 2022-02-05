package koreait.day2;

public class DoubleVarTest {
	//실수 타입 변수를 연습합니다.
	
	
	public static void main(String[] args) {
		
		//1. 선언
		float p1;
		double p2;
		
		//2. 데이터 저장
		p1 = 3.1415f;     //float 형식으로 데이터를 표시할 때에서는 f(F)를 표기합니다.
		p2 = 3.1415;
		
		//3. 변수 사용 : 연산
		p2 = p2 * 1.1;
//		p1 = p1 * 1.1;	
// 등호 오른쪽은 사칙연산결과는 double 입니다. 오류 : double 결과를 float 에 저장못합니다.
		
		//p2값 출력해보세요.
		System.out.println("변수 p2 = " + p2);  // + 는 연결기호 입니다.
		System.out.println("변수 p1 = " + p1);
		
		//실제 기계어로 실수를 표현하고 연산하는 방식은 복잡한 형식이 있습니다.실제 결과와 다를 수도 있습니다.
		System.out.println(0.1 + 1.6);
		System.out.printf("%5.2f\n",(0.1+1.6));			// %f는 실수형식. 전체 5자리, 소수점이하 2자리
	
		//실수의 특별한 연산결과
		System.out.println("Infinity (무한대) : 0.0으로 나눌때 입니다.");
		System.out.println(3.0/0.0);   // 나누기는  / 입니다.
		System.out.println("NaN(Not a Number : 제수,피젯수 모두 0.0 일때 입니다.");
		System.out.println(0.0/0.0);
		System.out.println("0.0 : 0.0을 다른수로 나눌 때 입니다.");
		System.out.println(0.0/3.0);
		
		//그렇다면 정수는 ???  -> 0으로 나눌때 오류가 발생합니다.
//		System.out.println(3/0);   //오류
//		System.out.println(0/0);   //오류
		System.out.println(0/3);	//결과 0
		
		//정수와 비교할 내용
		short s1 = 11;
//		s1 = s1 + s1;    //11+11 결과를 s1 에 저장하려고 한다. 오류
		
		float f1 = 1.2f;
		p1 = p1 + p1;    //정상
		
		//데이터 형식의 변환 : 캐스팅이라고 합니다. -> 내일 진도에서 설명하겠습니다.
	}
}
