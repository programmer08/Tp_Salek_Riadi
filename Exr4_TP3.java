package Fist_App;

class Entier{
	public Entier (int nn) {n=nn;}
	public void incr (int dn) {n+=dn;}
	public void imprime(){System.out.println(n);}
	private int n;
}
public class Exr4_TP3{
	public static void main (String[]args) {
		Entier n1 = new Entier (2);
		System.out.println("n1 = ");
		n1.imprime();
		Entier n2 = new Entier (5);
		System.out.println("n1 = ");
		n2.imprime();
		n1.incr(3);
		System.out.println("n1 = ");
		n1.imprime();
		System.out.println("n1 == n2 est " +(n1==n2));
		n1=n2;
		n2.incr(12);
		System.out.print("n2 = ");
		n2.imprime();
		System.out.print("n1 = ");
		n1.imprime();
		System.out.println("n1 == n2 est " +(n1==n2));
	
	}		
}
