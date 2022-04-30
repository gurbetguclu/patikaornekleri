package patika.methodlar;

import java.util.Scanner;

public class recursiveUsAlma {

	
	static int usAlma(int a, int b) {
		
		int result=a;
		
		if(b==0) {
			return 1;
		}
		
		return result*usAlma(a,(b-1));
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		
		System.out.println("Taban Değeri giriniz: ");
		int a=input.nextInt();
		
		System.out.println("Üs Değeri giriniz: ");
		int b=input.nextInt();
		
		System.out.println("Sonuç :"+usAlma(a,b));

	}

}
