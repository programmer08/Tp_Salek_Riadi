package Fist_App;

import java.util.Scanner;

public class Ex_TP2_meth2 {
	static Scanner reader = new Scanner (System.in);
	public static void main(String[] args) {
	int n;
	System.out.println("Entrer Un Nb N ");
	n=reader.nextInt();
	float Somm=0;
	int i=1;
	if (n != 0) {
while(n<=i) {
	Somm=Somm+1/i;
	i++;
}
System.out.println("La Somme est " + Somm);
	}
	else {
		System.out.println("ERROR");
	}

	}

}
