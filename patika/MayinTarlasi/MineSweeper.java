package patika.MayinTarlasi;

import java.util.Scanner;

public class MineSweeper {

	String [][]harita;
	String [][]mayinHarita;
	int satir;
	int sutun;
	int mayin;
	String  mayinİsaret=" + ";
	String kutuİsaret="██ ";
	
	public MineSweeper() {
		
	}
	
	public int mayinSayisi() {
		return (this.satir*this.sutun)/4;
	}
	
	public void mayinHaritaYap() {
		int mayinToplam=this.mayin;
		
		while(mayinToplam>0) {
			int satir=(int)(Math.random()*this.satir);
			int sutun=(int)(Math.random()*this.sutun);
			
			if(!this.mayinHarita[satir][sutun].equals(this.mayinİsaret));{
				this.mayinHarita[satir][sutun].equals(this.mayinİsaret);
				mayinToplam--;
				
			}
			
		}
	}
	
	public void haritaYap() {
		for(int i=0;i<this.satir;i++) {
			for(int j=0;j<this.sutun;j++) {
				this.harita[i][j]=this.kutuİsaret;
				this.mayinHarita[i][j]=this.mayinİsaret;
			}
		}
		
		mayinHaritaYap();
	}
	
	public void mayinHaritaYaz() {
		for(int i=0;i<this.satir;i++) {
			for(int j=0;j<this.sutun;j++) {	
				System.out.println(this.mayinHarita[i][j]);
			}
			System.out.println();
		}
	}
	public void haritaYaz() {
		for(int i=0;i<this.satir;i++) {
			for(int j=0;j<this.sutun;j++) {	
				System.out.println(this.harita[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static boolean isUygun(int sayi,int minSayi,int maxSayi) {
		
		if(sayi>=minSayi && sayi<=maxSayi) {
			return true;
		}
		return false;
	}
	
	public void oyna() {
		Scanner input=new  Scanner(System.in);
		
		int minSatirVeSutun=2;
		int maxSatirVeSutun=10;
		
		while(this.satir>maxSatirVeSutun || this.satir<minSatirVeSutun) {
			System.out.println("Satir: ");
			this.satir=input.nextInt();
			
			if(!isUygun(this.satir,minSatirVeSutun,maxSatirVeSutun)) {
				System.out.println("* satır sayısı 2-10 arasında olmalıdır.");
				
			}
		}
		while(this.sutun>maxSatirVeSutun || this.sutun<minSatirVeSutun) {
			System.out.println("Sutun: ");
			this.sutun=input.nextInt();
			
			if(!isUygun(this.sutun,minSatirVeSutun,maxSatirVeSutun)) {
				System.out.println("* sütun sayısı 2-10 arasında olmalıdır.");
				
			}
		}
		this.harita=new String[this.satir][this.sutun];
		this.mayinHarita=new String[this.satir][this.sutun];
		this.mayin=mayinSayisi();
		
	}
	
	public void bilgiYaz() {
		System.out.println();
		System.out.println("---Veriler---");
		System.out.println("Mayin Sayisi: "+this.mayin);
		System.out.println("Mayin İşareti: "+this.mayinİsaret);
		System.out.println("Kutu İşareti: "+this.kutuİsaret);
		System.out.println("---------------");
		
		
	}
	
	private String mayinKontrol(int acilanSatir,int acilanSutun) {
		int toplam=0;
		String StrToplam="";
		
		int startI = acilanSatir == 0 ? 0 : acilanSatir - 1;
        int endI = acilanSatir == (this.satir - 1) ? (this.satir - 1) : acilanSatir + 1;
        int startJ = acilanSutun == 0 ? 0 : acilanSutun - 1;
        int endJ = acilanSutun == (this.sutun - 1) ? (this.sutun - 1) : acilanSutun + 1;

        for (int i = startI; i <= endI; i++) {
            for (int j = startJ; j <= endJ; j++) {
                if (this.mayinHarita[i][j].equals(this.mayinİsaret)) {
                    toplam++;
                }
            }
        }
		
        StrToplam=Integer.toString(toplam);
        StrToplam="  "+StrToplam+" ";
        
        return  StrToplam;
        
	}
	
	public  void oyunBolgesi() {
		Scanner input = new Scanner(System.in);
		
		int acilanSatir=0;
		int acilanSutun=0;
		
		int oyunToplam=(this.satir*this.sutun)-this.mayin;
		boolean isWin=false;
		boolean isGameOver=false;
		
		while(!isWin&&!isGameOver) {
			acilanSatir=0;
			acilanSutun=0;
			
			System.out.println("===========");
			haritaYaz();
			
			while(acilanSatir<=0||acilanSatir>this.satir) {
				System.out.println("Satir: ");
				acilanSatir=input.nextInt();
				
				if(acilanSatir<=0||acilanSatir>this.satir) {
					System.out.println("Satir sayisi değer aralığında olmalıdır");
				}
			}
			while(acilanSutun<=0||acilanSutun>this.sutun) {
				System.out.println("Sutun: ");
				acilanSutun=input.nextInt();
				
				if(acilanSutun<=0||acilanSutun>this.sutun) {
					System.out.println("Sutun sayisi değer aralığında olmalıdır");
				}
			}
			acilanSutun--;
			acilanSatir--;
			
			if(this.mayinHarita[acilanSatir][acilanSutun].equals(this.mayinİsaret)) {
				isGameOver=true;
				this.harita[acilanSatir][acilanSutun]=this.mayinİsaret;
			}else if(this.mayinHarita[acilanSatir][acilanSutun].equals(this.kutuİsaret)&&this.harita[acilanSatir][acilanSutun].equals(this.kutuİsaret)) {
				this.harita[acilanSatir][acilanSutun]=mayinKontrol(acilanSatir,acilanSutun);
				oyunToplam--;
			}else {
				System.out.println("* ("+(++acilanSatir)+","+(++acilanSutun)+") açıktır.");
			}
			
			if(oyunToplam==0) {
				isWin=true;
				System.out.println("---KAZANDINIZ !---");
				haritaYaz();
			}else if(isGameOver) {
				System.out.println("---KAYBETTİNİZ !---");
				haritaYaz();
			
			}
		}
		
	}
		
	
}


