package koreait.day07;

import java.util.Scanner;

//C40 ��ȣ����
public class Score {

	
	  int korean;
	  int english;
	  int science;
	  
	  void input() {
		  Scanner sc= new Scanner(System.in);
		  
		  System.out.print("���� >>>"); this.korean = sc.nextInt();
		  System.out.print("���� >>>"); this.english = sc.nextInt();
		  System.out.print("���� >>>"); this.science = sc.nextInt();
		  //sc.colse(); //������ ���α׷��� ����ɋ��� clsoe
		  
	  }
	  
	  int sum( ) {
		  return (korean+english+science);
	  }
	  double average( ) {
		  return (double)sum()/3;
	  }

	@Override
	public String toString() {
		return "[korean=" + korean + ", english=" + english + ", science=" + science + "]";
	}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}