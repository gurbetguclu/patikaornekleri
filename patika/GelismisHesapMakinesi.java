package patika.methodlar;

import java.util.Scanner;

public class GelismisHesapMakinesi {
	
	static int sum(int a,int b) {
		int result=a+b;
		System.out.println("Toplam :"+result);
		return result;
		
	}
	static int minus(int a,int b) {
		int result=a-b;
		System.out.println("Çıkarma :"+result);
		return result;
		
	}
	static int times(int a,int b) {
		int result=a*b;
		System.out.println("Çarpma :"+result);
		return result;
		
	}
	static int diveded(int a,int b) {
		
		if(b==0) {
			System.out.println("ikinci sayı 0'dan farklı olmalıdır.");
			return 0;
		}
		int result=a/b;
		System.out.println("Bölme :"+result);
		return result;
		
	}
	static int pow(int a,int b) {
		
		int result=1;
		for(int i=1; i<=b;i++) {
			result*=i;
		}
		
		System.out.println(a+" üssü "+b+" :"+result);
		return result;
		
	}
	static int mod(int a, int b) {
		
		int result=a%b;
		System.out.println(a+" 'nin "+b+"'ye bölümünden kalan: "+result);
		
		return result;
	}
	static void calc(int a,int b) {
		
		System.out.println("Çevre: "+(2*(a+b)));
		System.out.println("Alanı: "+a*b);
	}
	
	

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int select;
		
		String menu="1- Toplama İşlemi\n"
				+"2- Çıkarma İşlemi\n"
				+"3- Çarpma İşlemi\n"
				+"4- Bölme İşlemi\n"
				+"5- Üslü Sayı Hesaplama\n"
				+"6- Faktoriyel Hesaplama\n"
				+"7-Mod Alma\n"
				+"8- Dikdörtgen Alan ve Çevre  Hesaplama\n"
				+"0-Çıkış Yap\n";
		
			System.out.println(menu);	
			
		while(true) {
			
			System.out.println("Bir işlem seçiniz :");
			select=scan.nextInt(); 
			
			if(select==0) {
				break;
			}
			
			System.out.println("İlk sayıyı giriniz :");
			int a=scan.nextInt();
			
			System.out.println("ikinci sayıyı girini<:");
			int b=scan.nextInt();
			
			
			 switch(select) {
			 	case 1:
				sum(a,b);
				 break;
				 
			 	case 2:
					minus(a,b);
					 break;
			 	case 3:
			 		minus(a,b);
					 break;
			 	case 4:
			 		diveded(a,b);
					 break;
			 	case 5:
			 		pow(a,b);
					 break;
			 	case 6:
			 		mod(a,b);
					 break;
			 	case 7:
			 		calc(a,b);
					 break;
			default:
				System.out.println("Geçersiz bir kod girdiniz !");
			 }
		}
			
			
		
		
	}

}
