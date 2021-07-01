package java1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DB {
	
//	ArrayList<OrderArray> orderList = new ArrayList<OrderArray>();
	public int num = 0;
	
	public void DB (Input input,  OrderArray list) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
		    Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/goodslist", "root", "111111");
		    String sql = "insert into input(productNo, name, price, count, total) values(?,?,?,?,?)";	    
		    
		    PreparedStatement pstmt = conn.prepareStatement(sql);
		    
		    Statement stmt = conn.createStatement(); 
		    Statement st = conn.createStatement();
		    
		    ResultSet rset = stmt.executeQuery("SELECT * FROM goods where no=" + input.inputNo);
		    ResultSet rs = st.executeQuery("SELECT count(*) FROM goods");
		    
		    while (rs.next()) {
		    	num =rs.getInt(1);
		    } 
		    	    
		    if (rset.next()) { 
		    	System.out.printf("%d %s %d원\n", rset.getInt(1), rset.getString(2), rset.getInt(3));
		    	list.no = rset.getInt(1);
		    	list.name = rset.getString(2);
		    	list.price = rset.getInt(3);	
		    	
		    	input.InputCount();
			    list.count = input.count;
			    list.total = list.price * input.count;
		    } else {
		    
		    	System.out.println("해당하는 상품이 없습니다.");
		    			    	    	
		    }
		    				
		    pstmt.setInt(1,list.no);
		    pstmt.setString(2,list.name);
		    pstmt.setInt(3,list.price);
		    pstmt.setInt(4,list.count);
		    pstmt.setInt(5,list.total);
		    
		    pstmt.executeUpdate();
		    
		    rset.close(); 
		    stmt.close(); 
		    conn.close(); 
		} catch(Exception e) {
			e.printStackTrace();
		}
			
	}
	
}
