package patika;

import java.util.Scanner;

public class notOrtalamasiHesaplama {

	public static void main(String[] args) {
		
		int mat, fizik, kimya, tarih,turkce,muzik;
		
		Scanner giris=new Scanner(System.in);
		
		System.out.print("Matematik Notu:");
		mat =giris.nextInt();

		System.out.print("Fizik Notu:");
		fizik =giris.nextInt();
		
		System.out.print("Kimya Notu:");
		kimya =giris.nextInt();
		
		System.out.print("Tarih Notu:");
		tarih =giris.nextInt();
		
		System.out.print("Türkçe Notu:");
		turkce =giris.nextInt();
		
		System.out.print("Müzik Notu:");
		muzik =giris.nextInt();
		
		double Toplam= mat+fizik+kimya+tarih+turkce+muzik;
		
		double Ortalama =Toplam/6;
		
		System.out.println("Not Ortalamsı: "+Ortalama);
		
		boolean cıktı = (Ortalama>=60);
		
		System.out.println(cıktı);
		
	}

}
