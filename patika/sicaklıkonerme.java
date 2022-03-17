package patika;

import java.util.Scanner;

public class sicaklıkonerme {

	public static void main(String[] args) {
	
		int  temp;
		
		Scanner input=new Scanner (System.in);

		System.out.println("Sıcaklık Giriniz:");
		temp=input.nextInt();
		
		if(temp<5) {
			
			System.out.println("Kayak");
			
		}else if(temp>=5 && temp<=15) {
			
			System.out.println("Sinema");
			
		}
			
		if(temp>=10 && temp<=25) {
				System.out.println("Piknik");
			}
			
		 else {
			
		
			System.out.println("Yüzme");
		
	}

	}
}
