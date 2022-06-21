package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class C65_FileWriteTest {

	public static void main(String[] args) {

		
		          String filename = "D:\\IT\\Iclass05\\자바테스트4.txt";
		          
		          File file = new File(filename);
		          
		          //printWriter : 출력 기능을 갖는 메소드
		          PrintWriter pw= null;
		          try {
		          pw = new PrintWriter(file);
		          pw.println("모모 90 89 82");
		          pw.println("다현 90 90 82");
		          pw.println("나연 82 89 90");
		          System.out.println("파일 출력이 완료되었습니다.");  //System.out : 표준 출력(콘솔출력)
		          
		         } catch(FileNotFoundException e) {
		        	 //출력 기능에는 파일이 없으면 자동으로 파일이 만들어집니다.
		        	 System.out.println("사용자 오류 발생 : " + e.getMessage());
	}				finally {
				pw.close();
				
	}


	}}
