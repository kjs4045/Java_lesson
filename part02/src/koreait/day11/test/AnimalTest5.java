package koreait.day11.test;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;


public  class AnimalTest5{
	

		
   }                     

class Frog extends Animal {
	
	protected int wings; // ����Ʈ ������+�ٸ���Ű�� �ڽ�Ŭ����
	
	public Frog() {
		System.out.println("���ο� ���������� Frog");
	}
	
	public void jump() {
	    setName("������");
	    setColor("�ʷ�");
		System.out.println("Ư¡ :���� ");
	}
	
	
	
	@Override            
	public void act() {
//		super.act();       //�߻�Ŭ���� �θ�Ŭ������ act() ���� ���մϴ�.
		System.out.println("Animal �ൿ : ���÷� �����ϱ�");
	}
      

	}

	class Cat extends Animal {
		
		protected int eyes; // ����Ʈ ������+�ٸ���Ű�� �ڽ�Ŭ����
		
		public Cat() {
			System.out.println("���ο� ���������� cat");
		}
		
		public void sound() {
		    setName("�����");
		    setColor("ȭ��Ʈ");
			System.out.println("Ư¡ : �߿˾߿� ");
	
}
		@Override
		public void act() {
                System.out.println("Animal �ൿ: ���÷� �߿˾߿� ���");
	
		}

	}
	
	
		
		
		
		
