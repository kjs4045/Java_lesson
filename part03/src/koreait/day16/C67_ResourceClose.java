package koreait.day16;

import java.awt.FileDialog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFrame;
//�о�� �� �ִ� �ؽ�Ʈ ������ ���ڵ��� ��ġ�ؾ��մϴ�.
//workspace = UTF-8 �̸� �ؽ�Ʈ���ϵ� UTF-8������
//workspace = MS949 �̸� �ؽ�Ʈ ������ ANSi
public class C67_ResourceClose {

	public static void main(String[] args) {

//		 String filename = "D:\\IT\\Iclass05\\�ڹ��׽�Ʈ.txt";   //�б� : �����ϴ�����
//		 String filename1 = "D:\\IT\\Iclass05\\�ڹ��׽�Ʈ2.txt"; //���� : �������� �ʴ� ����
		
		//���� ��ȭ���� ����ϱ�
		String filename = filedialogOpen();          //������ ������ �����ϼ���
		String filename1 = filedialogSave();		//������ ������ ������ ã�ư��� ���ϸ��� ���� ������
         File ifile = new File(filename); 				//������ ����� ���ϸ����� ���ϰ�ü ����
         File ofile = new File(filename1);
		
        try {
           Scanner sc= new Scanner(ifile);   PrintWriter pw = new PrintWriter(ofile);              
            
        	while(sc.hasNext()) {
        		String temp = sc.nextLine();           //���Ͽ��� �о�� 1��
        		System.out.println(temp);				//ǥ�� ���(�ܼ�)	
        		pw.println(temp);						//���� ���
        	}
        
        	System.out.println("���� ���簡 �Ϸ�Ǿ����ϴ�.");
            

	} catch(FileNotFoundException e) {
     	 //��� ��ɿ��� ������ ������ Exception�� �߻��մϴ�..
   	   e.printStackTrace();
     	 System.out.println("����� ���� �߻� : " + e.getMessage());
     	 System.out.println("������ ������ �����ϴ�.");
	}catch(Exception e) { //FileNotFoundException
		System.out.println("�˼����� ���� : " + e.getMessage());
		
		
	}
	}
//        FileDialog(); {
//        	
//        }
//        public static String filedialog
        public static String filedialogOpen() {
        
        
     // �ܼ� ��������� �����ϴ� ���α׷� : CLI(Command Line Interface)  <-> GUI(Graphic User Interface) 
     // �ڹٿ����� GUI �� ����� �ִ� Ŭ�������� �ֽ��ϴ�. �� �� �ϳ��� ���ϴ�ȭ���ڸ� ����մϴ�. ���̺귯���� awt,swing,javaFX ���� �ֽ��ϴ�.
     // Windows OS�� ���α׷����� window��� Ʋ �ȿ��� ��������µ� �ڹٿ����� �װ��� �������̶�� �մϴ�.
     		
     		JFrame f = new JFrame();  //���ϴ�ȭ���ڸ� ������ �����Ӱ�ü ����
     		
     		FileDialog fdr = new FileDialog(f,"���� ����",FileDialog.LOAD);	//���ϴ�ȭ���� ��ü ����
     		fdr.setVisible(true);		//���� ��ȭ���� ���̱�
     		
     		String filename = fdr.getDirectory() + fdr.getFile(); 	//������ ������ ��ο� ���ϸ� ����
     		System.out.println("������ ��ο� ���� : " + filename);
     		System.out.println("������ ��� : " + fdr.getDirectory() + ",������ ����:" + fdr.getFile());
     		return filename;
        }
        public static String filedialogSave() {
        	
        	JFrame f = new JFrame();
     		FileDialog fdw = new FileDialog(f, "���� ����",FileDialog.SAVE);
     		fdw.setVisible(true);
     		String filename = fdw.getDirectory() + fdw.getFile();
     		System.out.println("������ ��ο� ���� : " + filename);
     		return filename;
	}
}
