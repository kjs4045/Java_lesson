package koreait.day04;

import java.util.Scanner;

public class C21_StringEx {
//�ۼ��� : ������
	public static void main(String[] args) {

		/*  ���� �̸��� ������ üũ�ϴ� ��� ���� 
		 *  1. @ ��ȣ�� 1�� ���ԵǾ�� �մϴ�.	(�޽��� : �̸��� ������ �ƴմϴ�.)
		 *  		�� indexof �� -1�� �ƴϰ� indexof �� lastindexof �� ���� ���ΰ�?
		 *  
		 *  2. 1���� ���� �� @ �ڿ��� gmail.com �̾�� �մϴ�. (�޽��� : ������ �̸��� Ʋ���ϴ�.)
		 *  		�� '@' �� indexof �� ���ؼ� �� �ں��� ������ substring ������ ���ڿ��� equals ��
		 *  
		 *  3. 2���� ���� �� @ �ձ����� ���ڿ�(�����̸�)�� �����մϴ�.
		 *  		�� '@' �� indexof �� ���ؼ� ó�� ���� '@' ���� ������ ���ڿ� substring ����
		 *  
		 *  4. 3���� �����̸��� 6���� �̻��̾�� �մϴ�.
		 *  		�� 3���� ���ڿ��� length() �� 6���� ��
		 *  
		 *  5. 3���� �����̸����� Ư����ȣ $,%�� ���ԵǸ� �ȵ˴ϴ�. 
		 *   		�� indexof('$') , indexof('%') �� ��� -1�� �ƴϸ� �����ϴ� ��ȣ ����
		 */
		//�Է��� email�� ó������ 1,2,4,5�� �ش����� ������ �޽��� ����ϰ� isValid ������ false�� �մϴ�. ->isValid ���
		
		Scanner sc = new Scanner(System.in);
        String email;
        boolean isValid=true;
        
        
        
        System.out.print("����� �̸��� �Է��ϼ���. >>>");
        
        email = sc.nextLine();           //Ű���� �Է��� ���ڿ��� ó���մϴ�.
        
        int index = email.indexOf("@");
        
        String account = email.substring(0, email.indexOf("@"));  // || email.indexOf("@")=9
        String domain = email.substring(email.indexOf("@")+1, email.length());
        int len = account.length();
        boolean isState = domain.equals("gmail.com");
        String gmail ="gmail.com";
        int no= email.indexOf("$");
        int mo= email.indexOf("%");
        System.out.println(index);
        System.out.println(email.lastIndexOf("@")); 
        
        System.out.println(domain);
	    
	    System.out.println("��������ġ?" + isState);
	    System.out.println(account);
	    
	    System.out.println("���̵��� ����" + len);
	    
	    if(len<6 && "gmail"!=domain) { isValid=false;
	    System.out.println("��� �Ұ����� ���̵� �Դϴ�.");
	    }else {isValid=true;
	    System.out.println("��� ������ ���̵� �Դϴ�.");
	    }
	}

}
