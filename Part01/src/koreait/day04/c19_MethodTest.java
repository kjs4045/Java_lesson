package koreait.day04;

public class c19_MethodTest {
    //main �޼ҵ�: ������ ������. ���α׷� ������ ���ؼ��� �� �־���� �޼ҵ�. static(�����޼ҵ�)
	public static void main(String[] args) {
        System.out.println("�޼ҵ带 ���� �����ؼ� ����� ���ϴ�.");
        System.out.println("���α׷��� main �޼ҵ��� ��ɹ��� ������� �����ϰ� �߰��� �޼ҵ� ȣ���� ������ �޼ҵ尡 ���ǵ� ������ ����.");
	    System.out.println("��� �̵��մϴ�. �޼ҵ� ������ ����Ǹ� �ٽ� main �޼ҵ�� ��� ���ƿɴϴ�.");
        System.out.println("1.");
        methodA();  //�޼ҵ� ȣ��(����)
        System.out.println("2."); 
        methodB(11, 33);  //11,33 �� �޼ҵ� ���࿡ �ʿ��� ����        
        methodB(929, 111);      
        System.out.println("3.");
        methodC(929., 12.1);
        methodC(929., 121);      //�����ƴ� : �ڵ�ĳ����(����ȯ)      int>double ����       double >int �Ұ���
        System.out.println("4.");
        methodD();       //��ȯ���� �ִ� �޼ҵ������� main �޼ҵ忡�� ��ȯ�� ������ ���߽��ϴ�
        System.out.println("return =" + methodD()); //��ȯ���� �޾Ƽ� ����ϴ� ����.
        int temp = methodD();         //��ȯ���� �޾Ƽ� ������ �����ϴ� ����
        System.out.println("return =" + temp);
        System.out.println("5.");
        methodE(10, 12.3);
        double tom = methodE(10, 12.3);
        System.out.println("return =" + tom);
        
        System.out.println("6.");
        methodF('i', 4);
        System.out.println(methodF('i', 4));
        
        char ch = 'a';
        int val = 3;
        ch = methodF(ch, val);        //�޼ҵ� ���ڸ� ������ ����� �� ����  a�κ��� 3�� ������ 
        System.out.println("return = " + ch);
        		
        /*String Ŭ������ �޼ҵ带 ����.
		  *    ��   �޼ҵ��� ���� ����
		  *    
		  * �޼ҵ��� �ֿ� ��� : ��ȯ��(����), ����(argument) �Ǵ� �Ű�����(parameter), �޼ҵ� �̸�, public , static
		  *    ��  ��ȯ�� : �޼ҵ� ���� �Ϸ�Ǹ� ������� ��� ��
		  *    ��  ����  : �޼ҵ� ������ ���ؼ� �ʿ��� ������ (���İ� ������ ����)  - ������ ������ ������ �پ��մϴ�.
		  *    �� �޼ҵ� �̸� : �ĺ���
		  *    �� public : ���������� , static : ���� ���
		  */
	
	//static �� main���� ������ �޼ҵ�� �����ϰ� static �̾�� �մϴ�
		//�޼ҵ� ����(����)
	}
        
	

              public static void methodA() {
	       System.out.println("##ù��° �޼ҵ� ���� �����Դϴ�.##");
		  

}
              public static void methodB(int a,int b) { //**int a, b �� ���ڰ��� ���޹޴� �Ű����� **
            	  System.out.println("##�ι�° �޼ҵ� ���� �����Դϴ�.##");
            	  System.out.println("���޹��� �� a =" + a + ",b=" + b);
              }
              public static void methodC(double a,double b) { 
            	  System.out.println("##����° �޼ҵ� ���� �����Դϴ�.##");
            	  System.out.println("���޹��� �� a =" + a + ",b=" + b);
              }
              
              public static int methodD() {     //��ȯ���� �ִ� ���� : ��ȯ���� int ������ , �ݵ�� return�� �ʿ��մϴ�.
                        System.out.println("##�׹�° �޼ҵ� ���� �����Դϴ� ##");            
                   return 999;
              
              
              
              
              
              
              }
      public static double methodE(int a, double b) {
    	  System.out.println("##�ټ����� �޼ҵ� ���� �����Դϴ�.");
    	  return a+b;          //���ڷ� ���޹��� ������ �����ϰ� ó����� ����
      
}
      public static char methodF(char ch, int size) {
          System.out.println("##������° �޼ҵ� ���� �����Դϴ�.");    	 
    	  return (char)(ch+size);
      }
}
