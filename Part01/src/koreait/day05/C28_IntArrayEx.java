package koreait.day05;

import java.util.Scanner;
//작성자 김종성
public class C28_IntArrayEx {

    
	/*   1. int 배열크기 5를 선언합니다. 일음은 nums
	 *   2. 배열 요소의 값은 사용자 입력으로  저장합니다.
	 *   3. 입력된 값의 합게, 평균을 구합니다.
	 *   4. 입려된 값의 최대값, 최소값을 구하는 메소드를 만듭니다.
	 *                 ㄴmaxOfArray , minOfArray : 인자는 int 배열 , 반환값 형식 int
	 *
	 */
	
	
	
	public static void main(String[] args) {
                  Scanner sc= new Scanner(System.in);   
		int sum=0;
        int[] nums= new int[5];
        
        
        
		
		for(int i=0;i<5;i++) {
			System.out.print("배열 값을 입력하세요.>>");
			nums[i]=sc.nextInt();
			sum+=nums[i];
			System.out.println("nums[" +i+ "] =" + nums[i]);
		    
		}
        	System.out.println("배열 값의 합계는 = " + sum);	
		    System.out.println("배열 값의 평균은 = " + sum/nums.length);
		
		    int max=  maxOfArray(nums);
			 System.out.println("배열의 최대값 = " + max);
			 int min= minOfarray(nums);
			 System.out.println("배열의 최소값 = " + min);
			 
			 sc.close();
	}
         

	
	public static int maxOfArray(int[] array) { //인자로 참조값전달★★★★★★★★★★
		int max= array[0];//1
		for(int i=1;i<array.length;i++) //2.
		{
			if(max <array[i])  //비교값이 max보다 클떄 3
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
//max,min 변수를 각각 배열의 0 번 요소값으로 초기화 합니다.
//배열요소 1번부터 마지막요소까지 max,min과 순서대로 비교해서 
//max가 그 값보다 작으면 (min이 그 값보다 크면) max(min) 값을 배열요소값으로 변경합니다.
//-> 비교가 끝나면 최종 max,min 결정	