package koreait.day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C63_TryCatchTest {

	public static void main(String[] args) {
		//try gudtlr
		Scanner sc= new Scanner(System.in);
		try {
			//excetion ���ɼ��� �ִ� ����� �ۼ�. --? ������ ����� catch �� ���ϴ�.
			//�� ��ġ���� ���� �����ϸ� try { } �� ��������
			
			
		} catch (NullPointerException e) { //���� ���ο� ���� Exception ������ �˻��մϴ�.
			//NullPointerException �϶��� �Ʒ� ��ɵ� ó���մϴ�.	
			e.printStackTrace(); //������ �����ϱ� ���� ������ ��� (���� Exception ��� ����)
		} catch (InputMismatchException e) {
			//catch�� ������ �ۼ� �����մϴ�.
		} finally { // ���������� , ���������� : ���� �߻� ������� ����Ǵ� �κ��Դϴ�.
			//�ַ� �ڿ��� �����ϴ� �ڵ��Դϴ�.
		sc.close();
		}

		
		//try ���� ��� �Ǵ� catch ���� ����� ������ ������ ��� �˴ϴ�.
	}

}
