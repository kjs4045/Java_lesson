package koreait.realtest;
//�ۼ��� :������
public class Bike extends Product {

	@Override//4
	public String sell(Object obj) {
		return String.format("�߰� ������� - %d %%����");
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


		}//����

	
	

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
		return ("����� �̰��� �ü�" + speed + "���� Ż �� �ֽ��ϴ�");
	}
	
	
}
