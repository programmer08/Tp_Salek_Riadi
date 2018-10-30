package Fist_App;

 class Point{
	 private char nom ; 
		private double abscisse ;
 public Point(char nom, double abscisse){ 
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
public class Exr_Point {
	public static void main (String args[]) {		
		Point  x = new Point  ('X', 1.75) ;
	x.affiche() ;
	Point  y = new Point  ('Y', 0.25) ;
	y.affiche();
	y.translate(2);
	y.affiche();
	}
}

