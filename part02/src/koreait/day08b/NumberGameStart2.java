package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGameStart2 {

	public static void main(String[] args) {

		Random r = new Random();                     //���� Ŭ���� ����
		Scanner sc = new Scanner(System.in);        // ��ĳ�� Ŭ���� ����
		int max =10;                             //�õ�ȸ��
		String gamer=sc.nextLine();
		int[] triallst = new int[max];              /// �迭 ����(��ȸ)
		GameValue[] history = new GameValue[10];
		int rmin=11, rmax=29;
		int k = 19;   
		do {
		
    	                //�ִ� 10 �� ����� �����ϱ�
    	 GameValue temp= new GameValue(gamer);
		         //history �迭�� �ε�������
		
		System.out.println("���� ���߱� ���� �����մϴ�. �� ��ǻ�ʹ� ���ڸ� �����߽��ϴ�."+ r);
		System.out.printf("��, �޸��� ���纸����. (������%d~%d)",rmin,rmax);
		
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
		 temp.setCount(max);
		}else {
			System.out.println("������~ ���߼̽��ϴ�.  �������� �õ�Ƚ�� : "+(i+1));
		    temp.setCount(i+1);
		    temp.setSuccess(true);
		}
		System.out.println("������ ��� �Ͻðڽ��ϱ�? ����Ϸ��� 0 �Է� >>>" );
		
     //�������
     
     //���� ���Ӱ���� history �迭�� ����
     history[k]= temp;
     k++;
		}
		while(sc.nextInt()==0);
		
		
     System.out.println("::::::::::���ӽ��ھ�:::::::::::::");
     //for �ݺ����� history �迭�� ����� �� ����ϱ�
     for(int j=0;j<k;j++)
   	 history[j].print();
		
     System.out.println("::::::::::The  End:::::::::::::");
				
	

     
     
     
     
     
		     
     sc.close();
	}
}


