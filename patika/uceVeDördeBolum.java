package patika;

import java.util.Scanner;

public class uceVeDördeBolum {

	public static void main(String[] args) {
		
		int toplam=0;
		int ortalama;
		int count=0;
		int k;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Sayı giriniz");
		k=scan.nextInt();
		
		for (int i = 1; i <=k; i++) {
			if(i%3==0 && i%4==0) {
				
				count++;
				toplam+=i;
			}
		}
		System.out.println(toplam);
		ortalama=toplam/count;
		System.out.println(ortalama);
		
	
	}

}
