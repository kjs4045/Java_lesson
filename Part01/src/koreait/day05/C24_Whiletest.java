package koreait.day05;

import java.util.Scanner;

public class C24_Whiletest {

	public static void main(String[] args) {
          
		
		for(int i=0;i<5;i++)
			System.out.println("hello(" +(i+1)+")");
        //예씨 : for문은 1부터 100까지 더하는 연속적인 값을 대상으로 할 때 적합
		//   :  while 문은 아직 정해지지 않은 값들을 대상으로 할 때 적합
		//      반복문과 함께 명령문 -break , continue(continue  뒤의 명령들 실행하지 않고 반복처음으로 돌아갑니다.
	    
		int j=0;
	    while(j<5)  {
	    	System.out.println("hello("+(j+1)+")");
	    	j++;
	    }
	    
	    int k=0,sum=0;
	    Scanner sc= new Scanner(System.in);
	    System.out.println("\n\n 입력한 정수를 모두 더하는 계산기 입니다.(종료:-1)");
	    while(k!=-1) {         //k가 -1이 아닌 동안 반복실행
	    	System.out.println("정수 입력>>>");
	    	k=sc.nextInt();
	    	sum +=k;    //sum=sum+k;
	    	
	    }
	    
	    System.out.println("sum" + sum);
	    sum=0;
	    k=0;
	    System.out.println("\n\n 입력한 정수를 모두 더하는 계산기 입니다.[ver2.0](종료:-1)");
	    
	    do {
	    	sum+=k;
	    	System.out.println("정수 입력>>>");
    	k=sc.nextInt();
	    	
	    }while(k!=-1);
	    System.out.println("sum ="+sum);
	    
	    k=0;
	    System.out.println("\n\n 입력한 정수를 모두 더하는 계산기 입니다.[ver2.2](종료:-1)");
	    
	    while(true) {
	    	System.out.println("정수 입력>>>");
	    	k=sc.nextInt();
	    	
	    	if(k==-1)break;             //항상 참일때, 탈출(종료) 조건과 break문 사용합니다.
	    	sum+=k;
	    }
	    System.out.println("sum ="+sum);
	    
	    sum=0;
	    System.out.println("\n\n 입력한 정수를 모두 더하는 계산기 입니다.[ver2.3](종료:-1)");
	    boolean isState = true;
	    while(isState)
	    {
	    	System.out.println("정수 입력 >>> ");
	    	k=sc.nextInt();
	    	
	    	if(k==-1) isState=false; //boolean 변수를 활용. 종료조건값일떄 boolean변수값 false로 합니다.
	    	else sum+=k;
	    }
	    System.out.println("sum =" +sum);
	    
	    //continue연습 : 입력된 값이 10의 배수이면 sum에 더하지 않는다.
	    sum=0;
	    System.out.println("\n\n 입력한 정수를 모두 더하는 계산기 입니다.[연습](종료:-1)");
	    
	    while(true) {
	    	System.out.print("정수 입력 >>> ");
	    	k=sc.nextInt();
	    	if(k==-1) break;
	    	if(k%10==0) continue; //아래 명령어 실행하지 않고 다시 반복 처음으로 ,10의 배수는  % 나누기 ==나머지
	    	sum+=k;
	    	
	    }
	    System.out.println("sum =" + sum);
	    sc.close();
	    
	
	
	
	
	
	
	
	
	
	}

}
