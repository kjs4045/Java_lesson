package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C66__FileReadTest {
	public static void main(String[] args) {

		
        String filename = "D:\\IT\\Iclass05\\�ڹ��׽�Ʈ.txt";
        
        File file = new File(filename);
        
        //Scanner : �Է� ����� ���� Ŭ����
        
        Scanner sc = null;
        try {
            sc= new Scanner(file);                 //System.in : ǥ�� �Է� (�ܼ� �Է�)
        	System.out.println("���Ͽ��� ���� ���� :  "+ sc.nextLine());  //System.out : ǥ�� ���(�ܼ����)
            
        	while(sc.hasNext()) {
        		System.out.println(sc.nextLine());
        	}
        	System.out.println("���� �бⰡ �Ϸ�Ǿ����ϴ�.");
        	
       } catch(FileNotFoundException e) {
      	 //��� ��ɿ��� ������ ������ Exception�� �߻��մϴ�..
    	   e.printStackTrace();
      	 System.out.println("����� ���� �߻� : " + e.getMessage());
}				finally {
		if(sc!=null) 
		sc.close();
		
}


}

}
