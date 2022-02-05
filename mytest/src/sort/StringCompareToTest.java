package sort;

public class StringCompareToTest {

	public static void main(String[] args) {
		// 배열에 저장된 값은 참조(데이터의 주소)값이다.
		// 참조값으로 접근한 문자열은 >,< 로 비교하지 않는다. compareTo 메소드로 비교합니다.
		// 사전식 비교(알파벳 또는 가나다 순서)
		String[] names = {"boa","momo","nayeon","zun","nana"};
		
		System.out.println("문자열비교1 : " + "boa".compareTo("nana"));
		System.out.println("문자열비교1 : " + "momo".compareTo("nana"));
		System.out.println("문자열비교2 : " + "nana".compareTo("boa"));
		System.out.println("문자열비교2 : " + "nana".compareTo("momo"));
		
		//abcdefghijklmnopqrstuvwxyz 
		System.out.println("한글문자열비교1 : " + "고양이".compareTo("염소"));	// 왼 < 오  -
		System.out.println("한글문자열비교1 : " + "고양이".compareTo("고양니"));	// 왼 > 오  +
		System.out.println("한글문자열비교1 : " + "다람쥐".compareTo("고양이"));	// 왼 > 오  +
		
		
		System.out.println("문자열비교3 : " + "nana".compareTo("nana"));	// 0
		

	}

}
