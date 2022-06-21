package koreait.day04;

public class C20_StringMethod {

	public static void main(String[] args) {
             
		String message = "hello~";              //java.lang.String  (기본패키지 클래스)            ,기본 패키지가 아닌건 import 필요 ex)Scanner
		
		//string 클래스의 메소드는 많습니다. 다 외우고 사용하는 것이 아니고 메소드의 이름, 인자, 리턴형식을 참조해서 사용합니다.
		
		message.length();            //public int length()  : 문자의 길이
		message.charAt(0);              //public char charAt(int index)
		
		message.equals("hello~");         //public boolean equals(Object anObject), Object는 모든 타입
		                                  //message 가 String 타입이므로 Object 는 String으로 해석합니다.
		

//		//리턴값 형식은?
//		message.indexOf('e');                //int
//		message.indexOf("lo");                //
//		message.substring(2);                //string
//		message.substring(2,4);              //
//		message.replace("ll", "*@");         //string
//		//message.startWith("H")         //string
//	    //message.endWith("~");         //string
		
//메소듣 오버로딩(overloading) : 메소드 이름과 리턴형식은 같고 인자값의 갯수와 형식이 다르게 지정된 것.		
		
		
		int len = message.length();              //"hello~" 의 문자 개수
		char temp = message.charAt(3);           //"hello~" 에서 3번쨰 문자 리턴
		boolean isState = message.equals("Hello~"); //"hello~"가 Hello~인지 비교       소문자 대문자
		
		System.out.println("length() = " + len); //6 글자수
		System.out.println("charAt(3) = " + temp); //l in
		System.out.println("equals(\"Hello\")  = " + isState); //hello 와 일치하는가 false
		
		System.out.println("indexOf('e') =" + message.indexOf('e')); //1번위치 , 0번부터시작
		System.out.println("indexOf(\"lo\") )=" + message.indexOf("lo")); //3번위치
		System.out.println("indexOf(\"lo\") )=" + message.indexOf("ol")); // -1:찾는 문자열이없을떄
		String test = "hello~hello~";
		System.out.println("test.indexOf(\"lo\") =  "+test.indexOf("lo")); //3번
		System.out.println("test.indexOf(\"lo\") =  "+test.lastIndexOf("lo")); // 일치하는 마지막위치 hello가 두번반복 9번째
		
		System.out.println("substring(2) =" + message.indexOf("lo"));    //3 'String' lo 는 문자열에서 3번쨰 0.1.2.3
		System.out.println("substring(2,4)) =" + message.substring(2,4));  //ll   , 2번부터 2개(4-2) hello ll
		System.out.println("substring(1,4)) =" + message.substring(1,4));  //ll   , 1번부터 3개(4-1) hello ell   
		System.out.println("replace(\"ll\", \"*@\")) =" + message.replace("ll", "*@")); //ll을 *@로 치환 : he*@o~
		System.out.println("statWith(\"H\") =" + message.startsWith("H"));  //소문자 h로시작 false
		System.out.println("endWith(\"~\") =" + message.endsWith("~"));     //~로 끝 true
		
		
		
		
		
	}

}
