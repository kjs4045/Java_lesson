package koreait.day11.test;

public class Crow extends Animal {
	
	protected int wings; // ����Ʈ ������+�ٸ���Ű�� �ڽ�Ŭ����
	
	public Crow() {
		System.out.println("���ο� ���������� crow");
	}
	
	public void fly() {
	    setName("���");
	    setColor("������");
		System.out.println("Ư¡ : ���� ");
	}

	
	//�߻�޼ҵ� ������(����)
	@Override
	public void act() {
		System.out.println("Animal �ൿ : �Ϸ����� ���ƴٴϱ�");
		// TODO Auto-generated method stub
		
	}
	@Override
	public String eat(Object object) {
		// TODO Auto-generated method stub
		return "���̴� ����" + object + "���� �Դϴ�." ;
	}
}
