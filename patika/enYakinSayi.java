package patika.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class enYakinSayi {
	
	
public static int fark1(int []arr,int sayi) {
		
		int fark=0;
		int[] farkdizi=new int[arr.length];
		
		int min=farkdizi[0];
		int max=farkdizi[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<sayi) {
				fark=sayi-arr[i];
			}
			else {
				fark=arr[i]-sayi;
			}
				
			farkdizi[i]=fark;
			
			for(int j=0; j<farkdizi.length;j++) {
				if(j<min) {
					min=j;
				}
				if(j>max) {
					max=j;
				}
				
			}
			System.out.println(max);
			System.out.println(min);
		}
	
		return fark;
		
	}


	
	public static int[] fark(int []arr,int sayi) {
		
		int fark=0;
		int[] farkdizi=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<sayi) {
				fark=sayi-arr[i];
			}
			else {
				fark=arr[i]-sayi;
			}
				
			farkdizi[i]=fark;
		}
	
		return farkdizi;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dizi={15,12,788,1,-1,-778,2,0};
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Sayı giriniz:");
		int sayi=input.nextInt();
	
		Arrays.sort(dizi);
		
		//System.out.println(Arrays.toString(farkdizi));
		
	
		int kücükYakinSayi=0;
		int büyükYakinSayi=0;
		
		for(int i=0;i<dizi.length;i++) {
			
			if(sayi>dizi[i]) {
				kücükYakinSayi=dizi[i];
				
			}
			if(sayi<dizi[i]) {
				büyükYakinSayi=dizi[i];
				break;
			}
				
				
			}
		
		
		System.out.println("Dizi :"+Arrays.toString(dizi));
		System.out.println("Girilen Sayı :"+sayi);
		System.out.println("Girilen sayıdan küçük en yakın sayı : "+kücükYakinSayi);
		System.out.println("Girilen sayıdan küçük en yakın sayı : "+büyükYakinSayi);
	
	}

}
