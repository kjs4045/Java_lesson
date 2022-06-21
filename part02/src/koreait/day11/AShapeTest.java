package koreait.day11;

public class AShapeTest {

	public static void main(String[] args) {
			Triangle tri = new Triangle(100, 84);
			tri.shapeName= "�����ﰢ��";
			System.out.println(tri);
			System.out.println("���� = " + tri.getArea());
			
			Circle cir = new Circle();
			cir.setRadius(89); cir.shapeName="��";
			System.out.println(cir);
			System.out.println("���� = " + cir.getArea());

	}

}
/*
 * ����: �޼ҵ� �������ҋ� ����������
 * �θ� public-> �ڽ� default x
 * �θ� default -> �ڽ� public o
 * 
 */

abstract class Ashape{
	protected String shapeName;
	protected int width;
	protected int height;
	
	public Ashape() {
		System.out.println("AShape ����Ʈ ������ �����մϴ�.");
	}
	
	//�߻�Ŭ������ Ŀ���� ������ ���峪��?
	public Ashape(int width,int height) {
		System.out.println("Ashape ������ �����մϴ�");
		this.width=width;
		this.height=height;
	}
	public abstract double getArea(); //������ ����

	//�߻�Ŭ������ �ν��Ͻ� �޼ҵ� �����ؼ� �ڽ� Ŭ������ ������ �� �� �ֽ��ϴ�.
	public Object explain() {       //���ø����̼� �Ϸ� �� �߻�޼ҵ� �߰� ���� �߻��ϹǷ� �ν��Ͻ� �޼ҵ� �߰�
		return null;
	}
	
	@Override
	public String toString() {
		return "Ashape [��������=" + shapeName + ", width=" + width + ", height=" + height + "]";
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
	private int radius; //������*������*3.14

@Override
public double getArea() {
	// TODO Auto-generated method stub
	return radius*radius*3.14;
	
}

@Override
public String toString() {
	return "Circle [������=" + radius + ", ��������=" + shapeName + ", width=" + width + ", height=" + height + "]";
	
	
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

