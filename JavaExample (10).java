package Lab3;
class Ogrenci{
	public String adi, soyadi,nosu;
	int dersnotu;
	public Ogrenci(String a,String s,String n,int dn){
		adi = a;
		soyadi = s;
		nosu = n;
		dersnotu = dn;
		NotYazdir();
	}
	String HarfNotu() {
		String hN = "FF";
		if(dersnotu > 90) {
			hN ="AA";
		}else if(dersnotu > 70) {
			hN = "BB";
		}else if(dersnotu >50) {
			hN = "CC";
		}else if(dersnotu > 35) {
			hN = "DD";
		}
		
		return hN;
	}
	void NotYazdir() {
		System.out.println(adi + "\t" + soyadi +"\t"+nosu+"\t"+dersnotu+"\t"+HarfNotu());
	}
}

public class Soru2 {
	
	public static void main(String[] args) {
		
		Ogrenci ogr1 = new Ogrenci("Yavuz","Selim","160432456788",56) , ogr2 =  new Ogrenci("Abdullah","Sayid","160455678996",68),ogr3 =  new Ogrenci("Merve","Aksoy","160556899876",86);
		
	}

}
