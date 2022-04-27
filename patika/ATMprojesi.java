package patika.Donguler;

import java.util.Scanner;

public class ATMprojesi {

	public static void main(String[] args) {
		
		String userName, password;
		
		Scanner input=new Scanner(System.in);
		
		int right=3;//kullanıcının 3 kere yanlış paralo girme hakkı
		int balance=1500;//bakiye
		int select;
		int price;
		while(right>0) {
			
			System.out.println("Kullanıcı adınız:");
			userName=input.nextLine();
			
			System.out.println("Parolanız:");
			password=input.nextLine();
			
			if(userName.equals("patika")&& password.equals("dev123")) {
				System.out.println("Merhaba bankanıza hoşgeldiniz");
				
				do {
					
					System.out.println("1-Para Yatıma \n"+
									   "2- Para Çekme\n"+
									   "3-Bakiye Sorgulana\n"+
									   "4-Çıkış Yap");
					System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
					select=input.nextInt();
					switch(select) {
					
					case 1:
						System.out.println("Yatırılacak Para miktarı: ");
						price=input.nextInt();
						
						balance+=price;
						
						break;
						
					case 2:
						System.out.println("Çekilecek Para miktarı: ");
						price=input.nextInt();
						if(price>balance) {
							 System.out.println("Yetersiz Bakiye");
						}else {
							balance-=price;
						}
						break;
						
					case 3:
						System.out.println("Bakiyeniz: "+balance);
						
						break;
					
				}
					}
						while(select!=4);
				System.out.println("Tekrar görüşmek üzere");
					break;
			
			}else {
				right--;
				System.out.println("Kullanıcı adı veya şifre hatalı. Tekrar deneyiniz.");
				
				if(right==0) {
					
					System.out.println("Hesabınız bloke olmuştur.Bankanız ile görüşünüz.");
				}else {
					System.out.println("Kalan hakkınız: "+ right);
				}
				
				
			}
			
		}
		
		
		

	}

}
