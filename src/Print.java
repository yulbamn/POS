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
		
		 System.out.printf("%21s\n","[영 수 증]");
		 System.out.printf("\n");
		 System.out.println("KOPO카페(서현점) / 123-45-67890 / 김경열");
		 System.out.println("경기도 성남시 분당구 황새울로329번길 5");
		 System.out.println("031-696-8800  /"+"\t"+today);
		 System.out.println(time);
		 System.out.println("-------------------------------------");
		 System.out.printf("%s\t\t%s\t%s\t%s\n", "상 품 명", "가 격", "수 량", "금 액");
		 System.out.println("-------------------------------------");		    
		 for(int i=0; i < orderList.size(); i++) {
			 System.out.printf("%s\t\t%d\t %d\t%d\n", orderList.get(i).name, orderList.get(i).price, orderList.get(i).count, orderList.get(i).total);		
			 sum += orderList.get(i).total;
		 }
		 System.out.println("-------------------------------------");
		 System.out.printf("    %s\t  %d\n", "부가세 과세물품가액", sum-(sum/11));
		 System.out.printf("    %s\t  %d\n", "부    가    세", sum/11);
		 System.out.println("-------------------------------------");
		 System.out.printf("%-27s%d\n", "합 계 금 액 :", sum);
		 System.out.printf("%-27s%s\n", "할 인 금 액 :", "없 음");
		 System.out.println("-------------------------------------");
		 System.out.println("거 래 일 시 :"+"\t\t"+today);
		 System.out.printf("%s\t\t%d\n", "가맹점 번호 :", 123456789);
		 System.out.printf("%s\n", "EDC 매출표");
	}
	
}
