package koreait.day03;

import java.util.Scanner;

public class C14_IfElseIf2 {

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
             double rate;     //������ : 0.1 0.09 ���
             
             System.out.print("���� �ݾ��� >>>");
             pay =sc.nextInt();
             
             
             
            
             if(pay>=100000) 
                      rate=0.1;
             
             else if(pay>=70000)
            	 rate=0.09;
             else if(pay>=40000)
            	 rate=0.07;
             else 
            	 rate=0.03;
             
             money = (int)(pay * rate);
             
            
             System.out.printf("����! ���� �����Ͻ� �ݾ��� ������ %d �Դϴ�.\n ", money); 
             System.out.printf("�̺�Ʈ �Ⱓ ������ %d %% ����Ǿ����ϴ�." ,(int)(rate*100));
              
             sc.close();
	}
}