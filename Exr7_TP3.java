package Fist_App;
 class Ab { 
	public int f (int n) {
		 return n; //q=n
  }
   public void g (int n) { 
    	  n = q ;
        // p = n ;
  }
   //static private  int p = 20 ; //final
    private static int q ;   
}
public class Exr7_TP3 {	
public static void main (String args[]){ 
		 Ab a = new Ab();
	     int n = 5 ;
         a.g(n) ;
         a.f(n) ;
        // f(n);
}
}