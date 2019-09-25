package Booking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


import Register.Registration;
import RoomStatus.Status;

public class Booking {
	int tot=0;
	int count=0;
	int num;
	static int i=0,j=5,k=15,l=10,dcount=0,rcount=0,idcount=0,cidcount=0;
	public static int c[]=new int[25];
	public static int roomno[]=new int[25];
	String m,m1,m2,m3,m4;
	static int a[]=new int[25];
	public static int cid[]=new int[25];
	 int b1[]=new int[25];
	 public static int date[]=new int[25];
	Scanner sc=new Scanner(System.in);
	BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
	
	public void display() throws IOException
	{
		tot=0;
			
		System.out.println("Enter Your Register id");
		 num=sc.nextInt();
		
			 
		  if(num==(Registration.id-1))
		   {
			 
		System.out.println("Enter ac for Ac(Rs.1000)/ nac for non-AC(Rs.750)");
		m=b.readLine();
		if(m.equalsIgnoreCase("ac"))
		{
			tot=tot+1000;
		}
		else if(m.equalsIgnoreCase("nac"))
		{
			tot=tot+750;
		}
	
		System.out.println("Enter s for cot(single)(Rs.0)/ d for cot(double)(Rs.350)");
		 m1=b.readLine();
		if(m1.equalsIgnoreCase("s"))
		{
			tot=tot+0;
		}
		else if(m1.equalsIgnoreCase("d"))
		{
			tot=tot+350;
		}
		
		System.out.println("Enter c for with cable connection(Rs.50)/ nc for without cable connection(Rs.0)");
		 m2=b.readLine();
		if(m2.equalsIgnoreCase("c"))
		{
			tot=tot+50;
		}
		else if(m2.equalsIgnoreCase("nc"))
		{
			tot=tot+0;
		}
		
		System.out.println("Enter w for wifi connection(Rs.200)/ nw for without wifi connection(Rs.0)");
		 m3=b.readLine();
		if(m3.equalsIgnoreCase("w"))
		{
			tot=tot+200;
		}
		else if(m3.equalsIgnoreCase("nw"))
		{
			tot=tot+0;
		}
	
		System.out.println("Enter l for Laundary service(Rs.100)/ nl for without Laundary Service(Rs.0)");
		 m4=b.readLine();
		if(m4.equalsIgnoreCase("l"))
		{
			tot=tot+100;
		}
		else if(m4.equalsIgnoreCase("nl"))
		{
			tot=tot+0;
		}
		System.out.println("enter the date of booking");
		
		 date[dcount++]=sc.nextInt();
		 System.out.println("**********************Room Booked**********************\n");
		 System.out.println("Total cost  of service = "+tot);
		 System.out.println("Do you need any correction(yes/no)");
		 String s=b.readLine();
		 if(s.equalsIgnoreCase("yes"))
		 {
			 display();
			 
		 }
		 else
		 {
			 room();
		 } 
			 }
	  
			 else
	{
		System.out.println("Invalid Id");
		System.out.println("Enter the correct Registration id");
		
	}
		
				
	
	}
	
	public void room() throws IOException
	{
		System.out.println("The total facilities selcted  are:"); 
		if(m.equalsIgnoreCase("ac"))
		{
			System.out.println("Ac room ");
		}
		else
		{
			System.out.println("Non Ac room ");
		}
		if(m1.equalsIgnoreCase("s"))
		{
			System.out.println("single cot ");
		}
		else
		{
			System.out.println("double cot ");
		}
		if(m2.equalsIgnoreCase("c"))
		{
			System.out.println("cable facility  ");
		}
		else
		{
			System.out.println("no cable facility  ");
		}
		if(m3.equalsIgnoreCase("w"))
		{
			System.out.println("wifi facility  ");
		}
		else
		{
			System.out.println("no wifi facility  ");
		}
		if(m4.equalsIgnoreCase("l"))
		{
			System.out.println("Laundary facility  ");
		}
		else
		{
			System.out.println("no laundary facility  ");
		}
		System.out.println("Do yo want to proceed (yes/no)");
		String str1=b.readLine();
	if(str1.equalsIgnoreCase("yes"));
		
	{	
		if(m.equalsIgnoreCase("ac"))
		{
			if(m1.equalsIgnoreCase("s"))
			{
			while(i!=5)
			{
				b1[i]=Registration.id-1;
				i++;
				c[idcount++]=Registration.id-1;
				break;
				
			}
			roomno[rcount++]=i;
			System.out.println("Thank you for booking your room is"+i);
			
			}
		
		else 
		{
			while(j!=10)
			{
				b1[j]=Registration.id-1;
				j++;
				c[idcount++]=Registration.id-1;
				break;
				
			}	
			roomno[rcount++]=j;
			System.out.println("Thank you for booking your room is"+j);
		}
		}
		
		else if(m.equalsIgnoreCase("nac"))
		{
			 if(m1.equalsIgnoreCase("s"))
			 {
				 while(l!=15)
			{
				b1[l]=Registration.id-1;
				l++;
				c[idcount++]=Registration.id-1;
				break;
				
			}
			roomno[rcount++]=l;
			System.out.println("Thank you for booking your room is"+l);
			 }
		
		else
		{
			while(k!=20)
			{
				b1[k]=Registration.id-1;
				k++;
				c[idcount++]=Registration.id-1;
				break;
				
			}
			roomno[rcount++]=k;
			System.out.println("Thank you for booking your room is "+k);
		}
		}
	
	}
		
	}

	public void status()
	{
		Status obj3=new Status();
		obj3.checkstatus(b1);
	}




}
