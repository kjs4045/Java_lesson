package koreait.day03;
//작성자 김종성
import java.util.Scanner;

public class C13_MaxMinEx2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1,n2,n3;
		int max,min;
		
        System.out.print("n1 >>>");
        n1 = sc.nextInt();
        System.out.print("n2 >>>");
        n2 = sc.nextInt();
        System.out.print("n3 >>>");
        n3 = sc.nextInt();
	    System.out.printf("n1=%d\t n2=%d\t n3=%d\n",n1,n2,n3);
        if(n1>n2)        {
        max = n1; 
        min = n2;
        }
        else {
        	max = n2;
        	min = n1;
        }
	     if(max<n3) max = n3;
	    	
	     if(min>n3) min=n3;
	     
	      //위에 if문의 max 는 임시 max값 임시 max 값보다 남은 1개의 값(n3)이 크면 n3이 최종 max값
	     
	System.out.println("max = " + max);
	System.out.println("min = " + min);
	System.out.printf("max=%d\t min=%d\n",max,min);
	sc.close();
	}

}
