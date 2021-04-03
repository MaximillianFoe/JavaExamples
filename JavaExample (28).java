package Lab7;

import java.util.Scanner;




class Kombinasyon{
	static int VeriHesapla(int m,int n) {
		int c=0;
		c= FactHesapla(m)/(FactHesapla(n)*FactHesapla(m-n));
		return c;
	}
	
	static int FactHesapla(int k) {
		if(k<=1) return 1;
		else return k*FactHesapla(k-1);
	}
}

public class KombinasyonTest{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m,n;
		m = in.nextInt();
		n = in.nextInt();
		System.out.println("Kombinasyonun sonucu : " + Kombinasyon.VeriHesapla(m,n));
	}
}






