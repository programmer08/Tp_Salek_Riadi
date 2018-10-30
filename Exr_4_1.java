package Fist_App;

public class Exr_4_1 {

	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		if(a!=0  && b!=0 ) {
			System.out.println("Solution est : ");
			System.out.println("x = " +-b/a);
		}
		if (a!=0 && b==0) {
			System.out.println("Solution est : ");
			System.out.println("x =0");
		}
		if (a==0 && b==0) {
			System.out.println("pleusieurs Solution");
		
		}
		if (a==0 && b!=0) {
			System.out.println("N'as pas de Solution ");
			
		}

	}

}
