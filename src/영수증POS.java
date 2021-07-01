package java1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ¿µ¼öÁõPOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<OrderArray> orderList = new ArrayList<OrderArray>();
		Input input = new Input();
		DB db = new DB();
		Print print = new Print();
		
		while(true) {
			input.InputNo();
			OrderArray list = new OrderArray();
			db.DB(input, list);

		    orderList.add(list);
		    input.add();
		    
			if(input.type == 2) {
				break;
			}	else {}
			
		}

		print.printOrder(orderList);

	}

}

	

