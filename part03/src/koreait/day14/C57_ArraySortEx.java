package koreait.day14;

public class C57_ArraySortEx {

	//�迭�� ����� ���� �����ϱ� ���� �����غ���.
	public static void main(String[] args) {

		String[] names= {"����","����","����","�ź�","����","���"};
		
		System.out.println("nums ����Ʈ ���� : "  + names);
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
