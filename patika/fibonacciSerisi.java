package patika.Donguler;

import java.util.Scanner;

public class fibonacciSerisi {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Serinin eleman sayısını giriniz:");
		int n=scan.nextInt();
		
		int oncekisayi =0;
		int sonrakisayi=1;
		
		System.out.println("Fibonacci Serisi "+ n + " için:");
		
		int i=1;
		
		while (i<=n) {
			
			System.out.println(oncekisayi+" "); 
			
			int sum= oncekisayi+sonrakisayi;
			oncekisayi=sonrakisayi;
			sonrakisayi=sum;
		
			i++;

	}
		

}
}
