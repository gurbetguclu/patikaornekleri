package patika.Donguler;

import java.util.Scanner;

public class MükemmelSayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int n1=input.nextInt();
		
		int mük=0;
		for(int i=1;i<n1;i++) {
			
			if(n1%i==0 ) {
				mük+=i;
			}
			
		}
		if(mük==n1) {
			System.out.println(n1+" Mükemmel sayıdır");
		}else
			
		System.out.println(n1+" Mükemmel sayı değildir.");

	}

}
