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
		 
	     System.out.println("[[���� ���� : ��հ� ���� ���ϱ�]]");
         
	     System.out.println("������ �Է��ϼ���.");
	     System.out.print("����");
	     korean = sc.nextInt();
	     System.out.print("����");
	     english = sc.nextInt();
	     System.out.print("����");
	     science = sc.nextInt();
         
         System.out.println("ó�� �Ǿ����ϴ�.");
	     
	     
	     total   = korean+english+science;
	     average = (total/3); 
	     
	     System.out.println("����->" + total);
	     System.out.println("���->" + average);
	     
	     if(korean>english)
	    	 {
	    	 best="����";
	         best1=korean;
	         }
	    	else {best="����";
	    	best1=english;}
	    	
	     if(best1>science) 
	          best="����";
	     else best="����";
	     
	     
	     
	     
	     
	     System.out.printf("�� �л��� Ư������� %s (%d) �Դϴ�.",best,best1);
	     
	     sc.close();
         
	}

}
