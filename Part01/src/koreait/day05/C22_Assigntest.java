package koreait.day05;

public class C22_Assigntest {

	public static void main(String[] args) {

		//c���� : ����������, ��࿬����(+=,-=,*=,/=,...)(
		int i = 10, sum=0;
		i=i+1; //i=11
		i+=1;  //i=12
		i++;   //i=13     (��ġ:postfix)
		++i;   //i=14     (��ġ:prefix)
		
		System.out.println("i++? " +i++ );   //�����,14 i���� 15      ��� �� ���ϱ�
		System.out.println("++i? " +(++i)); // ��� 16, i�� 16    ���� �� ���
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
