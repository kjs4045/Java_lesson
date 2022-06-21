package koreait.day12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.logging.Level;

import koreait.day16.Word;

public class C52_MyDictionary {

	private static Object no;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
//		HashMap<String, String> dic = new HashMap<>();
		TreeMap<String, String> dic = new TreeMap<String, String>(); 
		//        �� ���� �˻��� ������ ������ Map �� ���� : ������ �Ǵ� Map
		List<Word> mywords = new ArrayList<>(); //*** mydic�� mywords�� �ٲ㼭 �����غ���
		
		String eng,kor;
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
		
			
			
		}//while end
		//���� : ���� ������ �Է��� �޾ƾ��Ѵٸ� ���ڿ� nextLine()���� �޾Ƽ� ������ ��ȯ�մϴ�.
		// int score = Integer.parseInt(sc.nextLine());
		// ���� : nextInt()�� ���͸� ó������ �ʾƼ� ������ ������ nextLine()���� ���޵Ǿ� �Է��帧�� ���ذ� �˴ϴ�.
		// ��� : �� �ҽ� ���Ͽ��� nextInt() �� ��� �Ǵ� nextLine()�� ����մϴ�.		
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



