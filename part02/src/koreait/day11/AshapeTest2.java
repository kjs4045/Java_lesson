package koreait.day11;

import koreait.day09a.Animal;

public class AshapeTest2 {

	//�͸� Ŭ���� : annoymous. �̸��� ���� Ŭ����
	public static void main(String[] args) {

		
		//�������
		//�͸� ����(Inner) Ŭ���� ����
		Ashape sha = new Ashape() {
			//�߻�޼ҵ� ������
			@Override
			public double getArea() {
				// TODO Auto-generated method stub
				return width+height;
			}
		};
			Ashape sha2 = new Ashape(20,13) {
				
				@Override
				public double getArea() {
					// TODO Auto-generated method stub
					return width+height;
				}
			};	
			
			
			System.out.println("sha �� ���� = " + sha.getArea());
			System.out.println("sha �� ���� = " + sha2.getArea());
			
			Animal snake = new Animal(); {
				
				
			};
				
	}

}
