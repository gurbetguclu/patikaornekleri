package patika.Donguler;

import java.util.Scanner;

public class armstrongSayi {

	
	public static void main(String[] args) {
	
		//n haneli bir sayının basamaklarının n.inci üstlerinin toplamı
		//sayının kendisine eşit ise armstrong sayıdır
		//123--1^3+2^3+3^3==123 olmalı
		
		//ilk önce basamak sayısı bulunur.
		 
//		int a=2451; 
//		int basamakSayisi=0;
//		int numberCounter=0;//basamaksayisi
//		
//		while(a!=0) {
//			a/=10;
//			numberCounter++;
//		}

		//bir sayının son basamağını bulma
//		int b=2451;
//		int c=b%10;
//		
//		a%=10;
//		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		
		int number=input.nextInt();
		
		int basamakSayisi=0;
		int tempNumber=number;//ilk girilern number değerini kaybetmemek için
		int basamakValue;
		int result=0;
		int basamakPow;
		int basamakSayisiToplami=0;
		
		
		
		while(tempNumber!=0) {
			tempNumber/=10;
			basamakSayisi++;
		}
		
		tempNumber=number;
		
		while(tempNumber!=0) {
			
			basamakValue=tempNumber%10;//sonbasamakdeğerini aldık
			
			basamakPow=1; 
			 for(int i=1; i<=basamakSayisi;i++) {
				 
				 basamakPow*=basamakValue;
			 }
			result+=basamakPow;	 
			 
			 tempNumber/=10;
			basamakSayisiToplami+=basamakValue;
			
		}
		
		if(result==number) {
			System.out.println(number+" sayısı bir Armstrong sayıdır");
		}else {
			System.out.println(number+" sayısı bir Armstrong sayı değildir");

		}
	
		System.out.println(basamakSayisiToplami);

}
}
