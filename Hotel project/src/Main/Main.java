package Main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Booking.Booking;
import Customer.Customer;
import CustomerList.Customers;
import Emailupdate.Emailupdate;

import Register.Registration;
import RoomList.ListRooms;
import RoomStatus.Status;

public class Main {
	static Emailupdate obj1=new Emailupdate();
	static ListRooms list =new ListRooms();
	static Booking ob=new Booking();
	
	public static ArrayList<String> a=new ArrayList<String>();
	public static int namecount; 
	public static void main(String[] args) throws IOException {
		 
		  String Firstname,Lastname=null;
		  String address = null;
		  String contact = null;
		  String email = null;
		  String idtype=null;
		  String id=null;
		  
		Registration obj=new Registration();
		Customers obj2=new Customers();
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
		System.out.println("\n Enter your Choice \n 1.Registration \n 2.Booking \n 3.Email Updation \n 4.Status \n 5.View all Customers \n 6.View all Rooms \n 7.Exit");
		int n=Integer.parseInt(b.readLine());
		switch(n)
		{
		case 1:
			System.out.println();
		System.out.println("Enter the Name");
		Firstname=b.readLine();
		a.add(Firstname);
		System.out.println("Enter the LastName");
		Lastname=b.readLine();
		 
		System.out.println("Enter the Address");
		address=b.readLine();
		System.out.println("Enter the Contact Number");
		contact=b.readLine();
		System.out.println("Enter the Mail Id");
		email=b.readLine();
		System.out.println("Enter the ProofId");
		idtype=b.readLine();
		System.out.println("Enter the Proof Number");
		id=b.readLine();
		obj.register(Firstname,Lastname,address,contact,email,idtype,id);
		
		break;
		case 2:
			ob.display();
			break;
		case 3:
			String mail=obj1.update(email);
			obj.display(mail);
		    break;
		case 4:
			ob.status();
			break;
		case 5:
			obj2.disp();
			break;
		case 6:
			list.disp();
			break;
		case 7:
			System.out.println("Thank you for using our service......");
			System.exit(0);
			break;
			default:
				System.out.println("invalid choice");
		
		}
		}
		
	}

}
