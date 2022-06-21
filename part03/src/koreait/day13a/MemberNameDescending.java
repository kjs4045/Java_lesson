package koreait.day13a;

import java.util.Comparator;

import koreait.day12.Member;

//Member ��ü�� sort : �񱳰����� ������ �ʵ� �� �ϳ��� �����ؼ� ����(Comparator) ����ü ����ϴ�.
public class MemberNameDescending implements  Comparator<Member>{
	
	@Override
	public int compare(Member o1, Member o2) {
		
			
			return o1.getName().compareTo(o2.getName());
	}		//�������� : age1>age2 �϶� 1�� ����
	
		/* ���Ͻ��� �������� ������ ��츦 ���ϴ�. ��ȯ���� �ʴ� ��츦 -1(����)�� ���ϵǰ� �մϴ�.
		 * ���� ��ȯ���� �ʴ� ���� 
		 *�������� : o1 < o2    	//�������� : o1 > o2 
		*/

		
	}
	
