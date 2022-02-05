package sort;

import java.util.Arrays;

public class StringAscendingSortTest {

	public static void main(String[] args) {
		String[] names = {"iu","boa","nayeon","zun","twice","nana"};
		
		// 오름차순으로 정렬해보세요.
		System.out.println("배열 초기 상태 : " + Arrays.toString(names));
		for (int i = 0; i < names.length; i++) {
			for (int k = i+1; k < names.length; k++) {
				if(names[i].compareTo(names[k]) > 0) {
					//참조값을 교환합니다.
					String temp = names[k];
					names[k] = names[i];
					names[i] = temp;
				} //for k문
			} // for i문
			System.out.println("i= " + i + ",중간결과 : " + Arrays.toString(names));
			
		}
		
		
		
		
		
		
	}

}
