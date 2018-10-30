package Fist_App;

import java.util.Scanner;

public class Validation {
static Scanner reader = new Scanner (System.in);
	public static void main(String[] args) {
	String name;	
	int note;
	System.out.println(" Entrer Ton Nom et prénom s'il vous plait :");
	name= reader.nextLine();
	System.out.println("----------------------------------------------");
	System.out.println("Enter ta note s'il vous plait : ");
	note=reader.nextInt();
	System.out.println("-----------------------------------------------");
	if(note>=12) {
		System.out.println("Mr. "+name + " ----> félicitation tu es Valider  ");
	}else {
		System.out.println("Mr. "+name + " ----> Bon Chance !!  tu es Non  Valider  ");
	}

	}

}
