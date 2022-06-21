package koreait.test;

import java.util.Set;

public class Bike extends Product {

	private int speed;

	public Bike(int price,String prdName , int speed) {
		this.prdName=prdName;
		this.price=price;
		this.speed=speed;
	}
	
	

	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String sell(Object obj) {
		return "추가할인행사 - %d%%인하";
	}

	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName + "]";
	}
	
	
}
