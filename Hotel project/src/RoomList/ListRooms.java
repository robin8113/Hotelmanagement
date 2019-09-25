package RoomList;

import java.util.Scanner;

import Main.Main;
import Booking.Booking;
import Register.Registration;

public class ListRooms {
     
public void disp() {
        
		System.out.println("Room List");
		System.out.println("The Registered Customers are:");
		System.out.println("Enter the start date");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println("Enter the end date");
		int m=sc.nextInt();
		System.out.println("Customer ID \t Rooom Numbers");
		for(int i=0;i<Booking.date.length;i++)
		{
			//if((Booking.c[i]==Registration.id-1)&& (i+1)<25)
				//Booking.c[i+1]=Registration.id-1;
			//System.out.println(Registration.c[i]+" "+Booking.date[i]);
			if(Booking.c[i]<=Registration.id-1&&Booking.date[i]>=n&&Booking.date[i]<=m)
			{
						//		Registration.c[i+1]=Registration.c[i];

					System.out.println(Booking.c[i]+"\t \t  "+Booking.roomno[i]);
			}
			
	  }
	}
	

}
