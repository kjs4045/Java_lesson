package koreait.day10;

public class ConstructorTest {

	public static void main(String[] args) {

		
		
	}

}

class Product {
	int price;
	
	//����Ʈ �����ڴ� ������ ���մϴ�.

//	public Product() {     ù��° ���.
//	}
	
	public Product(int price) {
		this.price=price;
	}
	
}

class Food extends Product{           
	//Product() ����Ʈ ������ �����ϹǷ� ������ ���� -> food() ����Ʈ ������ ����
	// -> �ڽ� Ŭ������ Ŀ���� �����ڸ� �����ؼ� �θ�Ŭ���� Ŀ���һ����� ȣ��
	
	
	public Food(int Price) {
		super(Price);
	}
	
}

class Electronic extends Product{        //Product() ����Ʈ ������ ���� 
	 
	public Electronic(int price) {
		super(price);            //Product()����Ʈ ������ ��ſ� Ŀ���� ������ ȣ��
	}
}