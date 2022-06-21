package koreait.day07;

import java.util.Random;
import java.util.Scanner;

public class C42_day07Exam {

	public static void main(String[] args) {

		 Scanner sc= new Scanner(System.in);
		 Random r = new Random();

		 int[] arr1 = new int[5];
		 int[] arr2 = new int[5];
		 
		 int sum =0;
		 int answer;
		 int correct=0;
		 String no[]= {"문제1 ","문제2 ","문제3 ","문제4 ","문제5 "};
		 
		 for(int i=0;i<5;i++) {
			 
			 arr1[i]=r.nextInt(99)+1;
			 arr2[i]=r.nextInt(99)+1;
			 sum=arr1[i]+  arr2[i];
			 			 System.out.print(no[i]);
			 System.out.print(arr1[i]+ "+" +  arr2[i]+ "= ");
			 
			 System.out.print("사용자의 답");
			 answer=sc.nextInt();

			 if(answer==sum) 
			 { System.out.println("정답입니다!");
			    correct++;
			 
			 }
			 else
				 System.out.println("오답입니다");
			 if(answer!=sum)
	    		  System.out.println(arr1[i]+ "+" +  arr2[i]+ "= "+sum);
				 }
		
		 System.out.println("채점합니다. 맞은 개수 = " + correct + "("+ (correct*20)+ ")점");
		      System.out.println(":::::::::::틀린 문제 정답 보기:::::::::");
		      for(int i=0;i<5;i++) {
		
		    		  System.out.println(arr1[i]+ "+" +  arr2[i]+ "= "+sum);
		      }
	
			    	 
		    	  
		      }
		     
		 
				 }
			 
			 		
			 
			 
		 
		
		 
	


