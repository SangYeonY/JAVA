package sort;

import java.util.Arrays;

public class IntAscendingSortTest {

	public static void main(String[] args) {
		
		int[] datas = {45,34,78,65,99,14};
		
		System.out.println("배열 초기 상태 : " + Arrays.toString(datas));
		for (int i = 0; i < datas.length; i++) {
			for (int k = i+1; k < datas.length; k++) {
				if(datas[i] > datas[k]) {
					// 교환
					int temp = datas[k];
					datas[k] = datas[i];
					datas[i] = temp;
					
				}
				
			}// k변수 for문
			System.out.println("i= " + i + ",중간결과 : " + Arrays.toString(datas));
		}// i변수 for문
		
	}

}

//i	     k    k   k		
//i = 0 , datas[0] > datas[1] , [2], [3]..... 값의 비교와 교환
//i = 1 , datas[1] > datas[2], [3], [4].....	:
//i = 2 , datas[2] > datas[3], [4], [5].....	:
//
//i = 4, datas[4] > datas[5]
//i = 5, k변수 반복 실행 안합니다.