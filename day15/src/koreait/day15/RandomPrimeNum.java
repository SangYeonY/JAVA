package koreait.day15;

import java.util.Arrays;
import java.util.Random;

public class RandomPrimeNum {
	
	static final int NUM=10;
	
	public static void main(String[] args) {
// 주어진 난수 범위에서 소수를 7개 만듭니다. (*난수가 소수인지 판별해서 그 값이 7개가 되면 반복 종료*) 소수 7개는 배열 저장하여 출력합니다.
// 범위 100~999 -> 수식만들어서 하세요.		
		Random r = new Random();
		
		long start = System.currentTimeMillis();		//현재시간을 ms(0.001초) 단위로 가져옵니다.형식은 long
		
		int[] primenum = new int[NUM];
		int cnt=0,max=999999999,min=333333333;
		while(cnt<NUM) {
			int temp = r.nextInt(max-min+1)+min;
			if(isPrime(temp)) 
				primenum[cnt++]=temp;
			
		}
		long end = System.currentTimeMillis();
		System.out.println("실행시간 = " + (end-start) + " ms 소요되었습니다.");	//0ms 는 매우 짧은시간이 걸렸다는 뜻.
		
		System.out.println(Arrays.toString(primenum));
		
	}

	// -> 주어진 정수값이 소수인지 판별하는 메소드를 만들어 봅시다.(메소드 이름 isPrime, 리턴형식은 boolean, 인자는 정수1개)
	//메소드 부터 만들어보세요.
	
	static boolean isPrime(int num) {
		boolean isPrime = true;
		
		for(int i=2;i<Math.sqrt(num);i++) {		//조건은 *i<num , **i<num/2  , ***i<Math.sqrt(num)
							//num이 소수일때 반복횟수가 가장 작은 조건식은 ? i<Math.sqrt(num) 입니다.
			if(num % i == 0) {  //나누어 떨어진다.(나머지가 0)
				isPrime=false;
				break;
			}	
		}
		return isPrime;
	}
	
}
