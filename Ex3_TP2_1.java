package Fist_App;

import java.util.Scanner;

public class Ex3_TP2_1 {
static Scanner reader = new Scanner (System.in);
	public static void main(String[] args) {
		int i=0,n,Som;
		Som=0;
		while(i<4) {
			System.out.println("Donner un Entier : ");
			n=reader.nextInt();
			Som+=n;
			i++;
		}
		System.out.println(" Somme = " + Som);
	}

}
