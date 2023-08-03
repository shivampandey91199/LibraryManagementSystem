package Library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

public class DBService {
	
	public static void userInsert(int id,String name,long contact,String password) {
		try {
			Connection con = DBConnection.createConnection();
			String sql = "insert into user(id,name,contact,password)values(?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setLong(3, contact);
			pst.setString(4, password);
			pst.executeUpdate();
			System.out.println("Data insert");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean loginUser(String Uname,String Upassword) {
		boolean flag=false;
		try {
			Connection con = DBConnection.createConnection();
			String sql = "select * from user where name=? and password=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, Uname);
			pst.setString(2, Upassword);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				 flag=true;
				}
				} catch (Exception e) {
			e.printStackTrace();
		}
       return flag;
	  }
	public static boolean checkOldPassword(String name ,String password) {
		boolean flag=false;
		try {

			Connection con=DBConnection.createConnection();
			String sql="select * from user where name =? and password=?";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, name);
			pst.setString(2, password);
			ResultSet rs=pst.executeQuery();
			 if(rs.next()) {
				 flag=true;
				 System.out.println(flag);
			 }
		} catch (Exception e) {
		 e.printStackTrace();	
		}
		return flag;
	}
	public static void updatePassword(String name,String newPassword) {
		try {
			Connection con = DBConnection.createConnection();
			String sql = "update user set password=? where name=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, name);
			pst.setString(2, newPassword);
			pst.executeUpdate();
			System.out.println("Password updated");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
