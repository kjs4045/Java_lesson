package koreait.day08;

public class Member {
	//김종성
	private String name;
	private String email;
	private int age;
	private int level;
	
	//커스텀생성자
	public Member(String name,String email) {//커스텀생성자 : name , email 필드 초기화
		this.name=name;
		this.email=email;
		
	}
	
	public Member(String name) { //위의 생성자와 2개 동시에 정의될 수 없습니다.
		this.name=name;
	}
	
	public Member() {        //기본 생성자 : 출력문 추가
		
			System.out.println("name,email,age,level 필드는 기본값입니다");
			System.out.println("name = " + this.name);
			System.out.println("age = " + this.age);
	}
		public void setName(String name) {
		this.name = name;
	}
		public String getName() {
		return name;
	}
		public void setEmail(String email) {
		this.email = email;
	}
		public String getEmail() {
		return email;
	}
		public void setAge(int age) {
		this.age = age;
	}
		public int getAge() {
		return age;
	}
		public void setLevel(int level) {
		this.level = level;
	}
		public int getLevel() {
		return level;
	}

}
