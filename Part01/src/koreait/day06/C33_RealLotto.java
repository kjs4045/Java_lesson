package koreait.day06;

import java.util.Arrays;
import java.util.Random;
//작성자 김종성
public class C33_RealLotto {

	public static void main(String[] args) {

		int[] numbers= new int[45];  //배열 크기 배정      * 뽑힐 공에 해당되는 배열
		Random r = new Random();   //랜덤 r 배정       
		int[] lotto = new int[6];  // *선택된 6개의 값(로또 번호) 저장하는 배열)
		int k;                     //*뽑힐 값의 인덱스 - 난수
		
		
		
		//처음상태 : 값을 인덱스+1 -> 인덱스 난수를 뽑고 해당 값을 삭제하면 이 규칙은 적용이 안됩니다. 
		for(int i=0;i<45;i++)  { //*인덱스의 범위 0: 0~44  -> 난수로 뽑히는 값
			numbers[i]=i+1;     //배열 값의 범위 배정 1~45     -> lotto 배열에 저장되는 값.
		}
		
		System.out.println("numbers 배열초기값-----------------------------------");
		System.out.println(Arrays.toString(numbers));//초기 배열 문자열 출력
		System.out.println("---------------------------------------------------");
		
	    
	    		
	    for (int cnt=0;cnt<6;cnt++) { //*로또 번호 6개를 구하기 위한 for문
	    	
	    	k=r.nextInt(45-cnt); //인덱스를 하나씩 차감하며 진행 마지막 중복배열요소 삭제
	    	                     //* cnt=0,1,2,3,4,5 에 대해 난수의 bound 값은 45,44,43,42,41,40 ->중복 박지(확률적인 범위 축소)
	    	                     //* k의 난수범위? 0~44, 0~43, 0~42, 0~41, 0~40, 0~39
	    	
	    	System.out.println("k=" + k + ",number =" + numbers[k]);  //k=인덱스 numbers[k]=인덱스 값
	    	
	    	lotto[cnt]=numbers[k]; //*numbers 배열에서 난수로 뽑힌 인덱스 k의 값이 저장.
	    	
	    	//*k위치의 값을 제거(삭제) : 인덱스 k+1 부터 마지막요소까지 왼쪽으로 이동 ->  
	    	for(int i=k;i<numbers.length-1;i++)    //*선택된 로또번호를 제외 ->중복방지
	    	{ numbers[i]=numbers[i+1];           //k 번째 배열요소 삭제, 한칸씩 < 당김
	    		
	    	}
	    	System.out.println(Arrays.toString(numbers));//배열 요소 삭제 후 문자열 출력
	    }
	System.out.print("최종선택 숫자 : ");
	System.out.println(Arrays.toString(lotto)); 
	
	Arrays.sort(lotto);
	System.out.println(Arrays.toString(lotto));
	
	}
       
     
}
