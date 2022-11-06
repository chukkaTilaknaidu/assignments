package in.ineuron.main;
import java.util.*;

public class Subset {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int z=0;
		int []a=new int[8];
		for(int i=0;i<a.length;i++) {
			System.out.print("ENTER THE first Array");
			a[i]=scan.nextInt();
		}
		System.out.println("----------------------------------------------");
		
		Scanner c=new Scanner(System.in);
		int []d=new int[8];
		for(int i=0;i<d.length;i++) {
			System.out.println("ENTER THE second Array");
			d[i]=c.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<d.length;j++) {
				if(a[i]==d[j]) {
					z=z+1;
					
				}
				
			}
			
			
		}
		if(z==d.length) {
			System.out.print("d iS a subset of a");
			
			
		}
		else {
			System.out.print("d is not a subset of a");
		}
	

	}

}
