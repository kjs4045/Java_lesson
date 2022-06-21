package koreait.day06;

public class C32_ArrayManpulation {

	public static void main(String[] args) {
         //배열요소의 삽입/삭제
		int[] test = {11,22,33,44,55,66,77};
		for(int i=0;i<test.length;i++)
			System.out.print(test[i] +"\t");
		
		
		
		
		//인덱스 k에 삽입할 때 - 오른쪽 인덱스 증가방향으로 이동
		int k=2;
		for(int i=test.length-2;i>=k;i--) 
			//for(int i=2;i<test.length-1;i++) 
		{
			test[i+1]=test[i];
			
		System.out.print(test[i] +"\t");
			System.out.println();
		}
		
		test[k]=23;
		for(int i=0;i<test.length;i++)
			System.out.print(test[i] +"\t");
		
		int[] test2 = {11,22,33,44,55,66,77};
		System.out.println();
		
		for(int i=3;i<test2.length;i++)
			test2[i-1]=test2[i];
		System.out.println();
		
		for(int i=0;i<test2.length;i++)
			System.out.print(test2[i] +"\t");
		
		//인덱스 2를 삭제할 때 - 왼쪽 인덱스 감소 방향으로 이동
		
	}

}
