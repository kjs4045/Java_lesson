package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {

	public static void main(String[] args) {
        
		 Scanner sc= new Scanner(System.in);
		 
		 String best;
		 
		 int korean, english, science;
		 int best1;
		 
		 
		 int total;
		 int average;
		 
	     System.out.println("[[성적 집계 : 평균과 총점 구하기]]");
         
	     System.out.println("성적을 입력하세요.");
	     System.out.print("국어");
	     korean = sc.nextInt();
	     System.out.print("영어");
	     english = sc.nextInt();
	     System.out.print("과학");
	     science = sc.nextInt();
         
         System.out.println("처리 되었습니다.");
	     
	     
	     total   = korean+english+science;
	     average = (total/3); 
	     
	     System.out.println("총점->" + total);
	     System.out.println("평균->" + average);
	     
	     if(korean>english)
	    	 {
	    	 best="국어";
	         best1=korean;
	         }
	    	else {best="영어";
	    	best1=english;}
	    	
	     if(best1>science) 
	          best="국어";
	     else best="과학";
	     
	     
	     
	     
	     
	     System.out.printf("이 학생의 특기과목은 %s (%d) 입니다.",best,best1);
	     
	     sc.close();
         
	}

}
