package Lab4;
import java.util.*;
public class Soru2 {

	public static void main(String[] args) {
		ArrayList<Integer> dizi = new ArrayList<Integer>();
		
		for(int i=1;i<101;i++) {
			dizi.add(i);
			System.out.print(i +" - ");
		}
		
		for(int i=0;i<dizi.size();i++) {
			if(dizi.get(i) % 5 == 0)
				dizi.remove(i);
		}
		System.out.println("\n\nDizinin eleman sayýsý : " + dizi.size()+"\n--------");
		for(int i=0;i<dizi.size();i++) {
			System.out.print(dizi.get(i) + " - ");
		}
		
		
		
		
	}

}
