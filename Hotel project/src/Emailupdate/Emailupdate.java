package Emailupdate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Emailupdate {
	
	public String update(String s) throws IOException
	 {  
		 while(true)
		 {
		 System.out.println("enter the new mail id to update");
		 BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		 String s1=b.readLine();
		 if(s.contentEquals(s1))
		 {
			 System.out.println("the id is same"); 
			 
		 }
		 else
		 {
			 return s1;
			 
		 }
		
		 }
	 }
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
