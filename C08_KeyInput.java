package koreait.day03;

import java.util.Scanner;

public class C08_KeyInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width ;			//����ڰ� �Է��� ��
		int height;		//����ڰ� �Է��� ��
		int box_area;
		double half,round,circle_area;
		final double PI = 3.14;
		
		System.out.println("[[�簢�� ������ ���� ���ϱ�]]");
		System.out.print("�簢�� �ʺ� �Է� -> ");
		width = sc.nextInt();
		System.out.print("�簢�� ���� �Է� -> ");
		height = sc.nextInt();
		
		box_area = width*height;
		
		System.out.println("ó����� �Դϴ�.......");
		System.out.println("���� : " + width + "��");
		System.out.println("���� : " + height + "��");
		System.out.println("���̸� ���߽��ϴ� : " + box_area + "�� ");
		
		System.out.println("\n[[�� ������ ���̿� �ѷ� ���ϱ�]]");
		System.out.print("���� ������ �Է� -> ");
		half = sc.nextDouble();
		
		round = 2 * PI * half;	//�ѷ�
		circle_area = PI * half * half;	//����
		
		System.out.println("ó����� �Դϴ�.......");
		System.out.printf("������ : %.3f �� \n", half);
		System.out.printf("�ѷ��� ���߽��ϴ� : %.3f �� \n", round);
		System.out.printf("���̸� ���߽��ϴ� : %.3f	�� \n",circle_area);

		sc.close();		//Ű����(ǥ���Է���ġ) �ڿ� ��� ����.
	}
}
