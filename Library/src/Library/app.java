package Library;

import java.util.Scanner;
class Book{
	Book(){

		System.out.println("1 Add Book");
		System.out.println("2 Delete Book");
		System.out.println("3 Search Book");
		System.out.println("4 view Book List");
		System.out.println("5 Edit Book Record");
		System.out.println("6 Change Password");
		System.out.println("7 Close App");
		System.out.println("Enter your Choice");
	    	}
}

public class app { 
	static Scanner sc;
	public static void Book() {
		 int Choice=sc.nextInt();
		 switch (Choice) {
		case 1: {
			System.out.println("1. Computers");
			System.out.println("2. Electronics");
			System.out.println("3. Electrical");
			System.out.println("4. Civil");
			System.out.println("5. Mechanical");
			System.out.println("6. Architecture");
			System.out.println("7. Back to main menu");
			System.out.println("====================================");
			System.out.println("Enter Choice for Book");
			int bookChoice=sc.nextInt();
			switch (bookChoice) {
			case 1: {
				
				System.out.print("Enter Book Id: ");
				int bid = sc.nextInt();
				System.out.print("Enter Book Name: ");
				String bname = sc.next();
				System.out.print("Enter Author Name: ");
				String bauthor = sc.next();
				System.out.print("Enter book quantity: ");
				int bquantity = sc.nextInt();
				System.out.print("Enter the price: ");
				int bprice = sc.nextInt();
				System.out.print("Enter the category: ");
				String bcategory = sc.next();
				System.out.println("Rack No");
				int rack=sc.nextInt();
				DBService_Book.insertBook(bid, bname, bauthor, bquantity, bprice, bcategory,rack);
				System.out.println();
		    	   System.out.println("Do you want anything else (yes/no) ");
		    	  String again=sc.next();
		    	   if(again.equalsIgnoreCase("yes")) {
		    		   new Book();
		    	   }else if(again.equalsIgnoreCase("No")) {
		    	      System.exit(1);
		    	   }
			break;
			}
			case 2: {
				System.out.print("Enter Book Id: ");
				int bid = sc.nextInt();
				System.out.print("Enter Book Name: ");
				String bname = sc.next();
				System.out.print("Enter Author Name: ");
				String bauthor = sc.next();
				System.out.print("Enter book quantity: ");
				int bquantity = sc.nextInt();
				System.out.print("Enter the price: ");
				int bprice = sc.nextInt();
				System.out.print("Enter the category: ");
				String bcategory = sc.next();
				System.out.println("Rack No");
				int rack=sc.nextInt();
				DBService_Book.insertBook(bid, bname, bauthor, bquantity, bprice, bcategory,rack);
				System.out.println();
		    	   System.out.println("Do you want anything else (yes/no) ");
		    	  String again=sc.next();
		    	   if(again.equalsIgnoreCase("yes")) {
		    		   new Book();
		    	   }else if(again.equalsIgnoreCase("No")) {
		    	      System.exit(1);
		    	   }
	
				break;
		    	   		}
			case 3: {
				System.out.print("Enter Book Id: ");
				int bid = sc.nextInt();
				System.out.print("Enter Book Name: ");
				String bname = sc.next();
				System.out.print("Enter Author Name: ");
				String bauthor = sc.next();
				System.out.print("Enter book quantity: ");
				int bquantity = sc.nextInt();
				System.out.print("Enter the price: ");
				int bprice = sc.nextInt();
				System.out.print("Enter the category: ");
				String bcategory = sc.next();
				System.out.println("Rack No");
				int rack=sc.nextInt();
				DBService_Book.insertBook(bid, bname, bauthor, bquantity, bprice, bcategory,rack);
				System.out.println();
		    	   System.out.println("Do you want anything else (yes/no) ");
		    	  String again=sc.next();
		    	   if(again.equalsIgnoreCase("yes")) {
		    		   new Book();
		    	   }else if(again.equalsIgnoreCase("No")) {
		    	      System.exit(1);
	
		    	   }	   			break;
			}
			case 4: {
				System.out.print("Enter Book Id: ");
				int bid = sc.nextInt();
				System.out.print("Enter Book Name: ");
				String bname = sc.next();
				System.out.print("Enter Author Name: ");
				String bauthor = sc.next();
				System.out.print("Enter book quantity: ");
				int bquantity = sc.nextInt();
				System.out.print("Enter the price: ");
				int bprice = sc.nextInt();
				System.out.print("Enter the category: ");
				String bcategory = sc.next();
				System.out.println("Rack No");
				int rack=sc.nextInt();
				DBService_Book.insertBook(bid, bname, bauthor, bquantity, bprice, bcategory,rack);
				System.out.println();
		    	   System.out.println("Do you want anything else (yes/no) ");
		    	  String again=sc.next();
		    	   if(again.equalsIgnoreCase("yes")) {
		    		   new Book();
		    	   }else if(again.equalsIgnoreCase("No")) {
		    	      System.exit(1);
	
				break;
		    	   }		}
			case 5: {
				System.out.print("Enter Book Id: ");
				int bid = sc.nextInt();
				System.out.print("Enter Book Name: ");
				String bname = sc.next();
				System.out.print("Enter Author Name: ");
				String bauthor = sc.next();
				System.out.print("Enter book quantity: ");
				int bquantity = sc.nextInt();
				System.out.print("Enter the price: ");
				int bprice = sc.nextInt();
				System.out.print("Enter the category: ");
				String bcategory = sc.next();
				System.out.println("Rack No");
				int rack=sc.nextInt();
				DBService_Book.insertBook(bid, bname, bauthor, bquantity, bprice, bcategory,rack);
				System.out.println();
		    	   System.out.println("Do you want anything else (yes/no) ");
		    	  String again=sc.next();
		    	   if(again.equalsIgnoreCase("yes")) {
		    		   new Book();
		    	   }else if(again.equalsIgnoreCase("No")) {
		    	      System.exit(1);
	
				break;
		    	   }		}
			case 6: {
				System.out.print("Enter Book Id: ");
				int bid = sc.nextInt();
				System.out.print("Enter Book Name: ");
				String bname = sc.next();
				System.out.print("Enter Author Name: ");
				String bauthor = sc.next();
				System.out.print("Enter book quantity: ");
				int bquantity = sc.nextInt();
				System.out.print("Enter the price: ");
				int bprice = sc.nextInt();
				System.out.print("Enter the category: ");
				String bcategory = sc.next();
				System.out.println("Rack No");
				int rack=sc.nextInt();
				DBService_Book.insertBook(bid, bname, bauthor, bquantity, bprice, bcategory,rack);
				System.out.println();
		    	   System.out.println("Do you want anything else (yes/no) ");
		    	  String again=sc.next();
		    	   if(again.equalsIgnoreCase("yes")) {
		    		   new Book();
		    	   }else if(again.equalsIgnoreCase("No")) {
		    	      System.exit(1);
	
				break;
		    	   }		}
			case 7: {
				new Book();
			}
			}
			break;
		 }
		case 2: {
			System.out.println("you select delete option");
			System.out.print("Enter Book Id to delete : ");
			int id=sc.nextInt();
			DBService_Book.deleteBook(id);
			break;
		}
		case 3: {
			System.out.println("1.Search by id\n2.Search by name");
			int search=sc.nextInt();
			switch (search) {
			case 1: {
				    System.out.println("Enter Id For Search Book");
				    int id=sc.nextInt();
			        DBService_Book.searchById(id);
				    break;		}
			case 2 :{
				System.out.println("Enter Name For Search Book");
				String name=sc.next();
				DBService_Book.searchByname(name);
				break;		
			}
			
			}}
		case 4: {
			
			DBService_Book.getAllBook();
			
			break;
		}
		case 5: {
			
			break;
		}
		case 6: {
			System.out.println("Enter your Name");
			String name=sc.next();
			System.out.println("Enter your password");
			String oldPassword=sc.next();
			boolean flag=DBService.checkOldPassword(name, oldPassword);
			 if(flag == true) {
				 System.out.println("Enter your new password");
				 String newPassword=sc.next();
				 DBService.updatePassword(name, newPassword);
	             			 
			 }else {
				 System.out.println("OldPassword is incorrect");
			 }
			
			break;
		}
		case 7: {
			System.exit(1);
		}
		
		 }
			    
        	}
	public static void main(String[] args) {
		System.out.println("welcome to Library Management System");
		System.out.println("1.New User\n2.Login");
	    sc=new Scanner(System.in);
		int num=sc.nextInt();
		switch (num) {
		case 1: {
			System.out.println("Register");
			System.out.print("Enter ID:");
			int id = sc.nextInt();
			System.out.print("Enter Name: ");
			String name =sc.next();
			System.out.print("Enter Contact: ");
			long contact = sc.nextLong();
			System.out.print("Enter Password: ");
			String password = sc.next();
			DBService.userInsert(id, name, contact, password);
			System.out.println("insert data");
			break;
		    	}
		case 2: {
			System.out.println("---Login---");
			System.out.print("Enter Name: ");
			String Uname =sc.next();
			System.out.print("Enter password: ");
			String Upassword = sc.next();
			boolean flag=DBService.loginUser(Uname, Upassword);
			if(flag == true) {
				 new Book();
				 app.Book();
				}
			else {
				System.out.println("Your name or password is incoorect");
			}
		
		}
		break;
		default:{
			System.exit(1);
		}
		}
	}

}
