package patika;

import java.util.Scanner;

public class hesapmakinesi {

	public static void main(String[] args) {
	
	/*	int n1,n2,select;
		
		Scanner giris= new Scanner(System.in);
		System.out.println("İlk Sayıyı giriniz:");
		n1= giris.nextInt();
		
		System.out.println("ikinci Sayıyı giriniz:");
		n2= giris.nextInt();
		
		System.out.println(n1+ " - "+ n2);
		
		System.out.println("1-Toplama\n  2-Çıkarma\n 3-Çarpma\n 4-Bölme");
		System.out.println("Seçiminiz:");
		select=giris.nextInt();
				
		if(select==1) {
			System.out.println("toplam: "+(n1+n2));
			
		}else if(select==2){
			
			System.out.println("çıkarma: "+(n1-n2));
			
		}else if(select==3) {
			
			System.out.println("çarpma: "+(n1*n2));
	
			
		}else if(select==4) {
			
			if(n2!=0) {
				
			System.out.println("bölme: "+(n1/n2));
			
			}else {
				System.out.println("bir sayı sıfıra bölünemez.");
			}
			
			
		} else {
			System.out.println("yanlış seçim yaptınız.tekrar deneyiniz");
		}*/
		
//	switch case ile yapımı
		
int n1,n2,select;
		
		Scanner giris= new Scanner(System.in);
		System.out.println("İlk Sayıyı giriniz:");
		n1= giris.nextInt();
		
		System.out.println("ikinci Sayıyı giriniz:");
		n2= giris.nextInt();
		
		System.out.println(n1+ " - "+ n2);
		
		System.out.println("1-Toplama\n  2-Çıkarma\n 3-Çarpma\n 4-Bölme");
		System.out.println("Seçiminiz:");
		select=giris.nextInt();
		
		switch(select) {
			case 1:
				System.out.println("toplam: "+(n1+n2));
				break;
			
			case 2:
				System.out.println("çıkarma: "+(n1-n2));
				break;
			
			case 3:
				System.out.println("çarpma: "+(n1*n2));
				break;
				
			case 4:	
				if(n2!=0) {
					
					System.out.println("bölme: "+(n1/n2));
					
					}else {
						System.out.println("bir sayı sıfıra bölünemez.");
					}
				break;
					
				default:
					System.out.println("yanlış seçim yaptınız.tekrar deneyiniz");	
		}
		
	}

}
