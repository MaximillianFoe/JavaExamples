package Lab5;

import java.util.*;;

public class soru2 {

	public static void main(String[] args) {
		ArrayList<Float> sayilar = new ArrayList<Float>();

		float sayi= 0;
		do {
			Scanner in = new Scanner(System.in);
			sayi = in.nextInt();
			if(sayi!=-1)sayilar.add(sayi);
		}while(sayi != -1);
		float toplam=0,ortalama;
		for(int i=0;i<sayilar.size();i++) {
			toplam += sayilar.get(i);
		}
		ortalama = toplam / sayilar.size();
	System.out.println("Toplam : "+ toplam+"\nOrtalama : "+ortalama); 
	}

}
