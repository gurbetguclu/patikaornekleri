package patika.Arrays;

public class MatrisTranspoz {

	public static void main(String[] args) {
	int [][]matris= {{2,3,4},{5,6,4}};
	
	int [][]transpoz=new int[matris[0].length][matris.length];
	
	for(int i=0;i<matris.length;i++) {
		for(int j=0; j<matris[0].length;j++) {
			transpoz[j][i]=matris[i][j];
		}
		
	}
	 System.out.println("Matris");
     for(int i=0; i<matris.length; i++) {
         for(int j=0; j<matris[0].length; j++) {
             System.out.print(matris[i][j]+"\t");
         }
         System.out.println();
     }
     System.out.println("Transpoze");
     for(int j=0; j<transpoz.length; j++) {
         for(int i=0; i<transpoz[0].length; i++) {
             System.out.print(transpoz[j][i]+"\t");
         }
         System.out.println();
     }
	}

	}


