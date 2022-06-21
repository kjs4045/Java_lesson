package koreait.day17;

public class Score {
		private String name;
		private int korean;
		private int english;
		private int science;
		private String grade;  //getter ,setter 작성해보기
					//값 예시 : A+,A,B+,B....
		
		
		public Score() {
		}
		public Score(String name, int korean, int english , int science) {
			this.english=english;
			this.name=name;
			this.korean=korean;
			this.science=science;
		}
		
		//인스턴스 메소드
		public int sum() {
			int result = this.korean+this.english+this.science;
		//	setGrade(grade);		//객체가 sum() 실행하면 setGrade 도 호출되어 실행
			return result;
		}
		private void setGrade(String grade) {
			 if(average() >=90) this.grade="A+";
			 else if(average() >=80) this.grade="B";
			 else if(average() >=70) this.grade="C";
			 else if(average() >=60) this.grade="D";
			 else this.grade="F";
			}
		String getGrade() {
			setGrade(grade);
			return grade;
		}
			
		public double average() {
			return (double)sum()/3;
		}
		
		
		public int getEnglish() {
			return english;
		}
		public void setEnglish(int english) {
			this.english = english;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getKorean() {
			return korean;
		}
		public void setKorean(int korean) {
			this.korean = korean;
		}
		public int getScience() {
			return science;
		}
		public void setScience(int science) {
			this.science = science;
		}
		
		//setter를 변경하기 :  실행 내용과 접근한정자

		@Override
		public String toString() {
			return "Score [name=" + name + ", korean=" + korean + ", english=" + english + ", science=" + science
					+ ", grade=" + grade + "]";
		}
		
		
	
		
		
}
