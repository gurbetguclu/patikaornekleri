package patika;

import java.util.Scanner;

public class sinifgecme {

	public static void main(String[] args) {
		
		int mat,fizik,turkce,kimya,muzik;
		
		int counter=0;
		int toplam=0;		

		Scanner input=new Scanner(System.in);
		
		System.out.print("Matemetik notunuz:");
		mat=input.nextInt();
		
		System.out.print("Fizik notunuz:");
		fizik=input.nextInt();
		
		System.out.print("Turkçe notunuz:");
		turkce=input.nextInt();
		
		System.out.print("Kimya notunuz:");
		kimya=input.nextInt();
		
		System.out.print("Muzik notunuz:");
		muzik=input.nextInt();
		
		
		if(!(mat<0 || mat>100)) {
			
			toplam+=mat;
			counter++;
		}
		
		if(!(fizik<0 || fizik>100)) {
			
			toplam+=fizik;
			counter++;
		}
		if(!(kimya<0 || kimya>100)) {
			
			toplam+=kimya;
			counter++;
		}
		if(!(turkce<0 || turkce>100) ){
			toplam+=turkce;
			counter++;
		}
		if(!(muzik<0 || muzik>100 ) ){
			
			toplam+=muzik;
			counter++;
		}
				
		System.out.println(toplam);
		System.out.println(counter);
		
		double avarage=toplam/counter;
		
		if(avarage<=55){
			System.out.println("Sınıfta kaldınız.");
			
			
		}else {
			System.out.println("Sınıfı geçtiniz.");
			
		}
		System.out.println("Ortalamanız:"+avarage);
	

}
}