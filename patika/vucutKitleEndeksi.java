package patika;

import java.util.Scanner;

public class vucutKitleEndeksi {

	public static void main(String[] args) {
		
	
		
		Scanner giris= new Scanner(System.in);
		
		System.out.print("kilonuzu giriniz:");
		double kilo=giris.nextDouble();
		
		System.out.print("boyunuzu giriniz:");
		double boy=giris.nextDouble();
		
		double payda= boy*boy;
		
		double vki=kilo/payda;
				

		System.out.println("Vücut kitle endeksiniz:"+ vki);
	}

}
