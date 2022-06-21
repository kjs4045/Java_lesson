package koreait.day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.logging.Level;

import koreait.day16.Word;

public class MydictionaryV2 {

	private static Object no;

	public static void main(String[] args) {
		Scanner ssc = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);				
//		HashMap<String, String> dic = new HashMap<>();
		TreeMap<String, String> dic = new TreeMap<String, String>(); 
		//        �� ���� �˻��� ������ ������ Map �� ���� : ������ �Ǵ� Map
		List<Word> mywords = new ArrayList<>(); //*** mydic�� mywords�� �ٲ㼭 �����غ���
		try {
			System.out.println("���Ͽ��� �о�ñ��?  (Y or N)>>> ");
			if (ssc.nextLine().equals("Y"))
			read(mywords, "D:\\IT\\Iclass05\\�ڹ��׽�Ʈ.txt");
			else	
				System.out.println("������ ���� ����ϴ�.");
		} catch (FileNotFoundException e1) {
			System.out.println("���� �д� �� ������ �߻��Ͽ����ϴ�. - " + e1.getMessage());
		}
		
		
		String eng,kor, sel;
		boolean run = true;
		while(run) {
			System.out.println("���ϴ� �޴��� ����ּ���?"+"\n 1.�ܾ� ����\t2.�ܾ� �˻�\t3.�ܾ��� ��ü���� \t4.������ �˻� \t5.���α׷� ������");
			System.out.println("����");
			String search = sc.nextLine();
			
			int level;
			switch (search) {
			
			
			case"1":
				System.out.println("English ->");
				eng = sc.nextLine();
				System.out.println("�ѱ� ->");
				kor = sc.nextLine();
				System.out.println("���� - >");
				level = Integer.parseInt(sc.nextLine());
				Word temp= new Word(eng,kor);
				temp.setLevel(level);
				mywords.add(temp);
				break;
				
			case"2":
				System.out.println("�˻� �ܾ� English ->");
				eng = sc.nextLine();
				for(Word w: mywords)
					if(w.getEnglish().equals(eng))
				System.out.println("�ܾ� �˻� ��� ->"+ w);
				break;
			case"3":
//				System.out.println("�ܾ��� ��ü���� :" + myword);
				all(mywords);   //�����ϰ� ����ϱ�
				break;
			case"4":
				System.out.print("�˻��� ���� �Է�(1~3)->");
				level = Integer.parseInt(sc.nextLine());
				level(mywords,no);
			case"5":
				run=false;
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default:
				System.out.println("�߸� �Է� �Ǿ����ϴ� 1~4�� �ϳ��� �Է����ּ���.");
				break;
			
			}
			try {
				
				System.out.println("���Ͽ� �����ұ��? (Y or N) >>>");
					if(ssc.nextLine().equals('Y'))
					save(mywords, "D:\\IT\\Iclass05\\�ڹ��׽�Ʈ.txt");
					else 
						System.out.println("������ ������� �ʾҽ��ϴ�.");
			} catch (FileNotFoundException e) {
				System.out.println("���� �����߿� ������ ������ϴ�." + e.getMessage());
			}
			System.out.println("::::::::::::::::���� �ܾ��� �����մϴ�:::::::::::::");
		
		}//while end
		//���� : ���� ������ �Է��� �޾ƾ��Ѵٸ� ���ڿ� nextLine()���� �޾Ƽ� ������ ��ȯ�մϴ�.
		// int score = Integer.parseInt(sc.nextLine());
		// ���� : nextInt()�� ���͸� ó������ �ʾƼ� ������ ������ nextLine()���� ���޵Ǿ� �Է��帧�� ���ذ� �˴ϴ�.
		// ��� : �� �ҽ� ���Ͽ��� nextInt() �� ��� �Ǵ� nextLine()�� ����մϴ�.								
		}					
private static void save(List<Word> mywords,String filename) throws FileNotFoundException {
	//���Ͽ� ����ϱ�
	
	File file = new File(filename);
	PrintWriter pw = new PrintWriter(file);
	for(Word w : mywords)
		pw.println(w);
	
	pw.close();
	System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
	
	
	
	
}
private static void read(List<Word> mywords,String filename) throws FileNotFoundException{
	File file = new File(filename);
	Scanner sc = new Scanner(file);
	StringTokenizer stk = null;
	while(sc.hasNext()) {
		String temp = sc.nextLine();
		System.out.println(temp.substring(0, temp.indexOf("(")));  //��ü ���鶧 �ʿ��� ���� �������� �׽�Ʈ
		//���� ����� ����� StringTokenizer  �� Word ��ü ����� mywords ����Ʈ�� �߰��ϱ�
		//?? �ڵ� �ϼ��Ǹ� 3�� ��ü���� �����ϼ���
		stk = new StringTokenizer(temp.substring(0, temp.indexOf("(")));
		while(stk.hasMoreTokens()) {
			mywords.add(new Word(stk.nextToken(),		//english �ʵ尪
								 stk.nextToken(),		//korean �ʵ尪
								 Integer.parseInt(stk.nextToken())));	//level �ʵ尪
			
		}
		
		
		
		
	}
	sc.close();
	System.out.println("���� �о���� �Ϸ�Ǿ����ϴ�.");
	
	
}
	private static void level(List<Word> mywords,int no) {
		for(Word w : mywords)
			if(w.getLevel()==no)
				System.out.println(w);
	}
	
	private static void level(List<Word> mywords, Object no2) {
		// TODO Auto-generated method stub
		
	}

	private static void all(List<Word> myword) {
		myword.sort(new Comparator<Word>() {

			@Override
			public int compare(Word o1, Word o2) {
				return o1.getEnglish().compareTo(o2.getEnglish());
			}
		});
		
			
	
		System.out.println(String.format("%-20s %-20s %10s", "English","Korean","Level"));
		System.out.println("----------------------------------------------------");
		for(Word w : myword) {
			System.out.println(String.format("%-20s %-20s %10d", w.getEnglish(),w.getKorean(),w.getLevel()));
		}
		
		
	}

}



