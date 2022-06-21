package koreait.day11.test;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;


public  class AnimalTest5{
	

		
   }                     

class Frog extends Animal {
	
	protected int wings; // 디폴트 한정자+다른패키지 자식클래스
	
	public Frog() {
		System.out.println("새로운 동물가족은 Frog");
	}
	
	public void jump() {
	    setName("개구리");
	    setColor("초록");
		System.out.println("특징 :점핑 ");
	}
	
	
	
	@Override            
	public void act() {
//		super.act();       //추상클래스 부모클래스의 act() 실행 못합니다.
		System.out.println("Animal 행동 : 수시로 점핑하기");
	}
      

	}

	class Cat extends Animal {
		
		protected int eyes; // 디폴트 한정자+다른패키지 자식클래스
		
		public Cat() {
			System.out.println("새로운 동물가족은 cat");
		}
		
		public void sound() {
		    setName("고양이");
		    setColor("화이트");
			System.out.println("특징 : 야옹야옹 ");
	
}
		@Override
		public void act() {
                System.out.println("Animal 행동: 수시로 야옹야옹 울기");
	
		}

	}
	
	
		
		
		
		
