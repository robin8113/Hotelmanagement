package CustomerList;

import Main.Main;
import Register.Registration;

public class Customers {


	public void disp() {
        
		System.out.println("Customer List");
		System.out.println("The Registered Customers are:");
		System.out.println("Customer ID \t Customer Name");
		for(int i=0;i<Main.a.size();i++)
		{
			if(Registration.c.get(i)>0&&Main.a.get(i)!=null)
			{
		    System.out.println(Registration.c.get(i)+"\t \t  "+Main.a.get(i));
		   }
	  }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
