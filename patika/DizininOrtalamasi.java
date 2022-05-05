package patika.Arrays;

public class DizininOrtalamasi {

	public static void main(String[] args) {
	
		//int []dizi= {15,6,7,12,7,9,3};
		
		int []dizi= {1,2};
		
		double sum=0;
		for(int i=0;i<dizi.length;i++) {
			sum+=dizi[i];
		}
		double avarage=sum/dizi.length;
	//	System.out.println(avarage);
		
		//harmonik seri;
		
		double harmonik=0.0;
		for(int j=0;j<dizi.length;j++) {
			
			harmonik+=(1.0/dizi[j]);
		}
		double harmonikOrt=dizi.length/harmonik;
		System.out.println(harmonik);
		System.out.println(harmonikOrt);
	}
	

}
