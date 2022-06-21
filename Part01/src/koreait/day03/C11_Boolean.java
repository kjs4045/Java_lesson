package koreait.day03;

import java.util.Scanner;

public class C11_Boolean {

	public static void main(String[] args) {

		/*
		 * 데이터의 기본 형식 : boolean 은 true 또는 false 값을 형식. (Boolean 래퍼 클래스 있습니다.)
		 * 
		 * 관계 연산 ==, != , > , < , >= , <=   이 연산의 값은 boolean 형식
		 * 논리 연산 && , ||(or) , !
		 * 참고 : if , for 에서 필요한 조건식에 관계 연산이 사용 됩니다.
		 */
	
		boolean result;
		
	    result = 10 > 5;
	    System.out.println("10 > 5 결과 :" + result);
	    
        System.out.println("9 == 9 결과 :" + (9==9));	
	
        int korean,math;
		Scanner sc=new Scanner(System.in);
		System.out.println("국어 점수를 입력 하세요: " );
		korean = sc.nextInt();
		System.out.println("수학 점수를 입력 하세요: ");
		math = sc.nextInt();
        
        
	    		
	    
	    //국어점수와 수학점수 모두 80점 이상인가?  -> 모범 학생
	    System.out.println("모범 학생?" +(korean>=80 && math>=80));
	    
	    //국어점수 또는 수학 점수 중에 90점 이상이 있는가? - > 특기 학생
	    System.out.println("특기 학생?" + (korean>=90 || math>=90));
	    
	    
	    //국어 점수가 20~80 이 아닌 학생들은? -> 특이한 학생.
	    System.out.println("특이한 학생? " + !(korean>=20 && korean<=80));
	   
	    
//	    !(korean>=20 && korean<=80)) 과 같은 조건 korean<20 || korean >80
	    
	    System.out.println("논리연산 결과 확인하기 : and");
		System.out.println(" true and true = " + (true && true));
		System.out.println(" true and false = " + (true && false));
		//아래의 2개 논리식은 첫번째 값이 false 이므로 두번째 값은 don't care
		System.out.println(" false and true = " + (false && true));
		System.out.println(" false and false = " + (false && false));
		
		System.out.println("논리연산 결과 확인하기 : or");
		//아래의 2개 논리식은 첫번째 값이 true 이므로 두번째 값은 don't care
		System.out.println(" true or true = " + (true || true));
		System.out.println(" true or false = " + (true || false));
		System.out.println(" false or true = " + (false || true));
		System.out.println(" false or false = " + (false || false));

		System.out.println("논리연산 결과 확인하기 : not");
		System.out.println(" not ture = " + !true);    //true 값을 반대(not)값으로 바꿈
		System.out.println(" not false = " + !false);

	    sc.close();
	}
	
	

}
