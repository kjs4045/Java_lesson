package koreait.day04;

public class C17_StringTest {

	public static void main(String[] args) {

		 String name = "kim";    //������ ���� (Ŭ���� Ÿ��)
		 String name2 = "kim";
		 String name3 = "lee";
		 String name4 = new String("kim"); // ������ ���ο� String ��ü ����
	
	     System.out.println("name==name2 ������ġ?" +(name==name2));   //T
	     System.out.println("name==name2 ������ġ?" +(name2==name4));  //F
	     System.out.println("name==name2 ������ġ?" +(name==name4));   //F
	
	     name2="son";
	     System.out.println("name==name2 ������ġ?" +(name==name2));   //F
	     
         System.out.println("name =" +name);	     
         System.out.println("name2 =" +name2);	     
         System.out.printf("name3 = %s\n" ,name3);	     
         System.out.printf("name3 = %s\n" ,name4);	     
	
	     
	}

}



/*
 *   ���ڿ� : ��ȣ""�� ����ϸ� ���ڿ��Դϴ�.
 *   �ڹٿ����� �⺻�� ������ �ƴϰ� String Ŭ���� Ÿ������ ����մϴ�.
 *                                �� �ʵ�, �޼ҵ� �̿��Ͽ� ���ڿ� ��� ���
 */
