package Lab7;
class calisan{
	protected String isim;
	protected String soyisim;
	protected String Tc;
	protected float saat;
	protected float oran;
	calisan(String isim,String soyisim,String Tc,float saat,float oran){
		this.isim = isim;
		this.soyisim = soyisim;
		this.Tc = Tc;
		this.saat = saat;
		this.oran = oran;
	}
	
	float MaasHesapla() {
		return saat * oran;
	}
	
	void setIsim(String isim) {
		this.isim = isim;
	}
	void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	void setTc(String Tc) {
		this.Tc = Tc;
	}
	void setSaat(float saat) {
		this.saat = saat;
	}
	void setOran(float oran) {
		this.oran = oran;
	}
	
	String getIsim() {
		return isim;
	}
	String getSoyisim() {
		return soyisim;
	}
	String getTc() {
		return Tc;
	}
	float getSaat() {
		return saat;
	}
	float getOran() {
		return oran;
	}
	
}

class memur extends calisan{
	String kurumAdi;
	String pozisyon;

	memur(String isim, String soyisim, String Tc, float saat, float oran,String kurumAdi,String pozisyon) {
		super(isim, soyisim, Tc, saat, oran);
		this.kurumAdi = kurumAdi;
		this.pozisyon = pozisyon;
		MaasHesapla();
	}
	
	void setKurumAdi(String kurumAdi) {
		this.kurumAdi = kurumAdi;
	}
	void setPozisyon(String pozisyon) {
		this.pozisyon = pozisyon;
	}
	
	String getKurumAdi() {
		return kurumAdi;
	}
	String getPozisyon() {
		return pozisyon;
	}
	float MaasHesapla() {
		if(this.saat <= 100) return saat * oran;
		else return saat*oran +(saat-100)*oran;
	}
	
	
}

class isci extends calisan{
	String sektorAdi;
	float ekSaat;
	isci(String isim, String soyisim, String Tc, float saat, float oran,String sektorAdi,float ekSaat) {
		super(isim, soyisim, Tc, saat, oran);
		this.sektorAdi = sektorAdi;
		this.ekSaat = ekSaat;
	}
	
	void setSektorAdi(String sektorAdi) {
		this.sektorAdi = sektorAdi;
	}
	void setEkSaat(float ekSaat) {
		this.ekSaat = ekSaat;
	}
	
	String getSektorAdi() {
		return sektorAdi;
	}
	float getEkSaat() {
		return ekSaat;
	}
	
	float MaasHesapla() {
		return saat * oran + ekUcret();
	}
	float ekUcret() {
		return ekSaat*(oran+oran/4);
	}
	
}
public class Soru2 {

	public static void main(String[] args) {
		calisan c = new calisan("Eren","Erdoðan","123456789",150,1.2f);
		memur m = new memur("Ahmet","Aydoðan","987654321",120,0.8f,"Ahmet AÞ.","Patron");
		isci i = new isci("Tarýk","Çýnar","6161616161",150,2.4f,"Apple",570);
		
		System.out.println("# Calisan\n-------------\nÝsim\t\t: "+c.getIsim()+"\nSoyisim\t\t: "+c.getSoyisim()+"\nTc\t\t: "+c.getTc()+"\nSaat\t\t: "+c.getSaat()+"\nOran\t\t: "+c.getOran()+"\nMaas\t\t: "+c.MaasHesapla());
		System.out.println("\n# Memur\n-------------\nÝsim\t\t: "+m.getIsim()+"\nSoyisim\t\t: "+m.getSoyisim()+"\nTc\t\t: "+m.getTc()+"\nSaat\t\t: "+m.getSaat()+"\nOran\t\t: "+m.getOran()+"\nKurum Adý\t: "+m.getKurumAdi()+"\nPozisyon\t: "+m.getPozisyon()+"\nMaas\t\t: "+m.MaasHesapla());
		System.out.println("\n# Ýsci\n-------------\nÝsim\t\t: "+i.getIsim()+"\nSoyisim\t\t: "+i.getSoyisim()+"\nTc\t\t: "+i.getTc()+"\nSaat\t\t: "+i.getSaat()+"\nOran\t\t: "+i.getOran()+"\nSektör Adý\t: "+i.sektorAdi+"\nEk Saat\t\t: "+i.getEkSaat()+"\nMaas\t\t: "+i.MaasHesapla());


	}

}
