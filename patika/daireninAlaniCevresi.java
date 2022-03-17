package patika;

import java.util.Scanner;
public class daireninAlaniCevresi {

	public static void main(String[] args) {
		
		double pi=3.14;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Diarenin yarıçapını giriniz:");
		double r=input.nextDouble();
		
		double alan =pi*r*r;
		double cevre= 2*pi*r;
		
		System.out.println("Dairenin alanı:"+ alan);
		System.out.println("Dairenin Çevresi:"+ cevre);
	}

}
