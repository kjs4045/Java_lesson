package koreait.day07;

public class C36_C35Test {
//C35 Ŭ������ 1) ��ü�� ���� 2)static �� �͵� �׽�Ʈ�մϴ�.
	// (����: main �޼ҵ带 ���� Ŭ������ ��ü�� ������ �ʴ°��� �Ϲ����Դϴ�.)
	public static void main(String[] args) {

		
		//test1, test2�� ������ ����
		C35_GlobalVar test1 = new C35_GlobalVar();          //C35 Ŭ���� Ÿ���� ��ü�� ����
		C35_GlobalVar test2 = new C35_GlobalVar();          //C35 Ŭ���� Ÿ���� ��ü�� ����
		
		//C35Ŭ�������� static �� �ƴ� �ν��Ͻ� ���� ��ü���� �ٸ� ���� �����մϴ�.-��ü ���� �ٸ� Ư���� ��Ÿ���ϴ�.
		test1.count=10;
		test2.count=20;
		
		test1.message="hi test1";
		test2.message="hello test2";

		test1.methodA();           //�ν��Ͻ� �޼ҵ�
		test2.methodA();     
		
		test1.methodC(123);
		test2.methodC(999);
		
		System.out.println("test1.count = " + test1.count);
		System.out.println("test2.count = " + test2.count);
	
	
	    //static ��� �׽�Ʈ : static ���� �Ǵ� �޼ҵ� �� Ŭ���� �̸����� ���
		
	    C35_GlobalVar.num=101;	
	    System.out.println("static num = " + C35_GlobalVar.num);		
	    System.out.println("static num = " + test1.num);		
	    System.out.println("static num = " + test2.num);		
	    
	    //static�� ����Ǵ� �޸� ����(�޼ҵ� ����)�� ��ü�� ����Ǵ� �޸� ����(�� ����)�� �ٸ��ϴ�.
	    
	    //��� TEST(����� ���� �빮�ڷ� ����)Ȯ��
	    System.out.println("TEST = " + C35_GlobalVar.TEST);
//	    C35_GlobalVar.TEST=100;            //����: final�� �� ������ �Ұ���.
	    
	    
	    C35_GlobalVar test3 = new C35_GlobalVar();
	   System.out.println("���� ������ �⺻ �ʱⰪ?");  //0,����Ÿ���� null,0.0
	   //���� : ���� ������ �⺻ �ʱⰪ? - �迭�϶��� 0,����Ÿ���� null,0.0 , �׸��� �⺻�� ������ Ÿ���� ����
	    System.out.println("test3.count = " + test3.count);       //0
	    System.out.println("test3.message = " + test3.message);     //null
	    System.out.println("C35_GlobalVar.point = " + C35_GlobalVar.point);   //0.0
	}

}
