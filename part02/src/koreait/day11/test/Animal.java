package koreait.day11.test;

import koreait.day09a.Crow;
import koreait.day09a.Dog;

public abstract class Animal {
      private String name;
      private String color;
      
      public Animal() {
    	  System.out.println("새로운 Animal 가족이 생겼습니다.");
      }
      //추상메소드로 변경
      
      public abstract void act() ;
    	  
      //또 다른 추상메소드도 만들어보세요.
      public abstract String  eat(Object object); 
      
      public void print()     {
    	  System.out.println("name: " + name + ",color : " + color);
      }
      public static boolean isDog(Object object) {
    	  return object instanceof Dog;
    	  
      }
      

      public static boolean isCrow(Object object) {
    	  return object instanceof Crow;
    	  
      }
      //void print() toString이란 다른 점, 리턴타입이 void, String.
     
      
      //getter,setter
      
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
