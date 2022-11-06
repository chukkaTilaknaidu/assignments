package in.ineuron.main;
import java.util.*;

public class Duplicates {

	public static void main(String[] args) {
		int []a=new int[9];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			System.out.print("ENTER THE NUMBER TO PUSH INTO ARRAY");
			a[i]=scan.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
		
	
		
		

	}

}
