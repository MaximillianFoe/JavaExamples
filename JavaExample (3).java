package Lab;

import java.util.*;

public class Lab1Soru3 {
	
	static int çiftler=0,tekler=0;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i=0,ç=0,t=0;
		while(i<20) {
			int sayi = s.nextInt();
			if(sayi % 2 == 0) {
				ÇiftleriTopla(sayi);
				ç++;
			}else {
				TekleriTopla(sayi);
				t++;
			}
			i++;
		}
		
		System.out.println(ç+" tane çift sayýnýn toplamý : "+çiftler);
		System.out.println(t+" tane tek sayýnýn toplamý : "+tekler);
		
	}

	static void TekleriTopla(int sayi) {
		tekler+=sayi;
		
	}

	static void ÇiftleriTopla(int sayi) {
		çiftler+=sayi;
		
	}

}
