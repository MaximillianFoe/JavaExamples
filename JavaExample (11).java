package Lab3;
class Ogrencii{
	public String adi, soyadi;
	float vize1,vize2,finalNotu,dersnotu;
	public Ogrencii(int id , String a,String s,float v1,float v2,float fn){
		adi = a;
		soyadi = s;
		vize1 = v1;
		vize2 = v2;
		finalNotu = fn;
		NotYazdir(id);
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
	float ortalamaBul() {
		dersnotu = vize1 * 0.3f +vize2 * 0.3f +finalNotu * 0.4f;
		return dersnotu;
	}
	void NotYazdir(int i) {
		System.out.println(i+"\t"+adi + "\t" + soyadi +"\t"+vize1+"\t"+vize2+"\t"+finalNotu+"\t"+ortalamaBul()+"\t"+HarfNotu());
	}
}

public class Soru3 {

	public static void main(String[] args) {
		Ogrencii[] ogrenciler = new Ogrencii[5];
		ogrenciler[0] = new Ogrencii(1,"Abdullah","Sayin   ",83f,95f,90f);
		ogrenciler[1] = new Ogrencii(2,"Alperan ","Sahin    ",40f,50f,45f);
		ogrenciler[2] = new Ogrencii(3,"Mehmet  ","Etes    ",30f,65f,86f);
		ogrenciler[3] = new Ogrencii(4,"Ahmet   ","Lokcu   ",50f,60f,87f);
		ogrenciler[4] = new Ogrencii(5,"Senanur ","Katipoðlu",50f,30f,56f);
	}

}
