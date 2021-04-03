package Lab2;
import java.util.*;
public class Example4 {

	public static void main(String[] args) {
		int[][] array = new int[5][5];
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				//Scanner s = new Scanner(System.in);
				array[i][j] = i*5 + (j+1);
				if(i!=j && i != 4-j) {
					array[i][j]=0;
				}
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}

}
