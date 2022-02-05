package sort;

public class SwapTest {
// 두개의 변수값을 서로 바꾸기 위해 temp 변수를 사용합니다.
	public static void main(String[] args) {
		int a = 11, b = 22;
		int temp;
		
		temp = b;
		b = a;
		a = temp;
		System.out.println("a = " + a + ",b = " + b);
	
	}

}
