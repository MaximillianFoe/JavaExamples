package Lab4;
import java.util.*;
public class Soru3 {

	public static void main(String[] args) {
		ArrayList s�n�f1 = new ArrayList(),s�n�f2 = new ArrayList(),s�n�f3 = new ArrayList();
		ArrayList<ArrayList> s�n�flar = new ArrayList<ArrayList>();
		Scanner in = new Scanner(System.in);
		int secim=0;
		do {
			System.out.print("Hangi S�n�f�n ��rencisini Giriceksiniz : ");
			secim  = in.nextInt();
			String isim;
			
			switch(secim) {
			
			 	case 1:
			 		System.out.print("1.S�n�f�n ��rencisinin ismi : ");
			 		isim = in.next();
			 		s�n�f1.add(isim);
			 		break;
			 	case 2:
			 		System.out.print("2.S�n�f�n ��rencisinin ismi : ");
			 		isim = in.next();
			 		s�n�f2.add(isim);
			 		break;
			 	case 3:
			 		System.out.print("3.S�n�f�n ��rencisinin ismi : ");
			 		isim = in.next();
			 		s�n�f3.add(isim);
			 		break;
			}
			
		}while(secim>=1 && secim<=3);
		
		s�n�flar.add(s�n�f1);
		
		if(s�n�f2.size() < s�n�flar.get(0).size()) {
			s�n�flar.add(0, s�n�f2);
		}else {
			s�n�flar.add(s�n�f2);
		}
		
		if(s�n�f3.size() < s�n�flar.get(0).size()) {
			s�n�flar.add(0,s�n�f3);
		}else if(s�n�f3.size() < s�n�flar.get(1).size()) {
			s�n�flar.add(1,s�n�f3);
		}else {
			s�n�flar.add(s�n�f3);
		}
		System.out.println("\nS�n�flar \n-----------");
		for(int i = 0 ; i < s�n�flar.size();i++) {
			System.out.println(("#"+ i + " | Eleman Say�s� : "+s�n�flar.get(i).size() + " | " + s�n�flar.get(i)));
		}
		
		
	}

}

