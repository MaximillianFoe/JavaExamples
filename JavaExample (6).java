package Lab2;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		String[] isim = new String[3],tersi = new String[3];
		for(int i=0;i<3;i++) {
			Scanner s = new Scanner(System.in);
			isim[i] = s.next();
			tersi[i]="";
			for(int j=isim[i].length()-1;j>=0;j--) {
			tersi[i]+=isim[i].charAt(j);	
			}
		}
		for(int i=0;i<3;i++) {
			System.out.println(tersi[i]);
		}
	}

}
