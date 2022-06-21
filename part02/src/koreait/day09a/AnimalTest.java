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
			Animal temp = dog;                //자식객체는 부모클래스 타입으로 참조할 수 있습니다.  (자식클래스는 부모클래스타입으로 자동캐스팅)
			temp.print();
//			temp.run();                       //오류 : 부모타입 변수로는 자식 메소드 실행 못합니다.
			temp=crow;					      //자식객체는 부모클래스 타입으로 참조할 수 있습니다.
			temp.print();
//			temp.fly();                       //오류 : 부모타입 변수로는 자식 메소드 실행 못합니다.
            
			System.out.println("\n -----------------------------------");
 		    Animal puppy = new Dog();         //자식 객체는 부모클래스 타입으로 참조할 수 있습니다.
		    puppy.print();
//		    puppy.run();                      //오류 : 부모타입 변수로는 자식 메소드 실행 못합니다.
		    
		    Dog puddle = (Dog)puppy;          //Animal 타입을 Dog 타입으로 강제 casting.(자식클래스만 가능)
		    puddle.run();                     //   puppy  변수가 참조가 객체가 Dog 타입일때만 가능.
		    puddle.print();
		    
	}

}
