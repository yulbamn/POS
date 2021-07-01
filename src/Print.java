package java1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Print {
	public int sum = 0;
	String pattern1 = "yyyy-MM-dd";
	String pattern2 = "yyyy-MM-dd HH:mm:ss";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern1);
	SimpleDateFormat simpleTimeFormat = new SimpleDateFormat(pattern2);
	String today = simpleDateFormat.format(new Date());
	String time = simpleTimeFormat.format(new Date());
	
	public void printOrder(ArrayList<OrderArray> orderList) {
		
		 System.out.printf("%21s\n","[�� �� ��]");
		 System.out.printf("\n");
		 System.out.println("KOPOī��(������) / 123-45-67890 / ��濭");
		 System.out.println("��⵵ ������ �д籸 Ȳ�����329���� 5");
		 System.out.println("031-696-8800  /"+"\t"+today);
		 System.out.println(time);
		 System.out.println("-------------------------------------");
		 System.out.printf("%s\t\t%s\t%s\t%s\n", "�� ǰ ��", "�� ��", "�� ��", "�� ��");
		 System.out.println("-------------------------------------");		    
		 for(int i=0; i < orderList.size(); i++) {
			 System.out.printf("%s\t\t%d\t %d\t%d\n", orderList.get(i).name, orderList.get(i).price, orderList.get(i).count, orderList.get(i).total);		
			 sum += orderList.get(i).total;
		 }
		 System.out.println("-------------------------------------");
		 System.out.printf("    %s\t  %d\n", "�ΰ��� ������ǰ����", sum-(sum/11));
		 System.out.printf("    %s\t  %d\n", "��    ��    ��", sum/11);
		 System.out.println("-------------------------------------");
		 System.out.printf("%-27s%d\n", "�� �� �� �� :", sum);
		 System.out.printf("%-27s%s\n", "�� �� �� �� :", "�� ��");
		 System.out.println("-------------------------------------");
		 System.out.println("�� �� �� �� :"+"\t\t"+today);
		 System.out.printf("%s\t\t%d\n", "������ ��ȣ :", 123456789);
		 System.out.printf("%s\n", "EDC ����ǥ");
	}
	
}
