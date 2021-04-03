package Lab6;

import java.util.Scanner;

public class Soru5 {
	
	public enum HarfNotu{
		AA("100 ile 80"),
		BB("79 ile 65"),
		CC("64 ile 55"),
		DD("54 ile 35"),
		FF("34 ile 0");
		private String aral�k;
		private HarfNotu(String aral�k) {
			this.aral�k = aral�k;
		}
		public String getNotAralik() {
			return aral�k;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String not;
		Scanner in = new Scanner(System.in);
		System.out.print("Harf Notu Giriniz: ");
		not = in.next();
		//hashcode almak zorunda kald�m di�er t�rl� e�itlemiyordu ayn� olmalar�na rahmen
		if(not.hashCode() == "AA".hashCode()) {
			not = HarfNotu.AA.getNotAralik();
		}else if(not.hashCode() == "BB".hashCode()) {
			not = HarfNotu.BB.getNotAralik();
		}else if(not.hashCode() == "CC".hashCode()) {
			not = HarfNotu.CC.getNotAralik();
		}else if(not.hashCode() == "DD".hashCode()) {
			not = HarfNotu.DD.getNotAralik();
		}else if(not.hashCode() == "FF".hashCode()) {
			not = HarfNotu.FF.getNotAralik();
		}else {
			not = "!!Error!!";
		}
		System.out.println("Bu harf notu " + not + " aras�nda olan notlar� temsil ediyor.");
	}

}
