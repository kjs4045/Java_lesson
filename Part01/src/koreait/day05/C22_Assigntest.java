package koreait.day05;

public class C22_Assigntest {

	public static void main(String[] args) {

		//c참고 : 증가연산자, 축약연산자(+=,-=,*=,/=,...)(
		int i = 10, sum=0;
		i=i+1; //i=11
		i+=1;  //i=12
		i++;   //i=13     (후치:postfix)
		++i;   //i=14     (전치:prefix)
		
		System.out.println("i++? " +i++ );   //출력은,14 i값은 15      출력 후 더하기
		System.out.println("++i? " +(++i)); // 출력 16, i값 16    더한 후 출력
		sum = sum+i;
		sum+=i;
		System.out.println("sum  ?" + sum);    //
		
		//
		i--;
		--i;
		sum = sum -10;
		sum -= 10;
	}

}
