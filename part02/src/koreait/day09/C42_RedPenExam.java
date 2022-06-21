package koreait.day09;

import java.util.Random;
import java.util.Scanner;

public class C42_RedPenExam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int size=5;
		int[] x1 = new int[size];
		int[] x2 = new int[size];
		int[] answer = new int[size];
		int cnt=0;
		System.out.println("-----------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("-----------------------------------");
		System.out.println("시작합니다.");
		for(int i=0;i<x1.length;i++) {
			x1[i] = r.nextInt(89)+11;    //11~99 11부터 89++
			x2[i] = r.nextInt(89)+11;
			System.out.println(String.format("문제 %2d.%d +%d = 답 입력 -> ", i+1,x1[i],x2[i]));

		    answer[i] = sc.nextInt();
		    if(answer[i] == x1[i]+x2[i]) {
		    	cnt++;
		    	
		    }
		}
		System.out.println("-------------------------------------");
		System.out.println("채접합니다. 맞은 갯수"+ cnt + "(" + cnt*100/size +"점)");
		System.out.println("::::::::틀린문제 정답 보기 :::::::::::::");
		for(int i=0;i<x1.length;i++)
			System.out.println(String.format("문제 %2d. %d +%d = %3d", i+1, x1[i],x2[i],x1[i],x2[i]));
		sc.close();
	}

}
