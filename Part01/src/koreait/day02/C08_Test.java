package koreait.day02;

public class C08_Test {

	public static void main(String[] args) {
		System.out.println("[[�ﰢ�� ���� ���ϱ�]]");
		int w = 23;
	    int l = 19;
	    
	    int mul=w*l;
	    System.out.println("����"+w);
	    System.out.println("����"+l);
	    System.out.println("���̸����߽��ϴ�=" + mul);
	    System.out.printf("%d*%d = %dcm2\n" , w,l,mul);
	    
	    
	    final double PI = 3.14;
	    double r = 23.230;
	    double p = 3.14;
	    
	    double cir = r*PI*2;
	    double area	= PI*r*r;
	    
	    System.out.println("r * p * 2 = " + cir);
	    System.out.println("p* r * r =" + area);
	    
	    System.out.printf("%f*%f*%d = %.3f cm\n" , r,p,2,cir );
	    System.out.printf("%f*%f*%f = %.3f cm\n" , p,r,r,area );	

//	   final �׽�Ʈ
//	     �������� �տ� final Ű���带 ���̸� ���� �������� ���մϴ�
	    
	    final int test = 123;
	    
	   System.out.println("test =" + test);
	   
	   
	    
//	    
	}

}
