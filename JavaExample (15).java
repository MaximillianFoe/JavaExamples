package Lab5;

import java.util.*;

class Urun{
	String adi;
	float aFiyat;
	float sFiyat;
	String skt;
	String ut;
	float kar;
	
	
	Urun(String a,float aF,float sF,String skt,String ut){
		adi = a;
		aFiyat = aF;
		sFiyat = sF;
		this.skt = skt ;
		this.ut = ut;
		Hesapla();
	}
	
	public void Hesapla(){
		kar = sFiyat - aFiyat;
	}
	public void Goster() {
		System.out.println("Adý : "+adi+"\nAlýþ Fiyatý : "+aFiyat+"\nSatýþ Fiyatý :"+sFiyat+"\nSon Kullanma Tarihi : "+skt+"\nÜretim Tarihi : "+ut+"\nKar : "+kar);
	}
}

class Market{
	public ArrayList<Urun> urunler = new ArrayList<Urun>();
	
	Market(){
		
	}
	
	public void UrunEkle(Urun u) {
		urunler.add(u);
		System.out.println("Ürün Eklendi.");
	}
	public void UrunGoster(int i) {
		System.out.println("Ürün "+(i+1)+ " : ");
		urunler.get(i).Goster();
	}
	public void UrunSil(int i) {
		urunler.remove(i);
		System.out.println("Ürün Silindi.");
	}
}

public class soru1 {
	
	
	public static void main(String[] args) {
		int secim = 0;
		Market m = new Market();
		do {
			System.out.println("\n1) Ürün ekle\n2) Ürün Göster\n3) Ürün Sil\n4) Çýkýþ\n");
			System.out.print("\nSecim : ");
			Scanner in = new Scanner(System.in);
			secim = in.nextInt();
			
			
			switch(secim) {
			
			case 1:
				String adi;
				float aFiyat;
				float sFiyat;
				String skt;
				String ut;
				System.out.print("Ürün Adý : ");
				adi = in.next();
				System.out.print("Alýþ Fiyatý : ");
				aFiyat = in.nextFloat();
				System.out.print("Satýþ Fiyatý : ");
				sFiyat = in.nextFloat();
				System.out.print("Son Kullanma Tarihi : ");
				skt = in.next();
				System.out.print("Uretim Tarihi : ");
				ut = in.next();
				m.UrunEkle(new Urun(adi,aFiyat,sFiyat,skt,ut));
				m.UrunGoster(m.urunler.size()-1);
				System.out.println("Ürün Eklendi.");
				break;
			case 2:
				int i;
				System.out.print("Kaçýncý Ürün Gösterilsin : ");
				i = in.nextInt();
				m.UrunGoster(i-1);
				break;
			case 3:
				int x;
				System.out.println("Kaçýncý Ürün Silinsin : ");
				x = in.nextInt();
				m.UrunSil(x-1);
				break;
			case 4:
				System.out.println("Sistem Kapanýyor .....");
				break;
			}
			
			
			
			
		}while(secim != 4);
		System.out.println("Sistem Kapandý.");
	}


}


