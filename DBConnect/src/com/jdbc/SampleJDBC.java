package com.jdbc;

import java.sql.*;


class SampleJDBC {
	
	static String RandGeneratedStr(int l,String str){
	 String AlphaNumericStr = str;
	 StringBuilder s = new StringBuilder(l);
	 int i;

	 for ( i=0; i<l; i++) {
	   int ch = (int)(AlphaNumericStr.length() * Math.random());
	   s.append(AlphaNumericStr.charAt(ch));
	  }
	    return s.toString();
	 }
	
	public static void main(String[] args) throws SQLException {
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/gravity_books","root","");
		Statement st = connect.createStatement();
		PreparedStatement s = connect.prepareStatement("INSERT INTO order_history (history_id, order_id, status_id, status_date) VALUES (?,?,?,?);");
		for(int i=1;i<=2000;i++) {
			s.setInt(1,i);
			s.setInt(2, (int)(4999*Math.random()+1));		
			s.setInt(3, (int)(6*Math.random()+1));
			s.setString(4, (int)(22*Math.random()+2000)+"-"+(int)(12*Math.random()+1)+"-"+(int)(28*Math.random()+1));
			s.executeUpdate();
		}
			
			
	}
}