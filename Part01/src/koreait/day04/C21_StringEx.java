package koreait.day04;

import java.util.Scanner;

public class C21_StringEx {
//작성자 : 김종성
	public static void main(String[] args) {

		/*  구글 이메일 계정을 체크하는 기능 구현 
		 *  1. @ 기호가 1개 포함되어야 합니다.	(메시지 : 이메일 형식이 아닙니다.)
		 *  		ㄴ indexof 가 -1이 아니고 indexof 와 lastindexof 가 같은 값인가?
		 *  
		 *  2. 1번이 참일 때 @ 뒤에는 gmail.com 이어야 합니다. (메시지 : 도메인 이름이 틀립니다.)
		 *  		ㄴ '@' 의 indexof 를 구해서 그 뒤부터 끝까지 substring 추출한 문자열을 equals 비교
		 *  
		 *  3. 2번이 참일 떄 @ 앞까지의 문자열(계정이름)만 추출합니다.
		 *  		ㄴ '@' 의 indexof 를 구해서 처음 부터 '@' 이전 까지의 문자열 substring 저장
		 *  
		 *  4. 3번의 계정이름은 6글자 이상이어야 합니다.
		 *  		ㄴ 3번의 문자열이 length() 값 6인지 비교
		 *  
		 *  5. 3번의 계정이름에는 특수기호 $,%가 포함되면 안됩니다. 
		 *   		ㄴ indexof('$') , indexof('%') 가 모두 -1이 아니면 허용안하는 기호 포함
		 */
		//입력한 email이 처리조건 1,2,4,5에 해당하지 않으면 메시지 출력하고 isValid 변수를 false로 합니다. ->isValid 출력
		
		Scanner sc = new Scanner(System.in);
        String email;
        boolean isValid=true;
        
        
        
        System.out.print("사용할 이메일 입력하세요. >>>");
        
        email = sc.nextLine();           //키보드 입력을 문자열로 처리합니다.
        
        int index = email.indexOf("@");
        
        String account = email.substring(0, email.indexOf("@"));  // || email.indexOf("@")=9
        String domain = email.substring(email.indexOf("@")+1, email.length());
        int len = account.length();
        boolean isState = domain.equals("gmail.com");
        String gmail ="gmail.com";
        int no= email.indexOf("$");
        int mo= email.indexOf("%");
        System.out.println(index);
        System.out.println(email.lastIndexOf("@")); 
        
        System.out.println(domain);
	    
	    System.out.println("도메인일치?" + isState);
	    System.out.println(account);
	    
	    System.out.println("아이디의 길이" + len);
	    
	    if(len<6 && "gmail"!=domain) { isValid=false;
	    System.out.println("사용 불가능한 아이디 입니다.");
	    }else {isValid=true;
	    System.out.println("사용 가능한 아이디 입니다.");
	    }
	}

}
