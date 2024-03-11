package com.techpalle.model;

import java.sql.*;
import java.util.ArrayList;

public class DataAccess {
	static String url = "jdbc:mysql://localhost:3306/j2eeproject";
	static String user = "root";
	static String pass = "Kamala@1973";
	static Connection con = null;

	public static ArrayList<Student> getStudents(){
		ArrayList<Student> al = new ArrayList<Student>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pass);
			Statement st = con.createStatement();
			ResultSet rs =  st.executeQuery("select * from student");
			if(rs != null) {
				while(rs.next()) {
					int sno = rs.getInt(1);
					String sname = rs.getString(2);
					String scourse = rs.getString(3);
					String sgender = rs.getString(4);
					String semail = rs.getString(5);
					String seducation = rs.getString(6);
					Student s = new Student(sno, sname, scourse,sgender,semail,seducation);
					al.add(s);  
				}
			}
			con.close();
			st.close();
			
		}catch (SQLException | ClassNotFoundException e) {
			// TODO: handle exception
		}
		
		return al;
		
	}
	
//	inserting student details into database
	
	public static void insertStudent(String name, String course,String gender,String email,String education) {
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement("insert into student(sname,course,gender,email,education)values(?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, course);
			ps.setString(3, gender);
			ps.setString(4, email);
			ps.setString(5, education);
			ps.executeUpdate();
			con.close();
			ps.close();	
		}
		catch (Exception e) {
			// TODO: handle exception
		}
			}
	
	
	
//	checking for admin credentials
	public static boolean checkAdminLogin(String email, String pw) {
		int count = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pass);
			Statement s = con.createStatement();
			ResultSet res = s.executeQuery("select * from admin");
			if(res != null) {
				while(res.next() == true) {
					String dbemail = res.getString(2);
					String dbpw = res.getString(3);
					if(dbemail.equals(email) && dbpw.equals(pw)) {
						count++;
						break;
					}
				}
			}
			s.close();
			con.close();
//			System.out.println(count);
			if(count == 1) {
				return true;
			}else {
				return false;
			}
			
		} catch (ClassNotFoundException |SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return false;
	}
	
}
