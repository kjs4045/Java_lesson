package koreait.day02;


//����: �ڹ� ���α׷��־����� Ŭ���� �̸��� ���ϸ��� �����ϰ� �մϴ�.

public class C07_CastingTest {

	public static void main(String[] args) {
 
		
		
		
		 //���Թ� = ������ ��(���ͷ�)/����/������ ���� ������ ����. 
         // ���Ŀ� ���Ǵ� ������     
//		: ��� ���� + , - , * , / , %(������ ������)
//		                 ���� ���� == (����,����.) , != (���� �ʴ�.) , > (ũ��) , < , >= , <=
//		                 �� ����  &&(and), || (or) , !(not, ���� �Ǵ� �ݴ�) 
//	        ����: ++ , -- , += , -= , /= , /= �� ���� ��࿬���� ���� ����
//		  ���������� ������ integer�� �̿� Ư���ѻ�Ȳ���� byte, short, long ���
		
		int a = 123, b = 13;
		double c=10.99;
//		���꿡 ���Ǵ� �ǿ�����(123,13)�� ��� �����̸� ����� ����
//		���꿡 ���Ǵ� �ǿ����ڰ� ����, �Ǽ� ����� ����� �Ǽ�
//		           -> ���� ����� ������ ������ �� ������ ������ ����մϴ�.
		
		int isum;
		double dsum;
		
		isum = a+b;
		dsum = a+c;
		
		System.out.println("a+b=" + isum);
	    System.out.println("a+c=" + dsum);
	    
//	    isum = a + c;   ���� = ����� �Ǽ��̹Ƿ� �������� ������ ���� �Ұ�.

	    //	    ����ȯ : ���� + �Ǽ� ����� �� ���� ������ �����ؾ� �Ѵٸ�. �Ǽ��� ������ ��ȯ�ؼ� ������ �մϴ�. casting
        isum = a + (int)c; //< casting -> ���α׷��Ӱ� �����ؼ� ������ ����ȯ -> ()�ȿ� ��ȯ��ų ���� �ۼ�
        
        System.out.println("a+ (int)c ="  + isum); //�ڿ� �Ҽ����� �ĳ�
        
        
        b=10;
		System.out.println(" a / b =" + (a/b));  //�������� ������ ��� ����
		System.out.println(" a % b =" + (a%b));  //�������� �������� ������
		
	    System.out.printf("%d / %d = %d\n", a,b,a/b);
	    System.out.printf("%d %% %d = %d\n", a,b,a%b);

//	        ��������ȯ (ĳ����) ���� : ���������� ������ ����� �Ǽ��� ���ϴ� ó�������϶�.
//	         -> ���� 1���� �Ǽ��� ��ȯ
	    
	    System.out.printf("%d / %d = %s\n", a,b,a/(double)b);
	   
	    b=11; 
	    System.out.printf("%d / %d = %.2f\n", a,b,a/(double)b);
	
	    //%f �ļ����Ĺ���
	    
	    double test = 12.3456123456789;
	    System.out.println("test = " + test);
	    System.out.printf("test = %f\n", test);
	    System.out.printf("test = %.15f\n", test);
	    
	    
	    
	    int w = 23;
	    int l = 19;
	    
	    int mul=w*l;
	    
	    System.out.println("w*l =" + mul);
	    System.out.printf("%d*%d = %dcm2\n" , w,l,mul );
	    
	    double r = 23.230;
	    double p = 3.14;
	    
	    double cir = r*p*2;
	    double area	= p*r*r;
	    
	    System.out.println("r * p * 2 = " + cir);
	    System.out.println("p* r * r =" + area);
	    
	    System.out.printf("%f*%f*%d = %.3f��\n" , r,p,2,cir );
	    System.out.printf("%f*%f*%f = %.3f��\n" , p,r,r,area );		
	    		
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	
	} 

}
