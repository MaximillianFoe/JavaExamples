package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class soru3 {

	public static void main(String[] args) {
		ArrayList baklava = new ArrayList();
		
		for(int i=0;i<=5;i++) {
			if(i%2 == 1) {
				String b="";
				for(int k=0;k<i;k++) {
					b += "*";
				}
				baklava.add(b);
			}
		}
		for(int i=baklava.size()-2;i>=0;i--) {
			baklava.add(baklava.get(i));
		}
		for(int i=0;i<baklava.size();i++) {
			System.out.println(baklava.get(i));
		}
		
		int n=0;
		while(n<baklava.size()&& n>=0) {
			Scanner in = new Scanner(System.in);
			n = in.nextInt();
			if(n<baklava.size()&& n>=0)
			System.out.println("Baklava "+ n +" : " +baklava.get(n));
		}
	}

}
