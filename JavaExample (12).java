package Lab4;
import java.util.*;
public class Soru1 {

	public static void main(String[] args) {
		ArrayList<Integer> ögrenciNotlarý = new ArrayList<Integer>(),derstenGeçenler = new ArrayList<Integer>(),derstenKalanlar = new ArrayList<Integer>();
		int not=0;
		Scanner in = new Scanner(System.in);
		do {
			System.out.print("Öðrencinin Notunu Giriniz : ");
			not = in.nextInt();
			
			if(not>=50 && not<=100) {
				ögrenciNotlarý.add(not);
				derstenGeçenler.add(not);
			}
			else if(not<50 && not>=0) {
				ögrenciNotlarý.add(not);
				derstenKalanlar.add(not);
			}
		}while(not>=0);
		
		System.out.println("\nÖðrenci Notlarý \n------");
		for(int i=0;i<ögrenciNotlarý.size();i++) {
			System.out.println("#"+(i+1)+" -> "+ögrenciNotlarý.get(i));
		}
		
		System.out.println("\nGeçen Öðrenci Notlarý \n------");
		for(int i=0;i<derstenGeçenler.size();i++) {
			System.out.println("#"+(i+1)+" -> "+derstenGeçenler.get(i));
		}
		
		System.out.println("\nKalan Öðrenci Notlarý \n------");
		for(int i=0;i<derstenKalanlar.size();i++) {
			System.out.println("#"+(i+1)+" -> "+derstenKalanlar.get(i));
		}
		
	}

}
