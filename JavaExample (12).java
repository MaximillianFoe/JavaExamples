package Lab4;
import java.util.*;
public class Soru1 {

	public static void main(String[] args) {
		ArrayList<Integer> �grenciNotlar� = new ArrayList<Integer>(),derstenGe�enler = new ArrayList<Integer>(),derstenKalanlar = new ArrayList<Integer>();
		int not=0;
		Scanner in = new Scanner(System.in);
		do {
			System.out.print("��rencinin Notunu Giriniz : ");
			not = in.nextInt();
			
			if(not>=50 && not<=100) {
				�grenciNotlar�.add(not);
				derstenGe�enler.add(not);
			}
			else if(not<50 && not>=0) {
				�grenciNotlar�.add(not);
				derstenKalanlar.add(not);
			}
		}while(not>=0);
		
		System.out.println("\n��renci Notlar� \n------");
		for(int i=0;i<�grenciNotlar�.size();i++) {
			System.out.println("#"+(i+1)+" -> "+�grenciNotlar�.get(i));
		}
		
		System.out.println("\nGe�en ��renci Notlar� \n------");
		for(int i=0;i<derstenGe�enler.size();i++) {
			System.out.println("#"+(i+1)+" -> "+derstenGe�enler.get(i));
		}
		
		System.out.println("\nKalan ��renci Notlar� \n------");
		for(int i=0;i<derstenKalanlar.size();i++) {
			System.out.println("#"+(i+1)+" -> "+derstenKalanlar.get(i));
		}
		
	}

}
