package koreait.day03;

import java.util.Scanner;

public class C14_IfElseIf {

	public static void main(String[] args) {
            //if(���ǽ� { .. } else if(���ǽ�) { .. ) else if(���ǽ�) { .. ) else if(���ǽ�) { .. ) ~ else if(���ǽ�) { .. ) ........
		/* ���� ���θ� �����ø� �̺�Ʈ
		 * ���� ������ �ݾ��� 10���� �̻��̸� ������ ���űݾ��� 10%
		 *              7���� �̻��̸�                         9%
		 *              4���� �̻��̸�                         7%
		 *              �� ���ϴ�                                3%
		 * 
		 */
	
             Scanner sc = new Scanner(System.in);
             int money; // ������ : %�����ϸ� ������� �Ǽ� -> ������ ��ȯ.
             int pay;   // ���űݾ�
             
             
             System.out.print("���� �ݾ��� >>>");
             pay =sc.nextInt();
             
             
             
            
             if(pay>=100000) {
            	 money=pay*(int)0.1;
             } 
             else if (pay>=70000) { 
            	 money=pay*(int)0.09;
             
             
	}
             else if(pay>=40000) {
                 money=pay*(int)0.07;	 
             }
             else { 
            	 money=pay*(int)0.03;
             }
             System.out.printf("����! ���� �����Ͻ� �ݾ��� ������ %d �Դϴ�.\n "); 
}
}