package koreait.day03;

import java.util.Scanner;

public class C14_IfElseIf {

	public static void main(String[] args) {
            //if(조건식 { .. } else if(조건식) { .. ) else if(조건식) { .. ) else if(조건식) { .. ) ~ else if(조건식) { .. ) ........
		/* 나의 쇼핑몰 마켓컬리 이벤트
		 * 오늘 구입한 금액이 10만원 이상이면 적립금 구매금액의 10%
		 *              7만원 이상이면                         9%
		 *              4만원 이상이면                         7%
		 *              그 이하는                                3%
		 * 
		 */
	
             Scanner sc = new Scanner(System.in);
             int money; // 적립금 : %적용하면 결과값은 실수 -> 정수로 변환.
             int pay;   // 구매금액
             
             
             System.out.print("구매 금액은 >>>");
             pay =sc.nextInt();
             
             
             
            
             if(pay>=100000) {
            	 money=pay*(int)0.1;
             } 
             else if (pay>=70000) { 
            	 money=pay*(int)0.09;
             
             
	}
             else if(pay>=40000) {
                 money=pay*(int)0.07;	 
             }
             else { 
            	 money=pay*(int)0.03;
             }
             System.out.printf("고객님! 오늘 구매하신 금액의 적립금 %d 입니다.\n "); 
}
}