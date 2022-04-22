package patika;

import java.util.Scanner;

public class tekSayilarinToplami {

	public static void main(String[] args) {
		
		int n;
		int total=0;
		Scanner scan=new Scanner(System.in);
		//negatif sayı girildiğinde duracak
		do {
			System.out.println("Sayı giriniz :");
			n=scan.nextInt();
			if(n%2==0 && n%4==0) {
				total+=n;
				
			}
			
		}while(n>0);
		
		 System.out.println("Toplam :"+total);

	}

}
