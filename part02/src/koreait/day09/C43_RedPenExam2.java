package koreait.day09;

import java.util.Random;
import java.util.Scanner;

public class C43_RedPenExam2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int size=5;
		int max_size = MathProblem.max_size;
		MathProblem[] problems = new MathProblem[5];
		
		//모든 문제 저장하는 배열
		
		//배열의 타입은 MathProblem 객체참조형 : n1,n2,op.isCorrect
		
		int n1,n2,ans;
		int cnt=0;
		
		System.out.println("-----------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("-----------------------------------");
		System.out.println("시작합니다.");
		for(int i=0;i<size;i++) {
            MathProblem temp = new MathProblem('+');
            temp.makeProb();             //n1,n2값이 객체의 필드로 난수생성됨
//			System.out.println("문제" +(i+1)+" . " n1 + " " + op+ " " + n2 + " = "+"= 답 입력 -> ");
	         
            ans = sc.nextInt();
		    if(ans == temp.showAnswer()) {      //맞은개수 count
		    	cnt++;
                   
		    }
		    
		}
		System.out.println("-------------------------------------");
		System.out.println("채접합니다. 맞은 갯수"+(cnt) + "(" + cnt*100/size +"점)");
		System.out.println("::::::::틀린문제 정답 보기 :::::::::::::");
		for(MathProblem temp : problems)
			if(!temp.isCorrect() ) 
//                        System.out.println(temp.problems() + temp.showAnswer());
				sc.close();
	}

}
