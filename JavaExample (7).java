package Lab2;

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		String[][] array = new String[2][];
		
		array[0]=new String[7];
		array[1]=new String[12];
		
		for(int i=0;i<2;i++) {
			int k=0;
			if(i==0)k=7;
			if(i==1)k=12;
			for(int j=0;j<k;j++) {
				Scanner s = new Scanner(System.in);
				if(i==0)System.out.println("Haftan�n "+(j+1)+".g�n�n�n ismini girin : ");
				if(i==1)System.out.println((j+1)+".ay�n ismini girin : ");
				array[i][j] = s.next();
			}
			
			
		}
		for(int i=0;i<2;i++) {
			int k=0;
			if(i==0)k=7;
			if(i==1)k=12;
			for(int j=0;j<k;j++) {
				if(i==0)System.out.println("Haftan�n "+(j+1)+".g�n� >"+array[i][j]+"< d�r.");
				if(i==1)System.out.println((j+1)+".ay�n ismi >"+array[i][j]+"< d�r.");
			}
		}
		
		
	}
}
