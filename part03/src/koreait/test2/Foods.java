package koreait.test2;

public class Foods extends Product {

	@Override
	public String sell(Object obj) {
		return String.format("�߰� ������� - %d %%����");
		
		
	}
	int sugar;
	
	public Foods(int sugar, String prdName, int price) {
		this.prdName=prdName;
		this.price=price;
		this.sugar=sugar;
	}

	@Override
	public String toString() {
		return "Foods [sugar=" + sugar + ", price=" + price + ", prdName=" + prdName + "]";
	}
	

}
