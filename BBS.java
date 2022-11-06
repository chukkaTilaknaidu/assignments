package in.ineuron.main;

public class BBS {

	public static void main(String[] args) {
		int a[]= {4,5,3,7,9,2,1};
        for(int i=0;i<a.length;i++) {
        	for (int j=1;j<a.length-i;j++) {
        		if(a[j]<a[j-1]) {
        			int z=a[j];
        			a[j]=a[j-1];
        			a[j-1]=z;
        			
        		}
        		
        		

        	}
        }
        for(int x:a) {
        	System.out.print(x+" ");
        }
        
	}

}
