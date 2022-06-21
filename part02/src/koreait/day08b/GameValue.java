package koreait.day08b;

import java.util.Random;

public class GameValue {        //���ӱ�� �����͸� �����ϱ� ���� Ŭ����
		
		private String gamer;		//���������� �̸� , �ʱⰪ null
		private int count; 			//���̸� �õ�Ƚ��, �ʱⰪ 0
		private boolean isSuccess;	//���߱� �������� , �⺻ �ʱⰪ false
		
		
		//Ŀ���� ������ : gamer �ʱⰪ ����
		public GameValue(String gamer) {
				this.gamer=gamer;
		}
		
		//��ü�� ����ϴ� �ν��Ͻ� �޼ҵ�
		public void print() {
			System.out.println("gamer : " + gamer + ", �õ�Ƚ�� : " + count + ",���� : " + isSuccess);
		}
		
		//static - ��ü�� �ν��Ͻ� �ʵ尪�� ������� �ʴ� ���. ��, ��ü�� ������� �޼ҵ� ����.
		public static int makeNumber(int min, int max) {	//min=101~max=299 : ������ �ּҰ�,�ִ밪 ���ڷ� �ް� ���� ��ȯ
			Random r = new Random();
			return r.nextInt(max-min+1)+min;    //r.nextInt(199)+101;  -> 0~198 + 101
		}// ���� : r.nextInt(100) ��  0~99 ������ ����


		//getter �� setter : boolean Ÿ���� getter �޼ҵ� �̸��� isXXX()�Դϴ�. 

		public void setCount(int count) {
			this.count = count;
		}
		public int getCount() {
			return count;
		}
		public void setGamer(String gamer) {
			this.gamer = gamer;
		}
		public String getGamer() {
			return gamer;
		}
		public void setSuccess(boolean isSuccess) {
			this.isSuccess = isSuccess;
		}
		private void get() {

		}
		
		
		
}