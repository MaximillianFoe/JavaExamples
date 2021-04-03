package Lab;
import java.util.*;
public class Lab1Soru1 {

	public static void main(String[] args) {
		System.out.println("<+> Toplama\n<-> Çýkarma\n<*>Carpma\n</> Bolme\n\n\n");
		int i = 0;
		while(i<10){
			Menu();
			System.out.println("-------------------------");
			i++;
		}
		
	}
	
	static void Menu() {
		
		Scanner s = new Scanner(System.in);
		char islem;
		float sayi1,sayi2,sonuc = 0;
		
		
		System.out.println("Ýki sayý giriniz: ");
		sayi1 = s.nextInt();
		sayi2 = s.nextInt();
		System.out.println("Bir iþlem Yapiniz <+ - * />: ");
		islem = s.next().charAt(0);
		if(islem == '+') {
			sonuc = sayi1 + sayi2;
			SonucYazdir(sonuc);
		}else if(islem == '-'){
			sonuc = sayi1 - sayi2;
			SonucYazdir(sonuc);
		}else if(islem == '*') {
			sonuc = sayi1 * sayi2;
			SonucYazdir(sonuc);
		}else if(islem == '/') {
			sonuc = sayi1 / sayi2;
			SonucYazdir(sonuc);
		}else {
			System.out.println("Geçersiz islem sectiniz!");
		}
		
		
	}
	static void SonucYazdir(float s) {
		System.out.println(s);
	}
	

}
