package koreait.day05;

import java.util.Scanner;
//�ۼ��� ������
public class C28_IntArrayEx {

    
	/*   1. int �迭ũ�� 5�� �����մϴ�. ������ nums
	 *   2. �迭 ����� ���� ����� �Է�����  �����մϴ�.
	 *   3. �Էµ� ���� �հ�, ����� ���մϴ�.
	 *   4. �Է��� ���� �ִ밪, �ּҰ��� ���ϴ� �޼ҵ带 ����ϴ�.
	 *                 ��maxOfArray , minOfArray : ���ڴ� int �迭 , ��ȯ�� ���� int
	 *
	 */
	
	
	
	public static void main(String[] args) {
                  Scanner sc= new Scanner(System.in);   
		int sum=0;
        int[] nums= new int[5];
        
        
        
		
		for(int i=0;i<5;i++) {
			System.out.print("�迭 ���� �Է��ϼ���.>>");
			nums[i]=sc.nextInt();
			sum+=nums[i];
			System.out.println("nums[" +i+ "] =" + nums[i]);
		    
		}
        	System.out.println("�迭 ���� �հ�� = " + sum);	
		    System.out.println("�迭 ���� ����� = " + sum/nums.length);
		
		    int max=  maxOfArray(nums);
			 System.out.println("�迭�� �ִ밪 = " + max);
			 int min= minOfarray(nums);
			 System.out.println("�迭�� �ּҰ� = " + min);
			 
			 sc.close();
	}
         

	
	public static int maxOfArray(int[] array) { //���ڷ� ���������ޡڡڡڡڡڡڡڡڡڡ�
		int max= array[0];//1
		for(int i=1;i<array.length;i++) //2.
		{
			if(max <array[i])  //�񱳰��� max���� Ŭ�� 3
                    max = array[i];			//4
		

}
		return max;
}
	 public static int minOfarray(int[] array) {
		 int min= array[0];
		 for(int i=1;i<array.length;i++) {
			 if(min>array[i])
				 min = array[i];
		 }
	 return min;
	 }
	 
	}
//max,min ������ ���� �迭�� 0 �� ��Ұ����� �ʱ�ȭ �մϴ�.
//�迭��� 1������ ��������ұ��� max,min�� ������� ���ؼ� 
//max�� �� ������ ������ (min�� �� ������ ũ��) max(min) ���� �迭��Ұ����� �����մϴ�.
//-> �񱳰� ������ ���� max,min ����	