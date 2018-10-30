package Fist_App;
class Point4{
	 public Point4(int abs, int ord) {x = abs; y = ord ;}
	 public void deplace (int dx , int dy) {x += dx; y +=dy;}
	 public double abscisse() {
		 return x;
	 }
	 public double ordonnee() {
		 return y;
	 }
	 private double x;
	 private double y;	 	 
}
public class Ex6_TP3_2 {
	public static void main(String[] args) {
        Point4 a;
        a=new Point4(3,5);
        System.out.println ("coordonnees "+ a.abscisse() + " " + a.ordonnee()) ;
        a.deplace(2,0) ;
        System.out.println ("coordonnees "+ a.abscisse() + " " + a.ordonnee()) ;
        Point4 b = new Point4(6,8) ;
        System.out.println ("coordonnees "+ b.abscisse() + " " + b.ordonnee()) ;
	}
}
