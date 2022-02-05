package koreait.day17;

import java.util.Comparator;

public class MemberNameDescending implements Comparator<Member>{
//Member 클래스 비교 기준 : 이름 내림차순
	@Override
	public int compare(Member o1, Member o2) {
		// TODO Auto-generated method stub
		return o2.getName().compareTo(o1.getName());
	}
}
