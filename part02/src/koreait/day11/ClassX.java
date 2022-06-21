package koreait.day11;

public class ClassX extends ClassAbs {
	private int num;
	
	//추상클래스 상속받은 자식(하위)클래스는 반드시 추상메소드 재정의해야 합니
	@Override
	public void test() {                    //ClassAbs 클래스 메소드의 몸체
		System.out.println("ClassX의 test()");
		System.out.println("num =" + num);
	}
	
	public void setNum(int num) {
		this.num=num;
	}

}
