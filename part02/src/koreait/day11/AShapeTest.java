package koreait.day11;

public class AShapeTest {

	public static void main(String[] args) {
			Triangle tri = new Triangle(100, 84);
			tri.shapeName= "직각삼각형";
			System.out.println(tri);
			System.out.println("넓이 = " + tri.getArea());
			
			Circle cir = new Circle();
			cir.setRadius(89); cir.shapeName="원";
			System.out.println(cir);
			System.out.println("넓이 = " + cir.getArea());

	}

}
/*
 * 참고: 메소드 재정의할떄 접근한정자
 * 부모 public-> 자식 default x
 * 부모 default -> 자식 public o
 * 
 */

abstract class Ashape{
	protected String shapeName;
	protected int width;
	protected int height;
	
	public Ashape() {
		System.out.println("AShape 디폴트 생성자 동작합니다.");
	}
	
	//추상클래스는 커스텀 생성자 만드나요?
	public Ashape(int width,int height) {
		System.out.println("Ashape 생성자 동작합니다");
		this.width=width;
		this.height=height;
	}
	public abstract double getArea(); //도형의 넓이

	//추상클래스도 인스턴스 메소드 정의해서 자식 클래스가 재정의 할 수 있습니다.
	public Object explain() {       //애플리케이션 완료 후 추상메소드 추가 오류 발생하므로 인스턴스 메소드 추가
		return null;
	}
	
	@Override
	public String toString() {
		return "Ashape [도형종류=" + shapeName + ", width=" + width + ", height=" + height + "]";
	}
	
	
}

class Triangle extends Ashape{    //width*height/2
	
        
	public Triangle(int width,int height) {
		super(width,height);
	}
	
	@Override
        public double getArea() {
        	
        	// TODO Auto-generated method stub
        	return width*height/2;
        }
}

class Circle extends Ashape{
	private int radius; //반지름*반지름*3.14

@Override
public double getArea() {
	// TODO Auto-generated method stub
	return radius*radius*3.14;
	
}

@Override
public String toString() {
	return "Circle [반지름=" + radius + ", 도형종류=" + shapeName + ", width=" + width + ", height=" + height + "]";
	
	
}
public void setRadius(int radius) {
	this.radius = radius;
}
}

class Rectangle extends Ashape{
	                          //width*height
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}
}

