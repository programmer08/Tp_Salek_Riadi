package Fist_App;

import java.util.Scanner;

public class Exr2_TP2 {
static Scanner reader = new Scanner (System.in);
	public static void main(String[] args) {
	int a;
	double R=0;
	do{
		System.out.println("Enter un NB");
	a=reader.nextInt();
	}while(a<0) ;
	 if(a==0) {
		return;
	}
	  R= Math.sqrt(a);
	 System.out.println("Résulat est " + R);
	}
	

}

