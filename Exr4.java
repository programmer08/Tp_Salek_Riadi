//Equation du 1er degré : Brahim Ezzahraoui
package Fist_App;

import java.util.Scanner;

public class Exr4 {
	static Scanner reader= new Scanner (System.in);
	public static void main(String[] args) {
		double x;
		double a;
		double b;
		try {
		System.out.println("Donnez-moi a = ");
		a=reader.nextDouble();
		System.out.println("Donnez-moi b = ");
		b=reader.nextDouble();
		System.out.println("----------------------------------------------------------\n");
		System.out.println("L'equation est : " +a+"x + "+b+" = 0");
		System.out.println("----------------------------------------------------------\n");
	if(a!=0  && b!=0 ) {
		x=-b/a;
		System.out.println("Solution est : ");
		System.out.println("x = " +x);
	}
	if (a!=0 && b==0) {
		x=0;
		System.out.println("Solution est : ");
		System.out.println("x = " +x);
	}
	if (a==0 && b==0) {
		System.out.println("pleusieurs Solution");
	
	}
	if (a==0 && b!=0) {
		System.out.println("N'as pas de Solution ");
		
	}

	}catch(Exception ex) {
		System.out.println("Répeter la Complilaton");
	}

}
}
