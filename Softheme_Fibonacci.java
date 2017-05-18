import java.util.Scanner;

public class MyTest {
	
	public static void main(String [] args){
		int previous = 0;
		int this_ = 0;
		int next = 1;
		int in = 0;
		in = in();
		boolean include = false;
		
		while(this_<=in){
		if(this_ == in){
			include = true;
			break;
		}else{
			
			previous = this_;
			this_ = next;
			next = this_ + previous;
			
			}
		}
		
		if(include) System.out.println("Fibonacci include number - " + in );
		else System.out.println("Fibonacci NOT include number - " + in );
		
	}

	private static int in() {
		System.out.println("Enter digit:");
		Scanner scn = new Scanner(System.in);
		
		return scn.nextInt();
	}

}

