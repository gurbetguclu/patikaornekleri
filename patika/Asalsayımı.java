package GURBET;

public class Asalsayımı {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
            if(Asalmı(i)) {
                System.out.print(i + " ");
            }
        }    
    }

    public static boolean Asalmı(int number) {
        for(int i = 2; i < number; i++) {
	    if(number % i == 0) {
                return false;
            }
        }
        
        return true;
    }

	}


