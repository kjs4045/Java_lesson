package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class C65_FileWriteTest {

	public static void main(String[] args) {

		
		          String filename = "D:\\IT\\Iclass05\\�ڹ��׽�Ʈ4.txt";
		          
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


	}}
