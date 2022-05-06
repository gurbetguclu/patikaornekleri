package patika.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class elemanlariSiralama {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Dizinin boyutu n :");
		int n=scan.nextInt();
		int []dizi=new int[n];
		
		System.out.println("Dizinin elemanlarını giriniz:");
		
		for(int i=1;i<n;i++) {
			System.out.println(i+". Eleman: ");
			dizi[i]=scan.nextInt();
		}

		Arrays.sort(dizi);
		System.out.println(Arrays.toString(dizi));
	}

}
