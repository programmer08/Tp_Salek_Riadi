package Fist_App;

import java.util.Scanner;

 class Point1 {
	 private char nom ; 
		private double abscisse ;
 public Point1 (char nom, double abscisse){ 
	this.nom=nom;
	this.abscisse=abscisse;
	}
	public void affiche (){
		System.out.println("-------------------------");
		System.out.println ("Nom : " + nom );
		System.out.println("-------------------------");
		System.out.println("Abscisse : " + abscisse );
	}
	public void translate (double dx) {
		abscisse = abscisse + dx ;
	} 
};
public class Exr2_Point {
static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
	try {	
		double x;
		double y;
		double z;
		System.out.println("Entrer les 2 Nbs ");
		x=in.nextDouble();
		y=in.nextDouble();
		System.out.println("Enter La Translate");
		z=in.nextDouble();
		Point1 a = new Point1 ('X',x) ;
		a.affiche() ;
		Point1 c = new Point1 ('Y',y) ;
		c.affiche();
		c.translate(z);
		c.affiche();
	}catch(Exception ex) {
		System.out.println("Error");
	}


	}

}
