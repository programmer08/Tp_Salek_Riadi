package Fist_App;

import java.util.Scanner;

public class Exer_TP2_2 {
	static Scanner reader = new Scanner (System.in);
	public static void main(String[] args) {
		int i=0;
		int Som=0;
		int n;
		do{
			System.out.println("Donner un Entier : ");
			n=reader.nextInt();
			Som+=n;
			i++;
		}while(i<4);
		System.out.println(" Somme = " + Som);
		}
	
	
}
