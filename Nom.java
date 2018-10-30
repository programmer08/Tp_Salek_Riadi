package Fist_App;

import java.util.Scanner;

public class Nom {
static Scanner reader = new Scanner(System.in);	
public static void main(String []args) {
	String Name;
	int Age;
	System.out.println("Entrer Ton Nom Please");
	Name=reader.nextLine();
	System.out.println("Entrer your Age Please");
	Age=reader.nextInt();
	if(Age<=18) {
		System.out.println(Name + " : tu es un Enfant");
	}else {
		System.out.println(Name + " : tu es Un Hommme");
	}
	
	
	
}
}
