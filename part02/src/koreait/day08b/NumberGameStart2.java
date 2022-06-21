package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGameStart2 {

	public static void main(String[] args) {

		Random r = new Random();                     //랜덤 클래스 생성
		Scanner sc = new Scanner(System.in);        // 스캐너 클래스 생성
		int max =10;                             //시도회수
		String gamer=sc.nextLine();
		int[] triallst = new int[max];              /// 배열 생성(기회)
		GameValue[] history = new GameValue[10];
		int rmin=11, rmax=29;
		int k = 19;   
		do {
		
    	                //최대 10 개 기록을 저장하기
    	 GameValue temp= new GameValue(gamer);
		         //history 배열의 인덱스변수
		
		System.out.println("숫자 맞추기 게임 시작합니다. 나 컴퓨터는 숫자를 결정했습니다."+ r);
		System.out.printf("너, 휴먼은 맞춰보세요. (범위는%d~%d)",rmin,rmax);
		
		int numComputer = r.nextInt(199)+101;       //컴퓨터가 쓸 난수 생성     101~부터 ++199까지     
		int numHuman;                               //사용자 객체 생성
		int i = 0;                                  //기회 
		
			
		do {
		  System.out.print("생각한 숫자 입력 (기회: " + (max - i) + ") ->");
			numHuman = sc.nextInt();
			if(numComputer>numHuman) {
				triallst[i]= numHuman;
				i++;
				System.out.println("아닙니다. 더 큰 값입니다.");
			}else if (numComputer < numHuman) {
				triallst[i] = numHuman;
				i++;
				System.out.println("아닙니다. 더 작은 값입니다.");
			}
		    if (i== max)      break;
		    
		    	
		    
		} while(numComputer != numHuman);
		//numComputer==numHuman 이면 답을 맞춘것. -> do~while 종료
		if(i==max) {
			System.out.println("너 휴먼 입력 내용: " + Arrays.toString(triallst));
    	System.out.println("주어진 기회를 다 쓰셨습니다. 게임을 다시 시작하세요.!!");
		 temp.setCount(max);
		}else {
			System.out.println("딩동댕~ 맞추셨습니다.  성공까지 시도횟수 : "+(i+1));
		    temp.setCount(i+1);
		    temp.setSuccess(true);
		}
		System.out.println("게임을 계속 하시겠습니까? 계속하려면 0 입력 >>>" );
		
     //여기까지
     
     //위의 게임결과를 history 배열에 저장
     history[k]= temp;
     k++;
		}
		while(sc.nextInt()==0);
		
		
     System.out.println("::::::::::게임스코어:::::::::::::");
     //for 반복으로 history 배열에 저장된 값 출력하기
     for(int j=0;j<k;j++)
   	 history[j].print();
		
     System.out.println("::::::::::The  End:::::::::::::");
				
	

     
     
     
     
     
		     
     sc.close();
	}
}


