package Fist_App;
class Point3{
	 public Point3(int abs, int ord) {x = abs; y = ord ;}
	 public void deplace (int dx , int dy) {x += dx; y +=dy;}
	 public void affiche() {
		 System.out.println(" je suis un point coordonnees "+ x +" "+y);
	 }
	 private double x;
	 private double y;	 	 
 }

public class Exr6_Tp3_1 {
	public static void main(String[] args) {
          Point3 a;
          a=new Point3(3,5);
          a.affiche();
          a.deplace(2, 0);
          a.affiche();
          Point3 b = new Point3(6,8);
          b.affiche();
	}

}
