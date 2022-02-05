package koreait.day17;

import java.util.Comparator;

public class MemberNameAscending implements Comparator<Member>{
//Member 클래스 비교 기준 : 이름 오름차순
	@Override
	public int compare(Member o1, Member o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}
