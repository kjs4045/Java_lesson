package koreait.day12;

import java.util.ArrayList;

public class C47_MemberTest {

	public static void main(String[] args) {
		//Member[] members = new Member[10];
		ArrayList<Member> list = new ArrayList<>(); //리스트에 저장되는 것은 객체의 참조 값. 

		list.add(new Member("모모",27));
		Member member = new Member("다현", 26);
		list.add(member);
		list.add(new Member("나나",20));
		list.add(new Member("신비",22));
		
		System.out.println("현재 list의 요소 개수는 : " + list.size());
		System.out.println("1.전체 리스트 출력");
		System.out.println(list);
		//list.get(i)  -> member 객체의 참조값
		System.out.println("\n2. list의 요소 중 age의 필드 값이 25 이하인 것만 출력해보기");

		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getAge()<=25)
				System.out.println("i=" + i + ", " + list.get(i));
			
		}
		System.out.println("\n3. '나나'는 몇번 인덱스에서 참조하고 있는 객체인가?");
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals("나나"));
			
			System.out.println("i=" + i + ", " + list.get(i));
		}
		
		//리스트 요소가 여러개의 필드를 갖는 객체이면 필드값 비교하는 equals 예제 입니다.
		//                                    indexOf는 String, 기본형 래퍼클래스만 사용합니다.
		
		System.out.println("Member 객체로 indexOf 실행: " + list.indexOf(new Member("나나",20)));                //이름나나 필드값20 찾기위해 이것보단
		//-1, 못찾음 (이유: 참조값이 같은 것을 찾는것인데 이것을 필드값 비교해서 찾도록 바꾸어 주는 기능 구현이 필요합니다.)
		System.out.println("Member 객체로 indexOf 실행: " + list.indexOf(member)); //1
		for(int i=0;i<list.size();i++) {                                                                    //이걸로
			if(list.get(i).getName().equals("나나")&&list.get(i).getAge()==20)
			
			System.out.println("i=" + i + ", " + list.get(i));
		
		
	}
	    
	}
	}
