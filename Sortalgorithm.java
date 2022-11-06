package in.ineuron.main;
import java.util.*;

public class Sortalgorithm {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[]a=new int[6];
		for(int i=0;i<a.length;i++) {
			System.out.print("ENTER THE NUMBER TO PUSH INTO THE ARRAY");
			a[i]=scan.nextInt();
			}
		Arrays.sort(a);
		for(int d:a) {
			System.out.print(d);
			
		}
		

	}

}
