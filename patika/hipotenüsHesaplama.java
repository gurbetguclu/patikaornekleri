package patika;
import java.util.Scanner;
public class hipotenüsHesaplama {

	public static void main(String[] args) {
		
		
		Scanner giris= new Scanner(System.in);
		
		System.out.print("1.kenarı giriniz: ");
		int a= giris.nextInt();
		
		System.out.print("2.kenarı giriniz: ");
		int b= giris.nextInt();
		
		double c = Math.sqrt((a*a)+(b*b));
		
		System.out.println("hipotenüs:"  +c);
			

	}

}
