package koreait.day11;


/*
1. �߻�Ŭ���� : ��ü�� ������������ �ʴ� ������ Ŭ���� �Դϴ�. new ���� ����
2. �߻�޼ҵ带 ���� �ֽ��ϴ�. �߻�(abstract): ��üȭ���� ���� ����.
3. �θ�Ŭ�������� ��üȭ���� ���� �߻�޼ҵ带 �ڽ�Ŭ������ ������(�������̵�)�ϵ��� �ϴ� ���Դϴ�.
  		���߻�Ŭ���� ������ �߻�ȭ�Ȱ��� ��ü�� ������ ����!!
4. ���� :  '���'�� �߻�ȭ ����. '�����'�� ��üȭ�� ��ü
*/
public abstract class ClassAbs {

	  protected String name;         //�ڽ�Ŭ���� �ٸ� ��Ű�������� ���� ����.
	  
           //�߻�޼ҵ� : �ڽĵ��� �������ϵ��� ���ĸ� �����մϴ� {  } (body,��ü)�����ϴ�.
	  public abstract void test();
	  
	  //�ν��Ͻ� �޼ҵ�
	  public void print() {
		  System.out.println("name= " +  name);
	  }
	  
	  public String getName() {
		return name;
	}
	  public void setName(String name) {
		this.name = name;
	}
}

