package koreait.day02;


//참고: 자바 프로그래밍언어에서는 클래스 이름과 파일명이 동일하게 합니다.

public class C07_CastingTest {

	public static void main(String[] args) {
 
		
		
		
		 //대입문 = 오른쪽 값(리터럴)/수식/변수가 왼쪽 변수로 대입. 
         // 수식에 사용되는 연산자     
//		: 산술 연산 + , - , * , / , %(나눗셈 나머지)
//		                 관계 연산 == (동등,같다.) , != (같지 않다.) , > (크다) , < , >= , <=
//		                 논리 연산  &&(and), || (or) , !(not, 거짓 또는 반대) 
//	        참고: ++ , -- , += , -= , /= , /= 과 같은 축약연산자 진도 예정
//		  정수형식의 연산은 integer를 이용 특수한상황에만 byte, short, long 사용
		
		int a = 123, b = 13;
		double c=10.99;
//		연산에 사용되는 피연산자(123,13)가 모두 정수이면 결과는 정수
//		연산에 사용되는 피연산자가 정수, 실수 경우라면 결과는 실수
//		           -> 연산 결과를 변수에 저장할 때 데이터 형식을 고려합니다.
		
		int isum;
		double dsum;
		
		isum = a+b;
		dsum = a+c;
		
		System.out.println("a+b=" + isum);
	    System.out.println("a+c=" + dsum);
	    
//	    isum = a + c;   오류 = 결과가 실수이므로 정수형식 변수에 저장 불가.

	    //	    형변환 : 정수 + 실수 결과를 꼭 정수 변수에 저장해야 한다면. 실수를 정수로 변환해서 연산을 합니다. casting
        isum = a + (int)c; //< casting -> 프로그래머가 결정해서 강제로 형변환 -> ()안에 변환시킬 형식 작성
        
        System.out.println("a+ (int)c ="  + isum); //뒤에 소수점을 쳐냄
        
        
        b=10;
		System.out.println(" a / b =" + (a/b));  //정수끼리 나누면 결과 정수
		System.out.println(" a % b =" + (a%b));  //정수끼리 나누기의 나머지
		
	    System.out.printf("%d / %d = %d\n", a,b,a/b);
	    System.out.printf("%d %% %d = %d\n", a,b,a%b);

//	        강제형변환 (캐스팅) 예시 : 정수끼리의 나눗셈 결과를 실수로 구하는 처리조건일때.
//	         -> 정수 1개를 실수로 변환
	    
	    System.out.printf("%d / %d = %s\n", a,b,a/(double)b);
	   
	    b=11; 
	    System.out.printf("%d / %d = %.2f\n", a,b,a/(double)b);
	
	    //%f 식수형식문자
	    
	    double test = 12.3456123456789;
	    System.out.println("test = " + test);
	    System.out.printf("test = %f\n", test);
	    System.out.printf("test = %.15f\n", test);
	    
	    
	    
	    int w = 23;
	    int l = 19;
	    
	    int mul=w*l;
	    
	    System.out.println("w*l =" + mul);
	    System.out.printf("%d*%d = %dcm2\n" , w,l,mul );
	    
	    double r = 23.230;
	    double p = 3.14;
	    
	    double cir = r*p*2;
	    double area	= p*r*r;
	    
	    System.out.println("r * p * 2 = " + cir);
	    System.out.println("p* r * r =" + area);
	    
	    System.out.printf("%f*%f*%d = %.3f㎠\n" , r,p,2,cir );
	    System.out.printf("%f*%f*%f = %.3f㎠\n" , p,r,r,area );		
	    		
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	
	} 

}
