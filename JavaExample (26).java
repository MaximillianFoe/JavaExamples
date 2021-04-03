package Lab8;

class Arac{
	String plaka;
	
	Arac(String plaka){
		this.plaka = plaka;
	}
	
	void EkranaYaz() {
		System.out.print(plaka);
	}
	
}

class Binek extends Arac{
	int motorHacmi;
	
	Binek(String plaka,int motorHacmi) {
		super(plaka);
		this.motorHacmi = motorHacmi;
		
	}

	void EkranaYaz() {
		System.out.print(plaka+"\t"+motorHacmi);
	}
}

class AgirTasit extends Arac{
	int motorHacmi;
	AgirTasit(String plaka,int motorHacmi) {
		super(plaka);
		this.motorHacmi = motorHacmi;
	}
	void EkranaYaz() {
		System.out.print(plaka+"\t"+motorHacmi);
	}
	
}

class Otomobil extends Binek{
	String renk;
	double vergi;
	Otomobil(String plaka, int motorHacmi,String renk) {
		super(plaka, motorHacmi);
		this.renk = renk;
		VergiHesapla(motorHacmi);
	}
	
	void EkranaYaz() {
		System.out.print(plaka+"\t"+"Otomobil"+"\t"+motorHacmi+"\t"+vergi+"\t"+"Otomobil"+"\t"+renk);
	}
	
	void VergiHesapla(double motorHacmi) {
		if(motorHacmi <= 100) {
			vergi = 0;
		}else {
			vergi = (motorHacmi*2+800)/70;
		}
	}
}

class Otobus  extends AgirTasit{
	double vergi;
	Otobus(String plaka, int motorHacmi) {
		super(plaka, motorHacmi);
		VergiHesapla(motorHacmi);
	}
	
	void EkranaYaz() {
		System.out.print(plaka+"\t"+"AgirTasit"+"\t"+motorHacmi+"\t"+vergi+"\t"+"Otobus");
	}
	
	void VergiHesapla(double motorHacmi) {
		if(motorHacmi <= 100) {
			vergi = 0;
		}else {
			vergi = (motorHacmi*2+800)/70;
		}
	}
}



public class Soru2 {
	
	public static void main(String[] args) {
		Otomobil o= new Otomobil("61FG064",1400,"kirmizi");
		Otobus ot = new Otobus("34EF087",8158);
		
		o.EkranaYaz();
		System.out.println();
		ot.EkranaYaz();
	}

}
