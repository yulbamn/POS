package java1;

import java.util.Scanner;

public class Input {

	public int inputNo = 0, count = 0, type = 0, no = 0;
	Scanner scan = new Scanner(System.in);
			
	public int InputNo() {
		System.out.print("��ǰ ��ȣ�� �Է��ϼ��� : " );
		inputNo = scan.nextInt();	
		return inputNo;
	}

	public int InputCount() {
		System.out.print("���� ���� : " );
	    count = scan.nextInt();	   
	    return count;
	}	

	public void add() {		
	    System.out.print("1. �߰�����  2. �������� : " );
	    type = scan.nextInt();
	}
	
}
