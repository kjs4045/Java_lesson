package koreait.day07;

//C39 ��ȣ ����
public class Student {

	int no;
	String name;
	int grade;
	Score score;         //�ٸ� Ŭ���� ��ü�� �ʵ�(�������)�� ���� �Ǻ�ϴ�.
	
	//���ڷ� ���޹��� ��(�Ʒ� int grade)�� ��������[�ʵ�-��ü�� Ư���� ��Ÿ���� ������� (�� int grade)]�� ����.
	void setData(String name, int grade) {
		this.name=name;
		this.grade=grade;  
	}
	
	
	
	//������ �������� �����Դϴ�. -�׳� ����غ��ô�.-
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", grade=" + grade + ", score=" + score + "]";
				//score �� score.toString()�� ��
	}
	
	
	
	
}
