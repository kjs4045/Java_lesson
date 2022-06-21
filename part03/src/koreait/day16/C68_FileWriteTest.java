package koreait.day16;

import java.io.File; 
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
//Exception ó�� ����� ���� �޼ҵ忡�� ���ǵɶ� �ٸ� ���:1) 2)
public class C68_FileWriteTest {
		//main �޼ҵ尡 throws Exception �Ѵٸ� jvm ���� �ѱ�ϴ�.
	public static void main(String[] args) {

		
		          String filename = "D:\\IT\\Iclass05\\�ڹ��׽�Ʈ0617.txt";
		          try {
					fileWrite2(filename);
//					filename = "D:\\IT\\Iclass05\\�ڹ��׽�Ʈ0618.txt";   //�������� �׽�Ʈ��
					fileRead(filename);
					
				} catch (FileNotFoundException e) {
					System.out.println("����� ���� ����: " + e.getMessage());
					System.out.println("������ �����ϴ��� Ȯ���ϼ���");
				}
		          
	}
	//���:1  Exception�� try~ catch�� ���� ó���մϴ�.
	public static void fileWrite(String filename) {
		File file = new File(filename);
        
        //printWriter : ��� ����� ���� �޼ҵ�
        PrintWriter pw= null;
        try {
        pw = new PrintWriter(file);
        pw.println("��� 90 89 82");
        pw.println("���� 90 90 82");
        pw.println("���� 82 89 90");
        System.out.println("���� ����� �Ϸ�Ǿ����ϴ�.");  //System.out : ǥ�� ���(�ܼ����)
        
       } catch(FileNotFoundException e) {
      	 //��� ��ɿ��� ������ ������ �ڵ����� ������ ��������ϴ�.
      	 System.out.println("����� ���� �߻� : " + e.getMessage());
}				finally {
		pw.close();
		
}


}
//	���2: throws Ű����� �ش� Exception �� ȣ���� ������ �ѱ��
	//    throws �ڿ� , �� �����ؼ� �������� Exception ������ ���� ����.
	//    Exception ó���ؾ� �� �޼ҵ尡 ���� ���ǵǰ� ���� �� �Ѱ����� ��� ó���� �� �ֽ��ϴ�.
	public static void fileWrite2(String filename) throws FileNotFoundException {
		File file = new File(filename);
        
        //printWriter : ��� ����� ���� �޼ҵ�
        PrintWriter pw= null;
       
        pw = new PrintWriter(file);
        pw.println("��� 90 89 82");
        pw.println("���� 90 90 82");
        pw.println("���� 82 89 90");
        System.out.println("���� ����� �Ϸ�Ǿ����ϴ�.");  //System.out : ǥ�� ���(�ܼ����)
        
       
		pw.close();
		
}
	
		public static void fileRead(String filename) throws FileNotFoundException{
			
			File file= new File(filename);
			Scanner sc = new Scanner(file);
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
				
			}
			sc.close();
			
			
		}


}
		
	

