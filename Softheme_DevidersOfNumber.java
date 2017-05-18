
import java.io.*;
import java.util.*;
public class MyTest {
	
private static Scanner scn;
	
	public static void main(String args[]) {
		
	int halfdigit;	
	Thread t1;
	Thread t2;
	long startTime;
	long estimatedTime; 
	
	int digit = in();
	int count;	
	
	startTime = System.nanoTime();	
	halfdigit = digit/2;
	count = halfdigit;
	System.out.print("Deviders of number " + digit + " is: " + digit + " ");
	while(count>0){
			
		if(digit%count == 0){
				System.out.print(count + " ");
			}
			
		count--;
		} 

	estimatedTime = System.nanoTime() - startTime;
	
	System.out.println("time spent: "  + estimatedTime);
	
	}
	
	private static int in() {
		
		System.out.println("Enter any number:");
		scn = new Scanner(System.in);
		
		return scn.nextInt();
	}

}


