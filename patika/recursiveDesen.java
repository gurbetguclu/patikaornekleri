package patika.methodlar;

import java.util.Scanner;

public class recursiveDesen {
	
	
	public static int desen2(int n,int temp, boolean durum) {
		
		
		System.out.print(n+" ");
		
		if(n>0 && durum==true) {
		
			n-=5;
			
		}else {
			durum=false;
			n+=5;
		}
		if(temp==n) {
			return n;
		}
		return desen2(n,temp,durum);
	}
		
	

	public static void main(String[] args) {
		// Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. 
		//Her çıkarma işlemi sırasında ekrana son değeri yazdırın. 
		//Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
		//Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
		
		Scanner input =new  Scanner(System.in);
		System.out.println("N Sayısı : ");
		
		int sayi=input.nextInt();
		
		//desen(sayi);
		System.out.println(desen2(sayi,sayi,true));
	}

}
