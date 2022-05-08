package patika.Arrays;

import java.util.Arrays;

public class elemanlarinFrekansi {

	public static void main(String[] args) {
	
		int[]dizi= {10,20,20,10,10,20,5,20};
		
		Arrays.sort(dizi);
		System.out.println("tekrar Sayıları:");

		for(int i=0;i<dizi.length;i++) {
			int sayac=0;
			for(int j=0;j<dizi.length;j++) {
				if(dizi[i]==dizi[j]) {
					
					sayac++;
					
					 }
					
				}
			
		 
			System.out.println(dizi[i]+" sayısı "+sayac+" kere tekrar edildi.");
			i+=sayac-1;
			}
			
		
		}
		

	}


