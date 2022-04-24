package patika.Donguler;

import java.util.Scanner;

public class kombinasyon {

	public static void main(String[] args) {
	
		//kombinasyon=n!/(r!*(n-r)!)
		Scanner scan=new Scanner(System.in);
		
		System.out.println("n Sayısını giriniz");
		int n=scan.nextInt();
		
		System.out.println("r Sayısını giriniz");
		int r=scan.nextInt();
		
		int nfak=1;
		int rfak=1;
		int ffak=1;
		int fark=n-r;
		
		for (int i = 1; i <= n; i++) {
			nfak*=i;
		
		}
		for (int i = 1; i <= r; i++) {
			rfak*=i;
		
		}
		for (int i = 1; i <= fark; i++) {
			ffak*=i;
		
		}
		
	int kombinasyon=nfak/(rfak*ffak);
		
		System.out.println(kombinasyon);
	}

}
