package patika;

import java.util.Scanner;

public class burcbulma {

	public static void main(String[] args) {
	
		int ay,gun;
		
		String burc="";
		
		boolean isError=false;
				
		
		Scanner giris=new Scanner(System.in);
		
		System.out.print("Hangi ay doğdunuz:");
		ay= giris.nextInt();
		
		System.out.print("Ayın kaçında doğdunuz:");
		gun= giris.nextInt();
		
		if(ay==1) {
			if (gun>=1 && gun<=31) {
				if(gun<=21) {
					burc="oğlak";
				}else {
					burc="kova";
				}
			
			}else {
				isError =true;
			}
			
		} else if(ay==2) {
			if (gun>=1 && gun<=28) {
				if(gun<=19) {
					burc="kova";
				}else {
					burc="balık";
				}
			
			}else {
				isError =true;
		}

		}else if(ay==3) {
			if (gun>=1 && gun<=31) {
				if(gun<=20) {
					burc="balık";
				}else {
					burc="koç";
				}
		
			}else {
			isError =true;	
			}
			
		}else if(ay==4) {
			if (gun>=1 && gun<=30) {
				if(gun<=20) {
					burc="koç";
				}else {
					burc="boğa";
			}
		
			}else {
				isError =true;	
			}

		}else if(ay==5) {
			if (gun>=1 && gun<=31) {
				if(gun<=21) {
					burc="boğa";
				}else {
					burc="ikizler";
				}
	
		   }else {
				isError =true;	
		}

		}else if(ay==6) {
			if (gun>=1 && gun<=30) {
				if(gun<=22) {
					burc="ikizler";
				}else {
					burc="yengeç";
	}

			}else {
				isError =true;	
	}

		}else if(ay==7) {
			if (gun>=1 && gun<=31) {
				if(gun<=22) {
					burc="yengeç";
				}else {
					burc="aslan";
	}

			}else {
				isError =true;	
	}

		}else if(ay==8) {
			if (gun>=1 && gun<=31) {
				if(gun<=22) {
					burc="aslan";
				}else {
					burc="başak";
	}

			}else {
				isError =true;	
	}

		}else if(ay==9) {
			if (gun>=1 && gun<=30) {
				if(gun<=22) {
					burc="başak";
				}else {
					burc="terazi";
	}

			}else {
				isError =true;	
	}

		}else if(ay==10) {
			if (gun>=1 && gun<=31) {
				if(gun<=22) {
					burc="terazi";
				}else {
					burc="akrep";
	}

			}else {
				isError =true;	
	}

		}else if(ay==11) {
			if (gun>=1 && gun<=30) {
				if(gun<=21) {
					burc="akrep";
				}else {
					burc="yay";
	}

			}else {
				isError =true;	
	}

		}else if(ay==12) {
			if (gun>=1 && gun<=31) {
				if(gun<=21) {
					burc="yay";
				}else {
					burc="oğlak";
	}

			}else {
				isError =true;	
	}

}
		
		if(isError) {
			System.out.println("Hatalı tarih girdiniz");
		}else {
			System.out.println("Burcunuz:"+burc);
		}
			
}
}

