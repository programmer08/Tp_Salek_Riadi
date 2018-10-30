package Fist_App;

public class Exr1 {

	public static void main(String[] args) {
    int i=15,j=8,k=10,l=10;
    j=++i/2;
    System.out.println("i=" +i +"j=" +j+ "k=" +k+ "l=" +l);
    j>>=3;
    System.out.println("i=" +i +"j=" +j+ "k=" +k+ "l=" +l);
    l=i+j*++k%2;
    System.out.println("i=" +i +"j=" +j+ "k=" +k+ "l=" +l);
    k=l+5;
    System.out.println("i=" +i +"j=" +j+ "k=" +k+ "l=" +l);
    l=k++;
    System.out.println("i=" +i +"j=" +j+ "k=" +k+ "l=" +l);
	}

}
