package koreait.day08;

public class Member {
	//������
	private String name;
	private String email;
	private int age;
	private int level;
	
	//Ŀ���һ�����
	public Member(String name,String email) {//Ŀ���һ����� : name , email �ʵ� �ʱ�ȭ
		this.name=name;
		this.email=email;
		
	}
	
	public Member(String name) { //���� �����ڿ� 2�� ���ÿ� ���ǵ� �� �����ϴ�.
		this.name=name;
	}
	
	public Member() {        //�⺻ ������ : ��¹� �߰�
		
			System.out.println("name,email,age,level �ʵ�� �⺻���Դϴ�");
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
