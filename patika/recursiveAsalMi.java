package patika.methodlar;

import java.util.Scanner;

public class recursiveAsalMi {
	
	
	public static boolean Asalmi(int i,int number) {
	   
		if(number==i) {
			return false;
		} 
		
		else if(number%i==0) {
			
			return true;
			
		}else {
		
		 return Asalmi(i+1,number);
	    }
	}

	public static void main(String[] args) {
	
		Scanner input =new  Scanner(System.in);
		System.out.println("Sayı giriniz");
		
		int sayi=input.nextInt();
		
		if(Asalmi(2,sayi)==false) {
			
			System.out.println(sayi+" sayısı ASALDIR !.");
		}else {
			System.out.println(sayi+" sayısı ASAL değildir !");

		}
	}

}
