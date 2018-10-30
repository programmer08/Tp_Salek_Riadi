package Fist_App;

import java.util.Scanner;

public class Exr3 {
static Scanner reader= new Scanner (System.in);
	public static void main(String[] args) {
	int a,b;
	System.out.println("Enter la première NB");
	System.out.print("x=");
	a=reader.nextInt();
	System.out.println("Enter la deuxième NB");
	System.out.print("y=");
	b=reader.nextInt();
	a^=b;
	b^=a;
	a^=b;
	System.out.println("------------------------------------");
	
	System.out.println("x=" +a);
	System.out.println("y=" +b);

	}
}