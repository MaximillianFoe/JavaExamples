package Lab6;

public class Soru2 {

	public static void main(String[] args) {
		double a,b,h;
		
		a=(float) (Math.random() * 100 + 1);
		b=(float) (Math.random() * 100 + 1);
		h =Math.sqrt(Math.pow(a, 2)+Math.pow(b,2));
		
		System.out.println("A : "+a+"\nB : "+b+"\nHipotenüs : "+h);
	}

}
