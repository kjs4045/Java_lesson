package koreait.day12;

import java.util.ArrayList;

public class C47_MemberTest {

	public static void main(String[] args) {
		//Member[] members = new Member[10];
		ArrayList<Member> list = new ArrayList<>(); //����Ʈ�� ����Ǵ� ���� ��ü�� ���� ��. 

		list.add(new Member("���",27));
		Member member = new Member("����", 26);
		list.add(member);
		list.add(new Member("����",20));
		list.add(new Member("�ź�",22));
		
		System.out.println("���� list�� ��� ������ : " + list.size());
		System.out.println("1.��ü ����Ʈ ���");
		System.out.println(list);
		//list.get(i)  -> member ��ü�� ������
		System.out.println("\n2. list�� ��� �� age�� �ʵ� ���� 25 ������ �͸� ����غ���");

		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getAge()<=25)
				System.out.println("i=" + i + ", " + list.get(i));
			
		}
		System.out.println("\n3. '����'�� ��� �ε������� �����ϰ� �ִ� ��ü�ΰ�?");
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals("����"));
			
			System.out.println("i=" + i + ", " + list.get(i));
		}
		
		//����Ʈ ��Ұ� �������� �ʵ带 ���� ��ü�̸� �ʵ尪 ���ϴ� equals ���� �Դϴ�.
		//                                    indexOf�� String, �⺻�� ����Ŭ������ ����մϴ�.
		
		System.out.println("Member ��ü�� indexOf ����: " + list.indexOf(new Member("����",20)));                //�̸����� �ʵ尪20 ã������ �̰ͺ���
		//-1, ��ã�� (����: �������� ���� ���� ã�°��ε� �̰��� �ʵ尪 ���ؼ� ã���� �ٲپ� �ִ� ��� ������ �ʿ��մϴ�.)
		System.out.println("Member ��ü�� indexOf ����: " + list.indexOf(member)); //1
		for(int i=0;i<list.size();i++) {                                                                    //�̰ɷ�
			if(list.get(i).getName().equals("����")&&list.get(i).getAge()==20)
			
			System.out.println("i=" + i + ", " + list.get(i));
		
		
	}
	    
	}
	}
