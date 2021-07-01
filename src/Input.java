package java1;

import java.util.Scanner;

public class Input {

	public int inputNo = 0, count = 0, type = 0, no = 0;
	Scanner scan = new Scanner(System.in);
			
	public int InputNo() {
		System.out.print("상품 번호를 입력하세요 : " );
		inputNo = scan.nextInt();	
		return inputNo;
	}

	public int InputCount() {
		System.out.print("구매 갯수 : " );
	    count = scan.nextInt();	   
	    return count;
	}	

	public void add() {		
	    System.out.print("1. 추가구매  2. 구매종료 : " );
	    type = scan.nextInt();
	}
	
}
