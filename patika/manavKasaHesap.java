package patika;

import java.util.Scanner;

public class manavKasaHesap {

	public static void main(String[] args) {
	
		double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5;
		
		Scanner giris=new Scanner(System.in);
		
		System.out.print("Elma kaç kilo ?:");
		double elmakilo= giris.nextDouble();
		
		System.out.print("Armut kaç kilo ?:");
		double armutkilo= giris.nextDouble();
		
		System.out.print("Domates kaç kilo ?:");
		double domateskilo= giris.nextDouble();
		
		System.out.print("Muz kaç kilo ?:");
		double muzkilo= giris.nextDouble();
		
		System.out.print("Patlıcan kaç kilo ?:");
		double patlicankilo= giris.nextDouble();
		
		double toplam= armut*armutkilo+ elma*elmakilo+ domates*domateskilo+
				muz*muzkilo+patlican*patlicankilo;
		
		System.out.println("Toplam Tutar: "+ toplam+"  TL");
	}

}
