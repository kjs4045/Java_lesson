package koreait.day14;

public class C57_ArraySortEx {

	//배열에 저장된 값을 정렬하기 직접 구현해보기.
	public static void main(String[] args) {

		String[] names= {"제니","다현","나연","신비","은하","모모"};
		
		System.out.println("nums 리스트 상태 : "  + names);
		for(int i=0;i<names.length-1;i++) {
		int	k=i+1;
          for(k=0;k<names.length;k++) {
        	  if (names[i].compareTo(names[k])>0);{
        		  String temp = names[i];
        		  names[i]  = names[k];
        		  names[k] = temp;
        	  }
        	     
        	  
        		  
          }
          for (	i = 0 ; i < names.length; i++)
          {
        	  System.out.printf("%s , ", names[i]);
          }
		}
	}

}
