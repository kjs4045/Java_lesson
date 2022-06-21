package koreait.day07;

//C39 번호 생략
public class Student {

	int no;
	String name;
	int grade;
	Score score;         //다른 클래스 객체를 필드(구성요소)로 갖게 되비니다.
	
	//인자로 전달받은 값(아래 int grade)을 전역변수[필드-객체의 특성을 나타내는 구성요소 (위 int grade)]에 대입.
	void setData(String name, int grade) {
		this.name=name;
		this.grade=grade;  
	}
	
	
	
	//앞으로 진도나갈 내용입니다. -그냥 사용해봅시다.-
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", grade=" + grade + ", score=" + score + "]";
				//score 는 score.toString()의 약
	}
	
	
	
	
}
