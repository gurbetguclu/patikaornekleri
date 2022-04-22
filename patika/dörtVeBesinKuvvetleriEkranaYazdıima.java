package patika.Donguler;

import java.util.Scanner;

public class dörtVeBesinKuvvetleriEkranaYazdıima {

	public static void main(String[] args) {
		
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Sınır değer giriniz : ");
		n=scan.nextInt();

		
		for(int i=1; i<=n;i*=4,i*=5) {//i*=2 kuvvet alır
			
			System.out.println(i);
		}

	}

}
