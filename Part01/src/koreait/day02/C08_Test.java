package koreait.day02;

public class C08_Test {

	public static void main(String[] args) {
		System.out.println("[[삼각형 넓이 구하기]]");
		int w = 23;
	    int l = 19;
	    
	    int mul=w*l;
	    System.out.println("가로"+w);
	    System.out.println("세로"+l);
	    System.out.println("넓이를구했습니다=" + mul);
	    System.out.printf("%d*%d = %dcm2\n" , w,l,mul);
	    
	    
	    final double PI = 3.14;
	    double r = 23.230;
	    double p = 3.14;
	    
	    double cir = r*PI*2;
	    double area	= PI*r*r;
	    
	    System.out.println("r * p * 2 = " + cir);
	    System.out.println("p* r * r =" + area);
	    
	    System.out.printf("%f*%f*%d = %.3f cm\n" , r,p,2,cir );
	    System.out.printf("%f*%f*%f = %.3f cm\n" , p,r,r,area );	

//	   final 테스트
//	     변수선언 앞에 final 키워드를 붙이면 값을 변경하지 못합니다
	    
	    final int test = 123;
	    
	   System.out.println("test =" + test);
	   
	   
	    
//	    
	}

}
