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
		//        ㄴ 이진 검색이 가능한 구조로 Map 을 생성 : 정렬이 되는 Map
		List<Word> mywords = new ArrayList<>(); //*** mydic을 mywords로 바꿔서 구현해보기
		
		String eng,kor;
		boolean run = true;
		while(run) {
			System.out.println("원하는 메뉴를 골라주세요?"+"\n 1.단어 저장\t2.단어 검색\t3.단어장 전체보기 \t4.레벨로 검색 \t5.프로그램 끝내기");
			System.out.println("선택");
			String search = sc.nextLine();
			
			int level;
			switch (search) {
			
			
			case"1":
				System.out.println("English ->");
				eng = sc.nextLine();
				System.out.println("한글 ->");
				kor = sc.nextLine();
				System.out.println("레벨 - >");
				level = Integer.parseInt(sc.nextLine());
				Word temp= new Word(eng,kor);
				temp.setLevel(level);
				mywords.add(temp);
				break;
				
			case"2":
				System.out.println("검색 단어 English ->");
				eng = sc.nextLine();
				for(Word w: mywords)
					if(w.getEnglish().equals(eng))
				System.out.println("단어 검색 결과 ->"+ w);
				break;
			case"3":
//				System.out.println("단어장 전체보기 :" + myword);
				all(mywords);   //정렬하고 출력하기
				break;
			case"4":
				System.out.print("검색할 레벨 입력(1~3)->");
				level = Integer.parseInt(sc.nextLine());
				level(mywords,no);
			case"5":
				run=false;
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못 입력 되었습니다 1~4중 하나를 입력해주세요.");
				break;
			
			}
		
			
			
		}//while end
		//참고 : 정수 데이터 입력을 받아야한다면 문자열 nextLine()으로 받아서 정수로 변환합니다.
		// int score = Integer.parseInt(sc.nextLine());
		// 이유 : nextInt()는 엔터를 처리하지 않아서 다음에 나오는 nextLine()에게 전달되어 입력흐름에 방해가 됩니다.
		// 결론 : 한 소스 파일에서 nextInt() 만 사용 또는 nextLine()만 사용합니다.		
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



