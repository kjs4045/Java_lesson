package koreait.day08a;

import koreait.day08.MyClass1;

public class Myclass1Test {

	public static void main(String[] args) {

		
		 //MyClass1 객체 생성
		MyClass1 my = new MyClass1(); //public 클래스이지만 다른 패키지의 클래스는 임포트가 필요
		
		
		//패키지가 다른 MyClass1 클래스 필드 중 사용할 수 있는것은?         답 : pint
//		 							default(package) 한정자 필드 name, 메소드 getAge,setAge 사용 못함.
	//	my.name="momo";        //오류 default값 사용 불가
		my.point=1.234;        //가능 퍼블릭 한정자
		//my.age=23;           
	//	my.setAge(23);         
		//System.out.println("age =" +my. age); //오류 : private 한정자 필드
	//	System.out.println("age =" +my.getAge()); 
	//	my.setAge(-100);
	//	System.out.println("age =" +my.getAge());
		System.out.println("point = " + my.point); //public 접근 한정자 필드
	//	System.out.println("name =" + my.name); 
		
		//Score 클래스 필드,메소드의 한정자가 모두 default 입니다.
				//     		ㄴnew 객체 생성은 될까요? 답 class는 public 한정자이므롤 생성됩니다.
		
//		Score score = new Score();		
		
//접근 한정자 테스트는 자바에서 제공되는 클래스들을 이해하고 우리가 만들 클래스에도 사용
}
}