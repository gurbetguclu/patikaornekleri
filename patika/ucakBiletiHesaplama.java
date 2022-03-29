package patika;

import java.util.Scanner;

public class ucakBiletiHesaplama {

	public static void main(String[] args) {
		
	
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Mesafe giriniz");
		double mesafe=input.nextDouble();
		
		System.out.println("Yalculuk Tipi giriniz:");
		int yolculukTipi=input.nextInt();
		
		System.out.println("Yaş giriniz:");
		int yas=input.nextInt();
		
		boolean tekYon=(yolculukTipi==1);
		boolean gidisDonus=(yolculukTipi==2);
		
		
		double toplamFiyat=mesafe*0.1;
		
		if(mesafe<0 ||yas<0) {
			
		
			System.out.println("Hatalı veri girdiniz");
			
			if((yolculukTipi!=1|| yolculukTipi!=2)) {
				
				System.out.println("Hatalı veri girdiniz");	
			}
		}
		
		else {
			if (yolculukTipi==2) {
			
			if (yas<12) {
				
				double yasİndirimi12=toplamFiyat*0.50*0.80;
				System.out.println("Toplam Tutar="+yasİndirimi12);
				
			}
			if(yas>12 && yas<24) {
				
				double yasİndirimi24=toplamFiyat*0.90*0.8;
				System.out.println("Toplam Tutar="+yasİndirimi24);
				
			} if (yas>=65) {
				
				double yasİndirimi65=toplamFiyat*0.7*0.8;
				System.out.println("Toplam Tutar="+yasİndirimi65);
			}else {
				double normalYas=toplamFiyat*0.8;
				
				System.out.println("Toplam Tutar="+normalYas);
			}
			
		} else {
			
			if (yas<12) {
			
			
			double yasİndirimi12=toplamFiyat*0.50;
			System.out.println("Toplam Tutar="+yasİndirimi12);
			
		}
		if(yas>12 && yas<24) {
			
			double yasİndirimi24=toplamFiyat*0.90;
			System.out.println("Toplam Tutar="+yasİndirimi24);
			
		} if (yas>=65) {
			
			double yasİndirimi65=toplamFiyat*0.7;
			System.out.println("Toplam Tutar="+yasİndirimi65);
		}else {
			
			double normalYas=toplamFiyat;
			
			System.out.println("Toplam Tutar="+normalYas);
		}
		
		}
		}
	
		
	}

}

