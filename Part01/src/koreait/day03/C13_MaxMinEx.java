package koreait.day03;
//�ۼ��� ������
import java.util.Scanner;

public class C13_MaxMinEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1,n2,n3;
		int max;
		int max1;
        System.out.println("n1 ���� �Է��ϼ���");
        n1 = sc.nextInt();
        System.out.println("n2 ���� �Է��ϼ���");
        n2 = sc.nextInt();
        System.out.println("n3 ���� �Է��ϼ���");
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
	System.out.println("���� �� ���� ū ���� = " + max1 + " �Դϴ�.");
	
	sc.close();
	}

}
//������