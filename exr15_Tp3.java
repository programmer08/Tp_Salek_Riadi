package Fist_App;

import java.util.Scanner;

class Point8{
	public Point8 (int abs,int ord) {
		x=abs;
		y=ord;
	}
	public void affiche() {
		System.out.println("Coordonnes : "+x+" "+y);
	}
	public static Point8 MaxNorme(Point8 a,Point8 b) {
		double v,w;
		v=a.x+a.y;
		w=b.x+b.y;
	if(v>w) {
		return a ;
	}
	else {
		return b;
	}
	}
	private double x;
	private double y;	
}

public class exr15_Tp3 {
	  static Scanner reader=new Scanner(System.in);
	public static void main(String[] args) {
	int a,b;
	int c,d;
	try {	
	System.out.println("Enter la Premiére Nbr pour le Point 1 : ");
		a=reader.nextInt();
		System.out.println("Enter la deuxiéme Nbr pour le Point 1 : ");
		b=reader.nextInt();
	    System.out.println("-----------------------------------------------");
		System.out.println("Enter la Premiére Nbr pour le Point 2 : ");
		c=reader.nextInt();
		System.out.println("Enter la deuxiéme Nbr pour le Point 2 : ");
		d=reader.nextInt();
		System.out.println("*************************************************");
		Point8 n = new Point8(a,b);
		System.out.println("Point 1 : ");
		n.affiche();
	    System.out.println("*************************************************");
		Point8 f = new Point8(c,d);
		System.out.println("Point 2 : ");
		f.affiche();
		System.out.println("*************************************************");
		Point8 l = Point8.MaxNorme (n, f) ;
		System.out.print ("Max de Point 1 et Point 2 --->  ") ;
		l.affiche() ;
	}catch(Exception ex) {
		System.out.println("S'il vous plait entrer seulement un valeur Entier");
	}
	
	    

	}

}
