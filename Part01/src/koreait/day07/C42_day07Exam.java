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
		 String no[]= {"����1 ","����2 ","����3 ","����4 ","����5 "};
		 
		 for(int i=0;i<5;i++) {
			 
			 arr1[i]=r.nextInt(99)+1;
			 arr2[i]=r.nextInt(99)+1;
			 sum=arr1[i]+  arr2[i];
			 			 System.out.print(no[i]);
			 System.out.print(arr1[i]+ "+" +  arr2[i]+ "= ");
			 
			 System.out.print("������� ��");
			 answer=sc.nextInt();

			 if(answer==sum) 
			 { System.out.println("�����Դϴ�!");
			    correct++;
			 
			 }
			 else
				 System.out.println("�����Դϴ�");
			 if(answer!=sum)
	    		  System.out.println(arr1[i]+ "+" +  arr2[i]+ "= "+sum);
				 }
		
		 System.out.println("ä���մϴ�. ���� ���� = " + correct + "("+ (correct*20)+ ")��");
		      System.out.println(":::::::::::Ʋ�� ���� ���� ����:::::::::");
		      for(int i=0;i<5;i++) {
		
		    		  System.out.println(arr1[i]+ "+" +  arr2[i]+ "= "+sum);
		      }
	
			    	 
		    	  
		      }
		     
		 
				 }
			 
			 		
			 
			 
		 
		
		 
	


