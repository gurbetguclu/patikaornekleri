package patika.Donguler;

import java.util.Scanner;

public class harmonikSayi {

	public static void main(String[] args) {
		// harmonik seri toplamı=1+1/2+1/3...
		
		Scanner input=new Scanner(System.in);
		System.out.println("N sayısını giriniz: ");
		
		int n=input.nextInt();
		
		double result=0.0;
		for(double i=1; i<=n;i++) {
			
			result+=(1.0/i);
		}
		
		System.out.println(result);

	}

}
