package koreait.day13a;

import java.util.Comparator;

import koreait.day12.Member;

//Member ��ü�� sort : �񱳰����� ������ �ʵ� �� �ϳ��� �����ؼ� ����(Comparator) ����ü ����ϴ�.
public class MemberNameAscending implements  Comparator<Member>{
	
	



	@Override
	public int compare(Member o1, Member o2) {
		
		return o2.getName().compareTo(o1.getName());
	}

	

	

}
