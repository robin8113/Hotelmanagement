package Register;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Customer.Customer;

public class Registration {
	Customer ob=new Customer();
	public static int c[]=new int[25];
	
	public static int id=1,count=0;
	public void register(String fname,String lname,String adrs,String cont,String email,String idtype,String id )
	{
		ob.setFirstname(fname);
		ob.setLastname(lname);
		ob.setAddress(adrs);
		ob.setContact(cont);
		ob.setEmail(email);
		ob.setIdtype(idtype);
		ob.setId(id);
		display();
		
	}
	

	private void display() {
		System.out.println("Name : "+ob.getFirstname()+""+ob.getLastname()+"\n"+"Address : "+ob.getAddress()+"\n"+"Contact Number : "+ob.getContact()+"\n"+"Email : "+ob.getEmail()+"\n"+"ID Type: "+ob.getIdtype()+"\n"+"ID Number: "+ob.getId());
		// TODO Auto-generated method stub
		System.out.println("Thank you for  booking, your id is "+id); 
		c[count]=id++;
		count++;
	}
	
public void display(String mail)
{
	System.out.println("Email ID is updated \n Name : "+ob.getFirstname()+""+ob.getLastname()+"\n"+"Address : "+ob.getAddress()+"\n"+"Contact Number : "+ob.getContact()+"\n"+"Email : "+mail+"\n"+"ID Type: "+ob.getIdtype()+"\n"+"ID Number: "+ob.getId());
	
}



}
