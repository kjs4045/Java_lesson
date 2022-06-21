package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {

		Random r = new Random();                     //���� Ŭ���� ����
		Scanner sc = new Scanner(System.in);        // ��ĳ�� Ŭ���� ����
		int max =10;                             //�õ�ȸ��
		int[] triallst = new int[max];              /// �迭 ����(��ȸ)
     do {
		GameValue[] history = new GameValue[10];               //�ִ� 10 �� ����� �����ϱ�
		int k = 19;            //history �迭�� �ε�������
		
		System.out.println("���� ���߱� ���� �����մϴ�. �� ��ǻ�ʹ� ���ڸ� �����߽��ϴ�."+ r);
		System.out.println("��, �޸��� ���纸����. (101~299)");
		
		int numComputer = r.nextInt(199)+101;       //��ǻ�Ͱ� �� ���� ����     101~���� ++199����     
		int numHuman;                               //����� ��ü ����
		int i = 0;                                  //��ȸ 
		
			
		do {
		  System.out.print("������ ���� �Է� (��ȸ: " + (max - i) + ") ->");
			numHuman = sc.nextInt();
			if(numComputer>numHuman) {
				triallst[i]= numHuman;
				i++;
				System.out.println("�ƴմϴ�. �� ū ���Դϴ�.");
			}else if (numComputer < numHuman) {
				triallst[i] = numHuman;
				i++;
				System.out.println("�ƴմϴ�. �� ���� ���Դϴ�.");
			}
		    if (i== max)      break;
		    
		    	
		    
		} while(numComputer != numHuman);
		//numComputer==numHuman �̸� ���� �����. -> do~while ����
		if(i==max) {
			System.out.println("�� �޸� �Է� ����: " + Arrays.toString(triallst));
    	System.out.println("�־��� ��ȸ�� �� ���̽��ϴ�. ������ �ٽ� �����ϼ���.!!");
		}else {
			System.out.println("������~ ���߼̽��ϴ�.  �������� �õ�Ƚ�� : "+(i+1));
		}
		System.out.println("������ ��� �Ͻðڽ��ϱ�?");
		}while(sc.nextLine().equals('y'));
	sc.close();
	}

}