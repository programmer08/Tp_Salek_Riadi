package Fist_App;

import java.util.Scanner;

public class Exr2 {
   static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
 int []tab = new int[10];
 for(int i=0;i<10;i++) {
	 System.out.println("Entrer la " +i+ " NB");
	 tab[i]=in.nextInt();
 }
 int Max=tab[0];
 for(int i=0;i<10;i++) {
 if(Max < tab[i]) {
	 Max=tab[i];
 }
	}
 System.out.println("-----------------------------------");
 System.out.println("Max est : " +Max);

}
}