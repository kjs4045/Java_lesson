package koreait.day09a;

public class AnimalTest {

	public static void main(String[] args) {
			Animal animal = new Animal();
			animal.act();
			animal.print();
			System.out.println("\n-------------------------------");
			
			Dog dog = new Dog();
			dog.run();
			dog.print();
			
			System.out.println("\n-------------------------------");
			Crow crow = new Crow();
			crow.fly();
			crow.print();
			
			System.out.println("\n::::::::::::::::::::::::::::::::::");
			Animal temp = dog;                //�ڽİ�ü�� �θ�Ŭ���� Ÿ������ ������ �� �ֽ��ϴ�.  (�ڽ�Ŭ������ �θ�Ŭ����Ÿ������ �ڵ�ĳ����)
			temp.print();
//			temp.run();                       //���� : �θ�Ÿ�� �����δ� �ڽ� �޼ҵ� ���� ���մϴ�.
			temp=crow;					      //�ڽİ�ü�� �θ�Ŭ���� Ÿ������ ������ �� �ֽ��ϴ�.
			temp.print();
//			temp.fly();                       //���� : �θ�Ÿ�� �����δ� �ڽ� �޼ҵ� ���� ���մϴ�.
            
			System.out.println("\n -----------------------------------");
 		    Animal puppy = new Dog();         //�ڽ� ��ü�� �θ�Ŭ���� Ÿ������ ������ �� �ֽ��ϴ�.
		    puppy.print();
//		    puppy.run();                      //���� : �θ�Ÿ�� �����δ� �ڽ� �޼ҵ� ���� ���մϴ�.
		    
		    Dog puddle = (Dog)puppy;          //Animal Ÿ���� Dog Ÿ������ ���� casting.(�ڽ�Ŭ������ ����)
		    puddle.run();                     //   puppy  ������ ������ ��ü�� Dog Ÿ���϶��� ����.
		    puddle.print();
		    
	}

}
