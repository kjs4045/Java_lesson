package koreait.test2;

public class ProductTest {

	public static void main(String[] args) {

		
		Product[] cart = new Product[5];
		
		cart[0] = new Bike(123000,"MTB",25);
		cart[1] = new Foods(3500, "�ٳ���", 10);
		cart[2] = new Foods(15000, "����", 25);
		cart[3] = new Bike(99000, "��õ��",15);
		cart[4] = new Foods(5700, "���", 12);
		
		for (Product temp : cart) {
			if(temp!=null && temp.price<=100000) {
				System.out.println(temp);
			}
		
		
		}
		
		
		
		
		
		
	}
	
}
