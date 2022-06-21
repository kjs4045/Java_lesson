package koreait.day03;

import java.util.Scanner;

public class C08_KeyInput {

	public static void main(String[] args) {
		//가급적 변수 선언은 앞쪽
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int width;
	    int height;
	    
		double radius;
        double area;
        double round;
		final double PI = 3.14;
		
		
		System.out.println("[[삼각형 넓이 구하기]]");
	    
	    System.out.println("width 값을 입력 하세요 -> ");
	    width=sc.nextInt();
	    System.out.println("height 값을 입력 하세요 -> ");
	    height=sc.nextInt();
	    
	    int mul=width*height;
	    
	    System.out.println("삼각형의 넓이는 = " + mul);
	    
	    System.out.println("\n [[원 도형의 넓이와 둘레 구하기]]");
	    
	    
	    
	    
	    
	    
	    System.out.println("반지름 값을 입력하세요. ");
	    radius=sc1.nextDouble();
	    //23.23
	     area = radius*radius*PI;
	     round = radius*2*PI;
	    System.out.println("원의 넓이는? " + area);
	    
	    System.out.println("원의 둘레는? " + round);
	    
	    
	   	sc.close();   //키보드(표준입력장치) 자원 사용 해제.


	   
	
	    
//	    
	}

}
