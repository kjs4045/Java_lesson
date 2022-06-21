package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;


public class AnimalTest2{
	
	public static void main(String[] args) {
		Animal ani1 = new Frog();       //��(up) ĳ����: �ڵ���ȯ   <-> �ٿ�(down)ĳ���� : ������ȯ
		Animal ani2 = new Cat();        
		
		Dog puddle = new Dog();
		Crow crow = new Crow();
		Dog dog = new Dog();
		//�ڽİ�ü�� �����ɶ� ���� �θ�Ŭ���� ��ü�� �����ϸ鼭 �θ�Ŭ���� ������ ����.
		
		System.out.println("::::::::::::::::::");
	//	anima(ani1);
//		anima(ani2);
//		anima(puddle);
		anima(crow);
//		anima(new Frog());
		
		
	}
	
	//������
	//���� ����1 : �޼ҵ� ����(�Ǵ� ����) Ÿ���� Animal : Animal,Dog,Crow,Frog and Cat ��ü ��� �����մϴ�.
	public static void anima(Animal animal) {
		//���� ����2 : �޼ҵ� ������
		animal.act();
		
		animal.print();
		//���ڷ� ���޹��� animal ��ü�� �����ϴ� ���� ��¥ Ÿ��(�ν��Ͻ� Ÿ��) �˻� :instanceof
		System.out.println("dog ? " + (animal instanceof Dog));
		System.out.println("crow ? " + (animal instanceof Crow));
		System.out.println("frog ? " + (animal instanceof Frog));
		System.out.println("cat ? " + (animal instanceof Cat));
	
		// Animal �θ�Ÿ�� ������ �ڽ�Ŭ���� �ʵ�� �޼ҵ� ���� ����.
//	animal.jump();  //Frog
//	animal.run();  //Dog
//	animal.fly();  //Crow
//	animal.sound();  //Cat
	
		Cat cat; Dog dog; Frog frog; Crow crow;
		if(animal instanceof Cat) {
	       cat = (Cat)animal;        //�ٿ�ĳ����: animal ��¥ ��ü�� ���� ���� �Ǵ� ���� ����
		   cat.sound();}
		if(animal instanceof Dog) {
		   dog = (Dog)animal;
		   dog.run();}
		if(animal instanceof Frog) {
			frog = (Frog)animal;
			frog.jump();}
		if(animal instanceof Crow) {
			crow = (Crow)animal;
		    crow.fly();}
	
		animal.print();
	} 	
     
		
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
	
	
	//������ ���� : �޼ҵ� �������̵�                 *��: �����ε�(overloading) - ���� ã�ƺ���*
	//             		�� �θ�Ŭ������ �޼ҵ带 ������. �� �� ���ڿ� ����Ÿ���� �����ϰ� �մϴ�.
	@Override             //annotation �ֳ����̼�: �ڵ�(�Ǵ� ����) �Ҷ� ���� �Ǵ� �ּ�
	
	public void act() {
//		super.act();       //�θ�Ŭ������ act() ����
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
		
		
		
		
