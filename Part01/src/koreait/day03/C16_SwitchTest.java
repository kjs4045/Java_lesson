package koreait.day03;

import java.util.Scanner;

public class C16_SwitchTest {

	public static void main(String[] args) {

		
		               //switch 문은 if ~ else if 를 대신하는 명령문입니다.
		Scanner sc = new Scanner(System.in);
		int item_no;
		int pay=0;
		
		System.out.println("상품목록 : 1.2200 원🍕🍕   2.1900원'🍓🍓  3.3600원🌹🌹  4.2870원🍹🍹");
		System.out.print("상품(번호)을 선택해서 장바구니에 넣으세요. >>>");
		item_no = sc.nextInt();
		
		
        switch (item_no) {//조건식 작성 했을 때와 같이 비교할 변수
        case 1:
        	pay=2200;
        	break;    //아래의 명령문들은 실행하지 않고 switch문 끝내기
        case 2:
        	pay=1900;
        	break;
        case 3:
        	pay=3700;
        	break;
        case 4:
        	pay=2870;
        	break;
        default:
        	System.out.println("상품 선택이 잘못되었습니다.");
        	pay=99999;
        	break;
        	
        
        }
        System.out.println("결제 금액" + pay + " 입니다.");		
	

	     if(item_no==1)  pay=2200;
	      
	     else if(item_no==2) pay=1900; 
	     else if(item_no==3) pay=3700; 
	     else if(item_no==4) pay=2870; 
	     else {pay=99999;
	           System.out.println("상품 선택이 잘못되었습니다.");     
	     }
	     
	     System.out.println("결제 금액" + pay + " 입니다.");
	     }
}
	
	
	
	
	
	
	
	

