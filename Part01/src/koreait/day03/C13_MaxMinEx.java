package koreait.day03;
//작성자 김종성
import java.util.Scanner;

public class C13_MaxMinEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1,n2,n3;
		int max;
		int max1;
        System.out.println("n1 값을 입력하세요");
        n1 = sc.nextInt();
        System.out.println("n2 값을 입력하세요");
        n2 = sc.nextInt();
        System.out.println("n3 값을 입력하세요");
        n3 = sc.nextInt();
	
        if(n1>n2)        {
        max = n1;
        }
        else {
        	max = n2;
        }
	     if(max>n3) {
	    	 max1=max;
	     }
	     else {
	    	 max1=n3;
	     }
	System.out.println("세개 중 가장 큰 값은 = " + max1 + " 입니다.");
	
	sc.close();
	}

}
//김종성