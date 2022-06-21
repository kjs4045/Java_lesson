package koreait.day10;

public class ConstructorTest2 {

	public static void main(String[] args) {

		
		
	}

}

class Product2 {
	int price;
	

	public Product2() {
	}
	
	public Product2(int price) {
		this.price=price;
	}
	
}

class Food2 extends Product2{            
//           Food2 디폴트 생성자는 자동으로 동작됩니다. 
//			 그 안에서 부모클래스 Product2 디폴트 생성자 super()가 호출.
}
	


class Electronic2 extends Product2{       
	
	public Electronic2(int price) {
		super(price);
		//부모클래스 커스텀 생성자 실행
	}
	 
	
}