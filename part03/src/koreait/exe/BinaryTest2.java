package koreait.exe;

import java.util.Scanner;

public class BinaryTest2 {

	public static void main(String[] args) {

			int n10 = 123;
			int n16 = 0xa41c;     //16���� ǥ��
			int n2 = 0b1010010000011100;        //2���� ǥ��
			
			System.out.println("1. ������ �״�� ���");
			System.out.println("10���� ���ͷ� 123 " + n10);
			System.out.println("16���� ���ͷ� 0xa41c " + n16);		//������ ����� foramt ���� ���ϸ� 10����
			System.out.println("2���� ���ͷ� 0b1010010000011100 " + n2);
	
			System.out.println("2. format �����Ͽ� 16���� ���");
			System.out.println(String.format("16���� ���ͷ� 0xa41c : %x", n16));      //16���� ����%x
			System.out.println(String.format("2���� ���ͷ� 0b1010010000011100 : %x", n2));      
			System.out.println(String.format("10���� ���ͷ� 42012 : %x" , 42012));      
			//��� : 10���� 42012 , n16�� n2 ���� ���� �޸𸮿� ����� ���� ��� ������ 0,1 ǥ�����Դϴ�.
			
			System.out.println("3. -1�� ���� , 16���� ǥ�� Ȯ��.");
			n16=0xffffffff;
			System.out.println("16���� 0xffffffff : " + n16);
			System.out.printf("%x\n",-1);
			System.out.println("2���� : " + Integer.toBinaryString(-1));
			
			System.out.println("3. �Է���  2���� ,16������ 10������ �ٲ� �帳�ϴ�.");
			Scanner sc = new Scanner(System.in);
			System.out.print("2���� �� �Է� >>>");
			String t2 = sc.nextLine();
			System.out.print("16���� �� �Է� >>>");
			String t16 = sc.nextLine();
			//������ Integer.parseInt(s) �� �����̾��� s ���ڿ��� 10���� ǥ���̶� �ǹ��Դϴ�.
			
			System.out.println(String.format("2���� %s �� 10���� %d", t2, Integer.parseInt(t2, 2) ));		//t2�� 2����       -> �޼ҵ� ��� ���� �� 
			System.out.println(String.format("16���� %s �� 10���� %d", t16, Integer.parseInt(t16, 16)));	//t16�� 16����   -> �޼ҵ� ��� ���� ��
			
			
	}

}
