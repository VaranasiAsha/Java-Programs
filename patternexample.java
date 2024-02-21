//import java.io.*;
public class patternexample {
//function to demonstrate printing pattern
	public static void starlefttriangle(int k)
	{
		int a,b;
		//1st loop
	// TODO Auto-generated method stub
		for(a=0;a<k;a++) {
			//2d loop
			for(b=2 * (k-a);b>=0;b--) {
				//printing spaces
				System.out.println(" ");
			
				
			}
			//3rd loop
			for(b=0;b<=a;b++) {
				//printing stars
				System.out.println("* ");
			}
			//end_line
			System.out.println();}
	}
	//driver function
	public static void main(String args[]) {
		int k=5;
		starlefttriangle(k);
	}

			
		

	}



