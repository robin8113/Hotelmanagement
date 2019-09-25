package CustomerList;

import Main.Main;
import Register.Registration;

public class Customers {


	public void disp() {
        
		System.out.println("Customer List");
		System.out.println("The Registered Customers are:");
		System.out.println("Customer ID \t Customer Name");
		for(int i=0;i<Main.a.length;i++)
		{
			if(Registration.c[i]>0&&Main.a[i]!=null)
			{
		    System.out.println(Registration.c[i]+"\t \t  "+Main.a[i]);
		   }
	  }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
