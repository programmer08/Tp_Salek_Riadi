package Fist_App;	
class Ident{
	private static int idmax=0;
	private int  id;
	public Ident (){
idmax++;
id=idmax; }
	public int getIdent () {
		return id;
	}
	public static int getIdentMax() {
		return idmax;
	}	
}
public class Exr8_TP3 {
	 public static void main (String args[]){
		 Ident x = new Ident();
		 Ident y = new Ident() ;
	     System.out.println ("x : " + x.getIdent()) ;
	     System.out.println("-----------------------------------");
	     System.out.println (Ident.getIdentMax()) ;
	     System.out.println("-----------------------------------");
	     System.out.println ("y : " + y.getIdent()) ;
	     System.out.println("-----------------------------------");
	     System.out.println (Ident.getIdentMax()) ;
	     Ident z = new Ident();
	     Ident n = new Ident();
	     System.out.println("-----------------------------------");
	     System.out.println ("z : " + z.getIdent()) ;
	     System.out.println("-----------------------------------");
	     System.out.println (Ident.getIdentMax()) ;
	     System.out.println("-----------------------------------");
	     System.out.println ("n : " + n.getIdent()) ;
	     System.out.println("-----------------------------------");
	     System.out.println (Ident.getIdentMax()) ;
	     System.out.println("-----------------------------------");

}
}