package lab4;

import java.util.InputMismatchException;
import java.util.Scanner;


public class program6 {
	public static void main(String[] args) {
	int num=-1;
	boolean isodd=false;
	do {
		System.out.println("Please enter a number or enter �-1� if you want to quit" );
	     Scanner sc=new Scanner(System.in);
	    try
	    {
	    if (num>100)
	 	{
	 		throw new InputException("Number can�t be greater than 100");
	 	}
	    }catch(InputException ei)
	    {
	    	System.out.println(ei.getMessage());
	    }
	     try
	     {
	    	 num=sc.nextInt();
	     }catch(InputMismatchException ie) {
	    	 System.out.println("You must enter an integer");
	     }
	     isodd=checkoddnum(num);
	     if(isodd)
	     {
	    	 System.out.println("You have entered an odd number");
	     }
	     else
	     {
	    	 System.out.println("You have entered an even number");
	     }
	     
	}while(num!=-1);
}
private static boolean checkoddnum(int num)  {

return (num%2)!=0;

}
	
}
