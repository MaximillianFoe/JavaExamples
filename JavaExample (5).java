package Lab2;
import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		int[] array1 = new int[10],array2 = new int[10],array3 = new int[10]; 
		for(int i=0;i<10;i++) {
			Scanner s = new Scanner(System.in);
			System.out.println("1.Dizinin "+i + ". sayýsýný girin : ");
			array1[i]= s.nextInt();
			System.out.println("2.Dizinin "+i + ". sayýsýný girin : ");
			array2[i]=s.nextInt();
			
			array3[i]=array1[i]+array2[i];
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(array3[i]);
		}
		
	}

}
