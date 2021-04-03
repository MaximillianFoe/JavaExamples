package Lab;

import java.util.*;

public class Lab1Soru4 {

	public static void main(String[] args) {
		int DersVeNotu[][] = new int[10][10];
		int dersOrt[] = new int[10];
		
		for(int i=0;i<10;i++) {
			dersOrt[i] = 0;
		}
		
		Scanner s = new Scanner(System.in);
		for(int i = 0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.println(dersGetir(i)+" Dersinin "+j+" nolu öðrencisinin notunu giriniz : ");
				DersVeNotu[i][j] = s.nextInt();
				dersOrt[i]+=DersVeNotu[i][j];
			}
			dersOrt[i]/=10;
		}
		
		for(int i = 0;i<10;i++) {
			System.out.println(dersGetir(i)+" Dersinin sýnýf ortalamasý : "+dersOrt[i]);
		}
		
	}

	static String dersGetir(int i) {
		String dersAdi;
		switch(i) {
		// ders isimleri isteðe göre girelbilir
		default: dersAdi = "Ders " + (i+1); 
		}
		return dersAdi;
	}
	
	

}
