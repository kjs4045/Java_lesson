package koreait.realtest;
//작성자 :김종성
public class Bike extends Product {

	@Override//4
	public String sell(Object obj) {
		return String.format("추가 할인행사 - %d %%인하");
	}
	//6
	private int speed;
	//7
	public Bike(int pirce, String prdName, int speed){
		this.prdName=prdName;
		this.price=price;
		this.speed=speed;
	}
	
	public Bike() {


		}//누락

	
	

	@Override
	//12
	public String toString() {
		return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName + ", getSpeed()=" + getSpeed()
				+ ", ride()=" + ride() + "]";
	}

	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	//10
	public String ride() {
		return ("당신은 이것을 시속" + speed + "으로 탈 수 있습니다");
	}
	
	
}
