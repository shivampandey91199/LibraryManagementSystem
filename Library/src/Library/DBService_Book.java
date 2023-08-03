package Library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DBService_Book {

	public static void insertBook(int bid, String bname, String bauthor, int bquantity, int bprice, String bcategory,int rack) {
		{
			try {
				Connection con = DBConnection.createConnection();
				String sql = "insert into book(id,name,author,quantity,price,Category,rack)values(?,?,?,?,?,?,?)";
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setInt(1, bid);
				pst.setString(2, bname);
				pst.setString(3, bauthor);
				pst.setInt(4, bquantity);
				pst.setInt(5, bprice);
				pst.setString(6, bcategory);
				pst.setInt(7, rack);
				pst.executeUpdate();
				System.out.println("Book insert");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static void deleteBook(int id) {
		try {
			Connection con = DBConnection.createConnection();
			String sql = "delete from book where id=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			pst.executeUpdate();
			System.out.println("book Deleted");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void searchById(int id) {
			try { 
				Connection con = DBConnection.createConnection();
			    String sql = "select * from book where id=?";
			    PreparedStatement pst = con.prepareStatement(sql);
				 pst.setInt(1, id);
				 ResultSet rs=pst.executeQuery();
				 if(rs.next()) {
						int bid=rs.getInt(1);
					    String bname=rs.getString(2);
					    String bauthor=rs.getString(3);
					    int bquantity=rs.getInt(4);
					    int bprice=rs.getInt(5);
					    String bcategory=rs.getString(6);
					    int rack=rs.getInt(7);
				    System.out.println("Category--id--Book_name--author--qty--price--RackNo");
				    System.out.println(bcategory+"--"+bid+"--"+bname+"--"+bauthor+"--"+bquantity+"--"+bprice+"--"+rack);
						 
				 }
				  
			} catch (Exception e) {
			    e.printStackTrace();
			}
		}

	public static void searchByname(String name) {
		try { 
			Connection con = DBConnection.createConnection();
		    String sql = "select * from book where name=?";
		    PreparedStatement pst = con.prepareStatement(sql);
			 pst.setString(1, name);
			 ResultSet rs=pst.executeQuery();
			 if(rs.next()) {
					int bid=rs.getInt(1);
				    String bname=rs.getString(2);
				    String bauthor=rs.getString(3);
				    int bquantity=rs.getInt(4);
				    int bprice=rs.getInt(5);
				    String bcategory=rs.getString(6);
				    int rack=rs.getInt(7);
			    System.out.println("Category--id--Book_name--author--qty--price--RackNo");
			    System.out.println(bcategory+"--"+bid+"--"+bname+"--"+bauthor+"--"+bquantity+"--"+bprice+"--"+rack);
			 }
			  
		} catch (Exception e) {
		    e.printStackTrace();
		}
 	}
	public static void getAllBook(){
	
		try {
			Connection con = DBConnection.createConnection();
			String sql = "select * from book";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				int bid=rs.getInt(1);
			    String bname=rs.getString(2);
			    String bauthor=rs.getString(3);
			    int bquantity=rs.getInt(4);
			    int bprice=rs.getInt(5);
			    String bcategory=rs.getString(6);
			    int rack=rs.getInt(7);
			    System.out.println("Bid----bname----bauthor----bquantiy----bprice----bcategory----RAckNo");
			    System.out.println(bid+"----"+bname+"----"+bauthor+"----"+bquantity+"----"+bprice+"----"+bcategory+"----"+rack);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void editBookData(int id) {
		try {
			Connection con=DBConnection.createConnection();
			String sql="select * from book where id=?";
			PreparedStatement pst=con.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				
			}}catch (Exception e) {
				 e.printStackTrace();
			}
		
		
	}
	
		}
	
