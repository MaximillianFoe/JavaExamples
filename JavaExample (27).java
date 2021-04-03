package Lab9;

interface KendiniTanýt{
	void IsminiYaz();
}
interface KendiniDetaylýTanýt extends KendiniTanýt{
	void NumaraniYaz();
	void SoyadiniYaz();
}
interface MaasIslemleri{
	double MaasHesapla();
}
abstract class Kisi implements KendiniDetaylýTanýt,MaasIslemleri{
	String isim;
	String soyisim;
	String numara;
	double tabanMaasi = 3000.0;
	double maasKatsayisi;
	
	Kisi(double maasKatsayisi,String isim,String soyisim,String numara){
		this.maasKatsayisi = maasKatsayisi;
		this.isim = isim;
		this.soyisim = soyisim;
		this.numara = numara;
		TumBilgileriDok();
	}
	public void NumaraniYaz() {
		System.out.print(numara);
	}
	public void SoyadiniYaz() {
		System.out.print(soyisim);
	}
	public void IsminiYaz() {
		System.out.print(isim);
	}
	public void TumBilgileriDok() {
		System.out.print(isim + "\t"+soyisim+"\t"+numara+"\t"+maasKatsayisi+"\t");
	}
}

class GenelMudur extends Kisi {

	GenelMudur(String isim, String soyisim, String numara) {
		super(0.2, isim, soyisim, numara);
		System.out.println(MaasHesapla());
	}
	
	public double MaasHesapla() {
		return this.tabanMaasi * this.maasKatsayisi + 2000.0;
	}
	
}

class Mudur extends Kisi {

	Mudur(String isim, String soyisim, String numara) {
		super(1, isim, soyisim, numara);
		System.out.println(MaasHesapla());
	}
	public double MaasHesapla() {
		return this.tabanMaasi * this.maasKatsayisi + 1000.0;
	}
}

class Muhendis extends Kisi {

	Muhendis(String isim, String soyisim, String numara) {
		super(2.8, isim, soyisim, numara);
		System.out.println(MaasHesapla());
	}
	public double MaasHesapla() {
		return this.tabanMaasi * this.maasKatsayisi + 500.0;
	}
}

public class Soru1 {

	public static void main(String[] args) {
		GenelMudur gm = new GenelMudur("Eren","Erdoðan","6161");
		Mudur m = new Mudur("Tarýk","Çýnar","616161");
		Muhendis ms = new Muhendis("Ahmet","Aydoðan","61");

	}

}
