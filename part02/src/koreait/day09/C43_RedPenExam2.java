package koreait.day09;

import java.util.Random;
import java.util.Scanner;

public class C43_RedPenExam2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int size=5;
		int max_size = MathProblem.max_size;
		MathProblem[] problems = new MathProblem[5];
		
		//��� ���� �����ϴ� �迭
		
		//�迭�� Ÿ���� MathProblem ��ü������ : n1,n2,op.isCorrect
		
		int n1,n2,ans;
		int cnt=0;
		
		System.out.println("-----------------------------------");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("-----------------------------------");
		System.out.println("�����մϴ�.");
		for(int i=0;i<size;i++) {
            MathProblem temp = new MathProblem('+');
            temp.makeProb();             //n1,n2���� ��ü�� �ʵ�� ����������
//			System.out.println("����" +(i+1)+" . " n1 + " " + op+ " " + n2 + " = "+"= �� �Է� -> ");
	         
            ans = sc.nextInt();
		    if(ans == temp.showAnswer()) {      //�������� count
		    	cnt++;
                   
		    }
		    
		}
		System.out.println("-------------------------------------");
		System.out.println("ä���մϴ�. ���� ����"+(cnt) + "(" + cnt*100/size +"��)");
		System.out.println("::::::::Ʋ������ ���� ���� :::::::::::::");
		for(MathProblem temp : problems)
			if(!temp.isCorrect() ) 
//                        System.out.println(temp.problems() + temp.showAnswer());
				sc.close();
	}

}
