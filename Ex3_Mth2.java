package Fist_App;

import java.util.Scanner;

public class Ex3_Mth2 {

	static Scanner reader= new Scanner (System.in);
		public static void main(String[] args) {
		int x,y;
		System.out.println("Enter la première NB");
		System.out.print("x=");
		x=reader.nextInt();
		System.out.println("Enter la deuxième NB");
		System.out.print("y=");
		y=reader.nextInt();
		x=x^y;
		y=y^x;
		x=x^y;
		System.out.println("------------------------------------");
		
		System.out.println("x=" +x);
		System.out.println("y=" +y);
		}

	}
