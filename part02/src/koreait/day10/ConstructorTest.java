package koreait.day10;

public class ConstructorTest {

	public static void main(String[] args) {

		
		
	}

}

class Product {
	int price;
	
	//디폴트 생성자는 동작을 안합니다.

//	public Product() {     첫번째 방법.
//	}
	
	public Product(int price) {
		this.price=price;
	}
	
}

class Food extends Product{           
	//Product() 디폴트 생성자 실행하므로 없으면 오류 -> food() 디폴트 생성자 실행
	// -> 자식 클래스도 커스텀 생성자를 정의해서 부모클래스 커스텀생성자 호출
	
	
	public Food(int Price) {
		super(Price);
	}
	
}

class Electronic extends Product{        //Product() 디폴트 생성자 실행 
	 
	public Electronic(int price) {
		super(price);            //Product()디폴트 생성자 대신에 커스텀 생성자 호출
	}
}