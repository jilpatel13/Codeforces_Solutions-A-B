import java.util.Scanner;

public class NextRound {
	
    public static void main(String args[]){
		
	Scanner s = new Scanner(System.in); 
	int n=s.nextInt();
	int k=s.nextInt();
	int count=0;
	
	int a[] = new int[n];
	
	for(int i=0; i<n; i++){
	    a[i]=s.nextInt();
	}
	
	int c = a[k-1];
	
	for(int j=0; j<n; j++){
	    if(a[j]>=c && a[j]>0){
		count++;
	    }
	}
	System.out.println(count);
	
    }
}
