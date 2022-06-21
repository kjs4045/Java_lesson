package koreait.day16;

import java.util.Scanner;

public class C69_MyExceptionTest {

	public static void main(String[] args) {

		System.out.print("���̸� �Է��ϼ���");
		Scanner sc= new Scanner(System.in);
		
		try {
			int age = Integer.parseInt(sc.nextLine());
			if(age<0 || age>100)
				throw new Exception("������ ������ 0~100�Դϴ�."); 
//			throw new AgeException("������ ������ 0~100�Դϴ�."); //Ŭ�������� �߰����� ������ ������
			//throw�� ������ Exception�� �߻� ��ŵ�ϴ�.
			
			if (age==0) throw new NullPointerException();
			
			System.out.println("����� ���̴� " + age + "�� �½��ϱ�?");
		} catch (NumberFormatException e) {
			System.out.println("���� �Է��� ���ڷθ� �ϼ���.!");
		} catch (Exception e) {
			System.out.println("����� ���� ���� : " + e.getMessage());
		}

}


//����� Exception�� ����ϴ�. :Exception ���
class AgeException extends Exception {

	//Serializable �������̽��� ���õȰ�
	private static final long serialVersionUID = 1L;
	
	//����ڰ� ���Ƿ� �޼����� ���� �� �ֽ��ϴ�.
	public AgeException(String message) {
		super(message);                 //Exception�� message �ʵ带 ����
	}
	
}
}