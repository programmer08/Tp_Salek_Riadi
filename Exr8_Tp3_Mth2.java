package Fist_App;

import java.util.Scanner;

class Ident2{
		private static int idmax=(new Scanner(System.in).nextInt());
		private int  id;
		public Ident2 (){
	id++;
			id=idmax; 
	}
		public int getIdent () {
			return id;
		}
		public static int getIdentMax() {
			return idmax;
		}
	static {
		Scanner sc = new Scanner(System.in);
		idmax= sc.nextInt();
	}
public class Exr8_Tp3_Mth2 {
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
