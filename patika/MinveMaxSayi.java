package patika.Donguler;

import java.util.Scanner;

public class MinveMaxSayi {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Kaç tane sayı gireceksiniz ");
		
		int number=input.nextInt();
		
		int minSayi=0,maxSayi=0,temp=0;
		
		for(int i=1;i<=number;i++) {
			System.out.println(i +". sayıyı giriniz.");
			int sayi=input.nextInt();
		
			
			if(sayi>maxSayi) {
				if(minSayi==0) {
					minSayi=sayi;
				}
				maxSayi=sayi;
			}if(sayi<minSayi) {
				
				if(maxSayi==0) {
					maxSayi=sayi;
				}
				minSayi=sayi;
			}
			
		}
		
		System.out.println("En küçük Sayı: "+minSayi);
		System.out.println("En büyük Sayı: "+maxSayi);
	}

}
