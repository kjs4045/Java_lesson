package koreait.day01;

public class C02_TwicePrint {

	public static void main(String[] args) {
		System.out.println("트와이스");
		System.out.println("이름\t생년월일\t\t나이");
		System.out.println("-----------------------------");
		System.out.println("사나\t1996.12.29\t27");          //한개 문자열을 출력
		System.out.println("지효\t1997.02.01\t26");
		System.out.println("미나\t1998.03.24\t25");
		//printf() 메소드 사용해서 출력형식 지정합니다
		//12칸문자열+자리수 지정하지 않은 문자열+5칸 정수
		//%s 는 지정된 칸에서 오른쪽맞춤, -%는 왼쪽맞춤.
		System.out.printf("%-12s%s%5d\n", "dayeon", "1998.05.28",25);
		System.out.printf("%-12s%s%5d\n", "momo", "1999.04.23",24);
		//System.out.printf("%-8s%s%8d\n", "nayeon", "1997.06.14");
		//printf 메소드에서 형식문자 갯수만큼 뒤에 나오는 데이터 갯수가 일치하지 않아 오류 발생
		//System.out.printf("%-8s%8d\n", "nayeon", "1997.06.14");
		//printf 메소드에서 형식문자와 뒤에 나오는 데이터 형식이 일치하지 않아 오류 발생
		System.out.println("=============연습===============");
		System.out.printf("%-12s%4d.%02d.%2d%5d\n", "dayeon", 1998,5,28, 25);
		System.out.printf("%-12s%4d.%02d.%2d%5d\n", "momo", 1999,4,23, 24);
		System.out.printf("%-12s%4d.%02d.%2d%5d\n", "nayeon", 1997,6,14, 26);
		//여기까지는 데이터르 직접 리터럴로 ("", 1998, true...etc)표현해서 출력
		
		//진도방향 : 변수 사용
		//System.out.printf("%-12s %4d.%2d.%2d %d\n",name,year,month,day,age);
		
		//printf 메소드에서 형식문자 갯수만큼 뒤에 나오는 데이터 갯수가 일치해야됩니다
	}

}
//출력에 사용되는 형식
//- \ (역슬래쉬) 사용하는 이스케이프 문자 : \n (줄바꿈) ,  \t(tab)= 일정간격 띄우기
//- % 형식지정문자 : %s(문자열), , %d(정수) 자리수를 지정해서 쓸 수 있습니다.
//                                      ㄴ남은 자리 0으로 채울떄에는 %03d 와 같이합니다.
// "" 안에 표시된 숫자는 정수가 x, 문자열입니다.
