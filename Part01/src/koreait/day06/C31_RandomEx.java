package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C31_RandomEx {

	public static void main(String[] args) {
/*
 *      �л� ����(����) ���� ������ ����ϴ�.
 *      �л� �ο��� 100�� - ������ ���������� �׽�Ʈ(0<= ����<=100)
 *      
 *      90~100 : x �� (�Ҽ��� ���ڸ�%)       ī��Ʈ ���� 5�� �ʿ��մϴ�.(CntA , B , C, D, E)
 *      80~89 : x �� (�Ҽ��� ���ڸ�%)                 �� counts[5]  : counts[0],
 *      70~79 : x �� (�Ҽ��� ���ڸ�%)
 *      60~69 : x �� (�Ҽ��� ���ڸ�%)
 *      60�� �̸� : x �� (�Ҽ��� ���ڸ�%)
 *       
 * 
 */
	      Random r=new Random();
          int[] counts = new int[5];
          int[] korean = new int[100];
          
          for(int i=0;i<korean.length;i++) {
        	  korean[i] = r.nextInt(101);
          } //���� ���� ����

          System.out.println(Arrays.toString(korean));
          
	      for(int i=0;i<korean.length;i++)
	      {    
	    	  if(korean[i]>=90) 
				counts[0]++;// koreani�� 90���� ũ�ų� ������ �迭 count[0]�� ���Ѵ�
			else if(korean[i]<90 && korean[i]>=80) 
				counts[1]++;
			else if(korean[i]<80 && korean[i]>=70) 
				counts[2]++;
			else if(korean[i]<70 && korean[i]>=60) 
				counts[3]++;
			else  
				counts[4]++;
			

	    	 
	    	  
	      }
	      System.out.println("90~100\t  80~90\t 70~70\t 60~69\t 60�̸�");
	      System.out.printf("%6s %8s %6s %7s %6s\n","90~100","80~89", "70~79","60~69", "60�̸�");
	      System.out.println("-----------------------------------------------------");
	      for(int i=0;i<counts.length;i++)
	    	  System.out.printf("%8d ", counts[i]);
	      
	      System.out.println();
	      for(int i=0;i<counts.length;i++)
	    	  System.out.printf("%8.1f%%",(double)counts[i]/korean.length*100);
	      //counts �迭�� ���
	    	 
    	  //counts �迭������ ����� ���ϰ� ����ϱ�
	
	}

}
//�迭���� ����� ���(�����ͻ���,�߰�)�Ȱ��� �ڹ� ArrayList
//�迭������ ���� ������ �߰�/������ �����մϴ�. -> �޼ҵ� ����
