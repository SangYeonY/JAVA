package koreait.day18;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StudentScoreTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//StudentScore[] stus = new StudentScore[10];
		List<StudentScore> stus = new ArrayList<>();  //대입:add 메소드, 가져오기 : get 메소드
		Random r = new Random(); 
		int max=100,min=10;		//각 과목 점수의 난수 발생 범위입니다.
		
		System.out.println("입력된 학생 인원수(1~10) 만큼 성적 데이터가 난수로 발생됩니다.");
		System.out.print("학생 인원 수를 입력해 주세요. -> ");
		//문제 2) 실행에 필요한 입력 명령문을 작성하세요.
		int num = Integer.parseInt(sc.nextLine());
		
		
		for(int i=0;i<num;i++) {
			//문제 3) 국어,영어,과학과목의 점수를 난수로 생성하여 StudentScore 객체 생성과 함께 필드값으로 저장하고 객체는 배열이 참조하는 코딩을 작성하세요.
			int korean = r.nextInt(max-min+1)+min;
			int english = r.nextInt(max-min+1)+min;
			int science = r.nextInt(max-min+1)+min;
			
			StudentScore stu = new StudentScore(i+1,korean,english,science);
			stus.add(stu);
			System.out.println("국어,영어,과학 점수가 자동으로 입력되었습니다.학생이름을 입력해 주세요.");
			System.out.print("이름 -> ");
			stus.get(i).setName(sc.nextLine());
		}
		
		System.out.println(":::::저장된 성적데이터를 확인하세요.:::::");
		DecimalFormat df = new DecimalFormat("###.00");
		for(StudentScore score : stus) {   //ArrayList 의 크기는 데이터 추가되면서 변경됩니다.
			//문제 4) 배열에 저장된 데이터를 출력하기 위해 필요한 명령을 작성하세요.null은 출력하지 않습니다.
			//if(score==null) break;  //ArrayList에서는 필요없음.
			System.out.print(score);
			System.out.println("  -총점 : " + score.sum() + " 평균 : " + df.format(score.avg()));
		}
		
		System.out.println("::::: 총점 기준 최우수 학생 이름과 점수 입니다.:::::");
		int max_sum = stus.get(0).sum();
		//문제 5) 최우수 학생을 찾기 위한 반복 명령문을 작성하세요. 변수는 아래 출력문을 참고하여 선언하세요.
		int max_idx=0;
		for(int i=0;i<num;i++) {		//num은 stus.size() 값과 같습니다.
			if(max_sum < stus.get(i).sum()) {
				max_sum= stus.get(i).sum();
				max_idx=i;
			}
		}
		System.out.println("최우수 학생 : " + stus.get(max_idx).getName() + "(총점 :" + stus.get(max_idx).sum() 
				+ ",평균 :" + df.format(stus.get(max_idx).avg())+ ")");
	}

}
