package koreait.day11.test;

import koreait.day09a.Crow;
import koreait.day09a.Dog;

public abstract class Animal {
      private String name;
      private String color;
      
      public Animal() {
    	  System.out.println("���ο� Animal ������ ������ϴ�.");
      }
      //�߻�޼ҵ�� ����
      
      public abstract void act() ;
    	  
      //�� �ٸ� �߻�޼ҵ嵵 ��������.
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
      //void print() toString�̶� �ٸ� ��, ����Ÿ���� void, String.
     
      
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