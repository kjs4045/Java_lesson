package koreait.test2;

public class Bike extends Product{

	@Override
	public String sell(Object obj) {
		// TODO Auto-generated method stub
		return String.format("추가 할인 행사- %d%% 인하");
	}
	private int speed;
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	
	public Bike(int price, String prdName, int speed) {
		this.prdName=prdName;
		this.speed=speed;
		this.price=price;
	}
	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName + "]";
	}

}
