package patika.Donguler;

import java.util.Scanner;

public class TersUcgen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Basamak Sayısını giriniz: ");
		int n=input.nextInt();
		
		
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			
			for(int j=(2*n-1); j>=(2*i+1);j--) {
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
		
		
		}

	}


