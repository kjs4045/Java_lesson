package koreait.day06;

import java.util.Arrays;
import java.util.Random;
//�ۼ��� ������
public class C33_RealLotto {

	public static void main(String[] args) {

		int[] numbers= new int[45];  //�迭 ũ�� ����      * ���� ���� �ش�Ǵ� �迭
		Random r = new Random();   //���� r ����       
		int[] lotto = new int[6];  // *���õ� 6���� ��(�ζ� ��ȣ) �����ϴ� �迭)
		int k;                     //*���� ���� �ε��� - ����
		
		
		
		//ó������ : ���� �ε���+1 -> �ε��� ������ �̰� �ش� ���� �����ϸ� �� ��Ģ�� ������ �ȵ˴ϴ�. 
		for(int i=0;i<45;i++)  { //*�ε����� ���� 0: 0~44  -> ������ ������ ��
			numbers[i]=i+1;     //�迭 ���� ���� ���� 1~45     -> lotto �迭�� ����Ǵ� ��.
		}
		
		System.out.println("numbers �迭�ʱⰪ-----------------------------------");
		System.out.println(Arrays.toString(numbers));//�ʱ� �迭 ���ڿ� ���
		System.out.println("---------------------------------------------------");
		
	    
	    		
	    for (int cnt=0;cnt<6;cnt++) { //*�ζ� ��ȣ 6���� ���ϱ� ���� for��
	    	
	    	k=r.nextInt(45-cnt); //�ε����� �ϳ��� �����ϸ� ���� ������ �ߺ��迭��� ����
	    	                     //* cnt=0,1,2,3,4,5 �� ���� ������ bound ���� 45,44,43,42,41,40 ->�ߺ� ����(Ȯ������ ���� ���)
	    	                     //* k�� ��������? 0~44, 0~43, 0~42, 0~41, 0~40, 0~39
	    	
	    	System.out.println("k=" + k + ",number =" + numbers[k]);  //k=�ε��� numbers[k]=�ε��� ��
	    	
	    	lotto[cnt]=numbers[k]; //*numbers �迭���� ������ ���� �ε��� k�� ���� ����.
	    	
	    	//*k��ġ�� ���� ����(����) : �ε��� k+1 ���� ��������ұ��� �������� �̵� ->  
	    	for(int i=k;i<numbers.length-1;i++)    //*���õ� �ζǹ�ȣ�� ���� ->�ߺ�����
	    	{ numbers[i]=numbers[i+1];           //k ��° �迭��� ����, ��ĭ�� < ���
	    		
	    	}
	    	System.out.println(Arrays.toString(numbers));//�迭 ��� ���� �� ���ڿ� ���
	    }
	System.out.print("�������� ���� : ");
	System.out.println(Arrays.toString(lotto)); 
	
	Arrays.sort(lotto);
	System.out.println(Arrays.toString(lotto));
	
	}
       
     
}
