package RoomStatus;

import java.util.Scanner;

import Register.Registration;

public class Status {
     int p;
     Registration ob=new Registration();
	public void checkstatus(int roomid[])
	  {
		  int flag=0;
		  Scanner sc= new Scanner(System.in);
		  System.out.println("Enter the Room number");
		   p=sc.nextInt();
		  for(int i=0;i<roomid.length;i++)
		  {
			  
		  if(roomid[i]==(Registration.id-1)&&(i+1)==p)
		  {
			  flag=1;
			  System.out.println("the Room number "+(i+1)+" is booked");
		  }
		  }
		  if(flag==0)
		  {
			  System.out.println(" Room is not booked ");
		  }
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
