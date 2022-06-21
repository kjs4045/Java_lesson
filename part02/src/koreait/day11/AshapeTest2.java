package koreait.day11;

import koreait.day09a.Animal;

public class AshapeTest2 {

	//익명 클래스 : annoymous. 이름이 없는 클래스
	public static void main(String[] args) {

		
		//마름모꼴
		//익명 내부(Inner) 클래스 정의
		Ashape sha = new Ashape() {
			//추상메소드 재정의
			@Override
			public double getArea() {
				// TODO Auto-generated method stub
				return width+height;
			}
		};
			Ashape sha2 = new Ashape(20,13) {
				
				@Override
				public double getArea() {
					// TODO Auto-generated method stub
					return width+height;
				}
			};	
			
			
			System.out.println("sha 의 넓이 = " + sha.getArea());
			System.out.println("sha 의 넓이 = " + sha2.getArea());
			
			Animal snake = new Animal(); {
				
				
			};
				
	}

}
