package sort;

import java.util.Arrays;
import java.util.Random;

public class MySort {

	public static void main(String[] args) {
		//정수 데이터를 오름차순으로 정렬합니다.
		int[] datas = new int[10];
		Random r = new Random();
		
		for(int i=0;i<datas.length ;i++) {
			datas[i] = r.nextInt(91)+10;
		}
		
		System.out.println("sort 전 : " + Arrays.toString(datas));
		
		for(int i=0;i<datas.length;i++) {
			//i=datas.length-1 일때 즉 마지막 인덱스 일때는 아래 for문은 조건식이 처음부터 거짓이므로 실행안합니다.
			for(int k=i+1;k<datas.length;k++) {
				if(datas[i]>datas[k]) {    //i가 기준 인덱스 , k는 비교 인덱스
					int temp = datas[k];
					datas[k]=datas[i];
					datas[i]=temp;
				}
			}
			System.out.println("i=" + i + ", 중간결과 : " + Arrays.toString(datas));
		}
		System.out.println("sort 후 : " + Arrays.toString(datas));
	}

}
