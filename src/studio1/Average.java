package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//System.out.print("Enter name: " );
		System.out.print("First number:");
		int n1 = in.nextInt();
		System.out.print("Second number:");
		int n2 = in.nextInt();
		System.out.print((n1+n2)/2.0);
	}

}
