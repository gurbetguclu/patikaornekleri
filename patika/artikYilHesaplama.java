package patika;

import java.util.Scanner;

public class artikYilHesaplama {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Yıl giriniz:");
		int year= input.nextInt();

		
		
		if (year%100!=0 && year%4==0) {
			
			System.out.println(year+" bir artık yıldır.");
		
		}
			
		else if(year%100==0 && year%400==0 ) {
				
				System.out.println(year+" bir artık yıldır.");
				
			} else {
				
				System.out.println(year+" bir artık yıldır değildir.");
			}
		}
		
		

}


