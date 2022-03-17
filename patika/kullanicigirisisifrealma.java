package patika;

import java.util.Scanner;

public class kullanicigirisisifrealma {

	public static void main(String[] args) {
	
		String userName, password;
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Kullanıcı adını giriniz:");
		userName=input.next();
		
		System.out.println("Şifre giriniz:");
		password=input.next();
		
		if(userName.equals("patika")&& password.equals("java123")) {
			
			System.out.println("Giriş yaptınız.");
			
		}else {
			System.out.println("kullanıcı adı veya şifre hatalı. şifrenizi yenilemek istermisiniz?");
			
			System.out.println("1-evet\n 2-hayır");
			int secim=input.nextInt();
			
			if(secim==1) {
				System.out.println("eski şifreniz ile yeni şifreniz aynı olamaz.yeni şifre giriniz.");
				String  newpassword=input.next();
				
				if(newpassword.equals(password)) {
					System.out.println("Şifre  oluşturulamadı. Lütfen başka şifre giriniz");
					
				}else {
					System.out.println("Şifre oluşturuldu.");
					
				}
				
				
				
			}else {
				System.out.println("eski şifreniz geçerlidir.");
			}
		}
		

	}

}
