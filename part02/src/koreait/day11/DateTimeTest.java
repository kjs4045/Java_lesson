package koreait.day11;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeTest {

	public static void main(String[] args) {

		//����ð� :ms ,ns (1970�� 1�� 1�� ������ �������� �������� ī��Ʈ�� ���Դϴ�.)
		
		//1��, 1���� ���� ��ms �ϱ��? 1��= 1000ms(1ms=0.001��)
		//1��, 24�ð�* *60�� *60��*1000 = > result ������ ������ ������.
		int result = 24*60*60*1000;
		System.out.println("1���� " + result + "ms �Դϴ�.");
		System.out.println("1���� " +result*365L + "ms �Դϴ�.");
		
		DecimalFormat df = new DecimalFormat("###,###,###,###");
		System.out.println("1���� " +df.format(result*365L) + "ms �Դϴ�.");
		//String.format("%15s", ~ ) ���� �ϸ� �ڸ� ���� ��ġ�� ���� �� �ֽ��ϴ�.
		
		/*
		 * ��¥�� �ð������� �ٷ�� �ڹ�Ŭ������ �����մϴ�.
		 * 1)java.uti.Date Ŭ���� 2) java.util.Calendar Ŭ���� -> �� 2�� Ŭ������ ������Ŭ����
		 * 3)java 8 ���� java.time.LocalDate(����) , LocalTime(�ð�) , LocalDateTime(��¥�� �ð�) Ŭ����
		 * 
		 * 
		 */
		
		//now() �޼ҵ�� ���� �ð�,��¥ ��ü ����
		LocalDate currentDate = LocalDate.now();                //static �޼ҵ�� ��ü�� ����
		System.out.println("��¥ Ȯ��: " + currentDate);
		
		LocalTime currenTime = LocalTime.now();
		System.out.println("�ð� Ȯ��: " + currenTime);
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println("��¥�� �ð� Ȯ��: " + current);
		
		LocalDate mybirth = LocalDate.of(1993, 03, 13);
		//of() �޼ҵ�� Ư�� �ð� �� ��¥ ��ü ����
		LocalTime mybirth_time = LocalTime.of(18, 10);
		System.out.println("�� ź���ð� : " + mybirth_time);
		
		// �� ���� Ŭ������ ��¥ ������ ���� �Ի� Ŭ������ �ֽ��ϴ�.
		Period between = Period.between(mybirth, currentDate);
		System.out.println("���� �¾�� " + between.getYears()+ "��(years)");
		System.out.println("���� �¾�� " + between.getMonths()+ "����(months)");
		System.out.println("���� �¾�� " + between.getDays()+ "��(days)");
	
		
		System.out.println("�׽�Ʈ : " + ChronoUnit.DAYS.between(mybirth, currentDate));
		
	}
	
	

}
