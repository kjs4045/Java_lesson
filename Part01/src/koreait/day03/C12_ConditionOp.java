package koreait.day03;

import java.util.Scanner;

public class C12_ConditionOp {
//���ǽ��� ����� ���� ����� �����ϴ� ���� ������: ���Ǽ�? ��/����T : ��/����F
	public static void main(String[] args) {
		 int korean,math;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("���� ������ �Է� �ϼ���: " );
			korean = sc.nextInt();
			System.out.println("���� ������ �Է� �ϼ���: ");
			math = sc.nextInt();
	        
	        
		    		
		    
		    //���������� �������� ��� 80�� �̻��ΰ�?  -> ��� �л�
		    System.out.println("��� �л�?" +((korean>=80 && math>=80)? "�½��ϴ�." : "�ƴմϴ�.") );
		    
		    //if : ó���� ����� �����ϴ� ���ǹ�
		    // {    } �� ��ɹ� ���(block) �̰� �������� ��ɵ��� ���δ� ������ ��ȣ,
		    // {    } �ȿ� ���� ����� 1���� ���� ������ �� �ֽ��ϴ�.
		    
		    if(korean>=80 && math >= 80) {
		    	//������ ���ϴ� �����ϴ� ��ɵ�
		    	System.out.println("�½��ϴ�.");
		    } 
		    else {
		    	System.out.println("�ƴմϴ�.");
		    	//���ǽ��� �����϶� �����ϴ� ��ɵ�
		    }
		    //�������� �Ǵ� ���� ���� �߿� 90�� �̻��� �ִ°�? - > Ư�� �л�
		    //System.out.println("Ư�� �л�?" + (korean>=90 || math>=90));
	         if(korean>=90 || math>=90)
	         System.out.println("�½��ϴ�.");
	         
	         else  
	         System.out.println("�ƴմϴ�.");
	         
	         // ���α׷��� ó�� ������ else { }�� �ش�Ǵ� ������ ������ �ۼ� ���մϴ�.
	            if(!(korean>=20 && korean <=80))
	            	System.out.println("ǥ������ ���� ū �����Դϴ�.");
	         
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	}
}
