package koreait.day01;

public class C02_TwicePrint {

	public static void main(String[] args) {
		System.out.println("Ʈ���̽�");
		System.out.println("�̸�\t�������\t\t����");
		System.out.println("-----------------------------");
		System.out.println("�糪\t1996.12.29\t27");          //�Ѱ� ���ڿ��� ���
		System.out.println("��ȿ\t1997.02.01\t26");
		System.out.println("�̳�\t1998.03.24\t25");
		//printf() �޼ҵ� ����ؼ� ������� �����մϴ�
		//12ĭ���ڿ�+�ڸ��� �������� ���� ���ڿ�+5ĭ ����
		//%s �� ������ ĭ���� �����ʸ���, -%�� ���ʸ���.
		System.out.printf("%-12s%s%5d\n", "dayeon", "1998.05.28",25);
		System.out.printf("%-12s%s%5d\n", "momo", "1999.04.23",24);
		//System.out.printf("%-8s%s%8d\n", "nayeon", "1997.06.14");
		//printf �޼ҵ忡�� ���Ĺ��� ������ŭ �ڿ� ������ ������ ������ ��ġ���� �ʾ� ���� �߻�
		//System.out.printf("%-8s%8d\n", "nayeon", "1997.06.14");
		//printf �޼ҵ忡�� ���Ĺ��ڿ� �ڿ� ������ ������ ������ ��ġ���� �ʾ� ���� �߻�
		System.out.println("=============����===============");
		System.out.printf("%-12s%4d.%02d.%2d%5d\n", "dayeon", 1998,5,28, 25);
		System.out.printf("%-12s%4d.%02d.%2d%5d\n", "momo", 1999,4,23, 24);
		System.out.printf("%-12s%4d.%02d.%2d%5d\n", "nayeon", 1997,6,14, 26);
		//��������� �����͸� ���� ���ͷ��� ("", 1998, true...etc)ǥ���ؼ� ���
		
		//�������� : ���� ���
		//System.out.printf("%-12s %4d.%2d.%2d %d\n",name,year,month,day,age);
		
		//printf �޼ҵ忡�� ���Ĺ��� ������ŭ �ڿ� ������ ������ ������ ��ġ�ؾߵ˴ϴ�
	}

}
//��¿� ���Ǵ� ����
//- \ (��������) ����ϴ� �̽������� ���� : \n (�ٹٲ�) ,  \t(tab)= �������� ����
//- % ������������ : %s(���ڿ�), , %d(����) �ڸ����� �����ؼ� �� �� �ֽ��ϴ�.
//                                      ������ �ڸ� 0���� ä����� %03d �� �����մϴ�.
// "" �ȿ� ǥ�õ� ���ڴ� ������ x, ���ڿ��Դϴ�.
