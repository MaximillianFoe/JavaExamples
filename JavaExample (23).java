package Lab6;

import java.util.Random;
import java.util.Scanner;

public class Soru6 {

	public static void main(String[] args) {
		int para1,para2,zar1,zar2,tur=0;
		Random rnd = new Random();
		Scanner in = new Scanner(System.in);
		System.out.print("1.oyuncunun para miktar: ");
		para1 = in.nextInt();
		System.out.print("\n2.oyuncunun para miktar: ");
		para2 = in.nextInt();
		in.nextLine();/*bug olduðu için gerekli çalýþmýyor zaten*/
		do {
			tur++;
			System.out.println("\n# "+tur+". Turdasýnýz.");
			zar1 = rnd.nextInt(6)+1;
			zar2 = rnd.nextInt(6)+1;
			System.out.println("\t1.Oyuncunun Attýðý Zar = "+zar1);
			System.out.println("\t2.Oyuncunun Attýðý Zar = "+zar2);
			System.out.println("\t\tZarlar arasýndaki fark = "+Math.abs(zar1-zar2));
			if(zar1<zar2) {
				para1 -= (zar2-zar1);
				System.out.println("\t1. Oyuncunun kalan parasý = "+para1);
			}else if(zar2<zar1) {
				para2 -= (zar1-zar2);
				System.out.println("\t2. Oyuncunun kalan parasý = "+para2);
			}else {
				System.out.println("\tZarlar Eþit");
			}
			if(para1>0 && para2>0) {
				System.out.print("Zar atmak için enter basýnýz");
				in.nextLine();
				}
		}while(para1>0 && para2>0);
		
		if(para1>0) {
			System.out.println("\n\n(*.*) 1.Oyuncu "+tur+". turda Kazandý. (*.*)");
		}else {
			System.out.println("\n\n(*.*) 2.Oyuncu "+tur+". turda Kazandý. (*.*)");
		}
	}

}
