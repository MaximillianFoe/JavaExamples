package Lab;

import java.util.*;

public class Lab1Soru3 {
	
	static int �iftler=0,tekler=0;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i=0,�=0,t=0;
		while(i<20) {
			int sayi = s.nextInt();
			if(sayi % 2 == 0) {
				�iftleriTopla(sayi);
				�++;
			}else {
				TekleriTopla(sayi);
				t++;
			}
			i++;
		}
		
		System.out.println(�+" tane �ift say�n�n toplam� : "+�iftler);
		System.out.println(t+" tane tek say�n�n toplam� : "+tekler);
		
	}

	static void TekleriTopla(int sayi) {
		tekler+=sayi;
		
	}

	static void �iftleriTopla(int sayi) {
		�iftler+=sayi;
		
	}

}
