package patika;

import java.util.Scanner;

public class kdvhesaplama {

	public static void main(String[] args) {
	
		double tutar, kdv=0.18 , kdvliTutar, kdvoran;
		
		Scanner giris= new Scanner (System.in);
		System.out.println("Tutarı giriniz: ");
		
		tutar= giris.nextDouble();
		
		
		kdvoran=tutar*kdv;
		kdvliTutar= tutar+kdvoran;
		
		System.out.println("Kdvsiz Tutar:"+tutar);
		System.out.println("Kdv Oranı:"+kdvoran);
		System.out.println("Toplam tutar:"+kdvliTutar);
	}

}
