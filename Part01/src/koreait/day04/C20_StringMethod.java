package koreait.day04;

public class C20_StringMethod {

	public static void main(String[] args) {
             
		String message = "hello~";              //java.lang.String  (�⺻��Ű�� Ŭ����)            ,�⺻ ��Ű���� �ƴѰ� import �ʿ� ex)Scanner
		
		//string Ŭ������ �޼ҵ�� �����ϴ�. �� �ܿ�� ����ϴ� ���� �ƴϰ� �޼ҵ��� �̸�, ����, ���������� �����ؼ� ����մϴ�.
		
		message.length();            //public int length()  : ������ ����
		message.charAt(0);              //public char charAt(int index)
		
		message.equals("hello~");         //public boolean equals(Object anObject), Object�� ��� Ÿ��
		                                  //message �� String Ÿ���̹Ƿ� Object �� String���� �ؼ��մϴ�.
		

//		//���ϰ� ������?
//		message.indexOf('e');                //int
//		message.indexOf("lo");                //
//		message.substring(2);                //string
//		message.substring(2,4);              //
//		message.replace("ll", "*@");         //string
//		//message.startWith("H")         //string
//	    //message.endWith("~");         //string
		
//�޼ҵ� �����ε�(overloading) : �޼ҵ� �̸��� ���������� ���� ���ڰ��� ������ ������ �ٸ��� ������ ��.		
		
		
		int len = message.length();              //"hello~" �� ���� ����
		char temp = message.charAt(3);           //"hello~" ���� 3���� ���� ����
		boolean isState = message.equals("Hello~"); //"hello~"�� Hello~���� ��       �ҹ��� �빮��
		
		System.out.println("length() = " + len); //6 ���ڼ�
		System.out.println("charAt(3) = " + temp); //l in
		System.out.println("equals(\"Hello\")  = " + isState); //hello �� ��ġ�ϴ°� false
		
		System.out.println("indexOf('e') =" + message.indexOf('e')); //1����ġ , 0�����ͽ���
		System.out.println("indexOf(\"lo\") )=" + message.indexOf("lo")); //3����ġ
		System.out.println("indexOf(\"lo\") )=" + message.indexOf("ol")); // -1:ã�� ���ڿ��̾�����
		String test = "hello~hello~";
		System.out.println("test.indexOf(\"lo\") =  "+test.indexOf("lo")); //3��
		System.out.println("test.indexOf(\"lo\") =  "+test.lastIndexOf("lo")); // ��ġ�ϴ� ��������ġ hello�� �ι��ݺ� 9��°
		
		System.out.println("substring(2) =" + message.indexOf("lo"));    //3 'String' lo �� ���ڿ����� 3���� 0.1.2.3
		System.out.println("substring(2,4)) =" + message.substring(2,4));  //ll   , 2������ 2��(4-2) hello ll
		System.out.println("substring(1,4)) =" + message.substring(1,4));  //ll   , 1������ 3��(4-1) hello ell   
		System.out.println("replace(\"ll\", \"*@\")) =" + message.replace("ll", "*@")); //ll�� *@�� ġȯ : he*@o~
		System.out.println("statWith(\"H\") =" + message.startsWith("H"));  //�ҹ��� h�ν��� false
		System.out.println("endWith(\"~\") =" + message.endsWith("~"));     //~�� �� true
		
		
		
		
		
	}

}
