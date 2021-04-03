package Lab6;

import java.util.ArrayList;
import java.util.Random;

public class Soru1 {
	
	public static void main(String[] args) {
		ArrayList<Integer> random2055 = new ArrayList<Integer>();
		int r=0,sayac=0;
		do {
			r = (int) (Math.random()*35 + 20);
			if(!AsalMý(r)) {
				random2055.add(r);
				sayac++;
			}
		}while(!AsalMý(r));
		System.out.println("dizi : "+random2055+"\neleman sayýsý : "+sayac);
		
	}
	
	static boolean AsalMý(int r) {
		
		int k=0;
		for(int i=2;i<r;i++){
			if(r%i==0){
				k++;
			}
		}
		if(k==0){
			return true;
		}
		else {
			return false;
		}
	}
	
	

}
