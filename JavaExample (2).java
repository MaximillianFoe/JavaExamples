package Lab;
import java.util.*;
public class Lab1Soru2 {

	public static void main(String[] args) {
	
		S�n�fOrtalamas�();
	}
	
	static void S�n�fOrtalamas�() {
		Scanner s = new Scanner(System.in);
		
		float toplam = 0,i=0,not = 0;
		
		while(not >= 0) {
			System.out.println("Not Giriniz: ");
			not = s.nextFloat();
			if(not > 0 ) {
				toplam += not;
				i++;
			}else {
				toplam = toplam / i;
			}
		}
		System.out.println(toplam);
	}

}
