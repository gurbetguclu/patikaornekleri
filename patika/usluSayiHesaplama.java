package patika.Donguler;

import java.util.Scanner;

public class usluSayiHesaplama {

	public static void main(String[] args) {
		
		
		int n,k;
		Scanner input=new Scanner (System.in);
		
		System.out.println("Üssü alınacak Sayı: ");
		n=input.nextInt();
		
		System.out.println("Üs olacak sayı: ");
		k=input.nextInt();
		
		//int i=1;
		int total=1;
		
//		while(i<=k) {
//			total*=n;
//			i++;
//			
//		}
		
		for(int i=1; i<=k;i++) {
			
			total*=n;
		}
		
		System.out.println(total);
	}

}
