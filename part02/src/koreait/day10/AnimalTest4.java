package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest4 {

	//Animal Ŭ���� isDog,isCrown �׽�Ʈ : �޼ҵ� ���� Object (������ ����)
	public static void main(String[] args) {

		Animal animal = new Dog();
		Dog puddle = new Dog();
		Crow crow = new Crow();
		Animal animal2 =new Crow();
		
		//�޼ҵ� ���ڷ� Object Ÿ�԰�ü�� �޴� �޼ҵ�
		System.out.println(Animal.isCrow(puddle));       //false
		System.out.println(Animal.isDog(puddle));        //true
		System.out.println(Animal.isDog("����"));         //false
		System.out.println(Animal.isDog(1));			 //false
		System.out.println(Animal.isCrow(animal));       //f
		System.out.println(Animal.isCrow(animal2));      //t
		System.out.println(Animal.isCrow(crow));         //t
		System.out.println(Animal.isCrow("���"));      //f
	}

}
