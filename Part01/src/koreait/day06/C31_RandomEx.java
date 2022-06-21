package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C31_RandomEx {

	public static void main(String[] args) {
/*
 *      학생 성적(국어) 분포 보고서를 만듭니다.
 *      학생 인원수 100명 - 점수는 랜덤값으로 테스트(0<= 난수<=100)
 *      
 *      90~100 : x 명 (소수점 한자리%)       카운트 변수 5개 필요합니다.(CntA , B , C, D, E)
 *      80~89 : x 명 (소수점 한자리%)                 ㄴ counts[5]  : counts[0],
 *      70~79 : x 명 (소수점 한자리%)
 *      60~69 : x 명 (소수점 한자리%)
 *      60점 미만 : x 명 (소수점 한자리%)
 *       
 * 
 */
	      Random r=new Random();
          int[] counts = new int[5];
          int[] korean = new int[100];
          
          for(int i=0;i<korean.length;i++) {
        	  korean[i] = r.nextInt(101);
          } //국어 점수 저장

          System.out.println(Arrays.toString(korean));
          
	      for(int i=0;i<korean.length;i++)
	      {    
	    	  if(korean[i]>=90) 
				counts[0]++;// koreani가 90보다 크거나 같으면 배열 count[0]에 더한다
			else if(korean[i]<90 && korean[i]>=80) 
				counts[1]++;
			else if(korean[i]<80 && korean[i]>=70) 
				counts[2]++;
			else if(korean[i]<70 && korean[i]>=60) 
				counts[3]++;
			else  
				counts[4]++;
			

	    	 
	    	  
	      }
	      System.out.println("90~100\t  80~90\t 70~70\t 60~69\t 60미만");
	      System.out.printf("%6s %8s %6s %7s %6s\n","90~100","80~89", "70~79","60~69", "60미만");
	      System.out.println("-----------------------------------------------------");
	      for(int i=0;i<counts.length;i++)
	    	  System.out.printf("%8d ", counts[i]);
	      
	      System.out.println();
	      for(int i=0;i<counts.length;i++)
	    	  System.out.printf("%8.1f%%",(double)counts[i]/korean.length*100);
	      //counts 배열값 출력
	    	 
    	  //counts 배열값으로 백분율 구하고 출력하기
	
	}

}
//배열에서 기능이 향상(데이터삭제,추가)된것이 자바 ArrayList
//배열에서는 직접 데이터 추가/삭제를 구현합니다. -> 메소드 정의
