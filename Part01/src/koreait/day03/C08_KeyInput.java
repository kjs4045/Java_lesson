package koreait.day03;

import java.util.Scanner;

public class C08_KeyInput {

	public static void main(String[] args) {
		//������ ���� ������ ����
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int width;
	    int height;
	    
		double radius;
        double area;
        double round;
		final double PI = 3.14;
		
		
		System.out.println("[[�ﰢ�� ���� ���ϱ�]]");
	    
	    System.out.println("width ���� �Է� �ϼ��� -> ");
	    width=sc.nextInt();
	    System.out.println("height ���� �Է� �ϼ��� -> ");
	    height=sc.nextInt();
	    
	    int mul=width*height;
	    
	    System.out.println("�ﰢ���� ���̴� = " + mul);
	    
	    System.out.println("\n [[�� ������ ���̿� �ѷ� ���ϱ�]]");
	    
	    
	    
	    
	    
	    
	    System.out.println("������ ���� �Է��ϼ���. ");
	    radius=sc1.nextDouble();
	    //23.23
	     area = radius*radius*PI;
	     round = radius*2*PI;
	    System.out.println("���� ���̴�? " + area);
	    
	    System.out.println("���� �ѷ���? " + round);
	    
	    
	   	sc.close();   //Ű����(ǥ���Է���ġ) �ڿ� ��� ����.


	   
	
	    
//	    
	}

}