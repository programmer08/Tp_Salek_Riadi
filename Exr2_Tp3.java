package Fist_App;
class A{
	public A (int Coeff) {
		nbre*= Coeff;
		nbre = nbre+decal;
	}
	public void affiche() {
		System.out.println("nbre = " +nbre + "  decal = "+decal );
	}
	private int nbre=20;
	private int decal;	
}
public class Exr2_Tp3 {	
	public static void main(String[]args) {
		A a= new A(7);
		a.affiche();
	}

}
