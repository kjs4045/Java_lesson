package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C66__FileReadTest {
	public static void main(String[] args) {

		
        String filename = "D:\\IT\\Iclass05\\자바테스트.txt";
        
        File file = new File(filename);
        
        //Scanner : 입력 기능을 갖는 클래스
        
        Scanner sc = null;
        try {
            sc= new Scanner(file);                 //System.in : 표준 입력 (콘솔 입력)
        	System.out.println("파일에서 읽은 내용 :  "+ sc.nextLine());  //System.out : 표준 출력(콘솔출력)
            
        	while(sc.hasNext()) {
        		System.out.println(sc.nextLine());
        	}
        	System.out.println("파일 읽기가 완료되었습니다.");
        	
       } catch(FileNotFoundException e) {
      	 //출력 기능에는 파일이 없으면 Exception이 발생합니다..
    	   e.printStackTrace();
      	 System.out.println("사용자 오류 발생 : " + e.getMessage());
}				finally {
		if(sc!=null) 
		sc.close();
		
}


}

}
