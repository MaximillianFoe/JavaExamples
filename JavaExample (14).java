package Lab4;
import java.util.*;
public class Soru3 {

	public static void main(String[] args) {
		ArrayList sýnýf1 = new ArrayList(),sýnýf2 = new ArrayList(),sýnýf3 = new ArrayList();
		ArrayList<ArrayList> sýnýflar = new ArrayList<ArrayList>();
		Scanner in = new Scanner(System.in);
		int secim=0;
		do {
			System.out.print("Hangi Sýnýfýn Öðrencisini Giriceksiniz : ");
			secim  = in.nextInt();
			String isim;
			
			switch(secim) {
			
			 	case 1:
			 		System.out.print("1.Sýnýfýn Öðrencisinin ismi : ");
			 		isim = in.next();
			 		sýnýf1.add(isim);
			 		break;
			 	case 2:
			 		System.out.print("2.Sýnýfýn Öðrencisinin ismi : ");
			 		isim = in.next();
			 		sýnýf2.add(isim);
			 		break;
			 	case 3:
			 		System.out.print("3.Sýnýfýn Öðrencisinin ismi : ");
			 		isim = in.next();
			 		sýnýf3.add(isim);
			 		break;
			}
			
		}while(secim>=1 && secim<=3);
		
		sýnýflar.add(sýnýf1);
		
		if(sýnýf2.size() < sýnýflar.get(0).size()) {
			sýnýflar.add(0, sýnýf2);
		}else {
			sýnýflar.add(sýnýf2);
		}
		
		if(sýnýf3.size() < sýnýflar.get(0).size()) {
			sýnýflar.add(0,sýnýf3);
		}else if(sýnýf3.size() < sýnýflar.get(1).size()) {
			sýnýflar.add(1,sýnýf3);
		}else {
			sýnýflar.add(sýnýf3);
		}
		System.out.println("\nSýnýflar \n-----------");
		for(int i = 0 ; i < sýnýflar.size();i++) {
			System.out.println(("#"+ i + " | Eleman Sayýsý : "+sýnýflar.get(i).size() + " | " + sýnýflar.get(i)));
		}
		
		
	}

}

