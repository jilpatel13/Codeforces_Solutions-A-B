import java.util.Arrays;
import java.util.Scanner;

public class OmkarandPassword {
    public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	int t = s.nextInt();
	int c=0;
	int r = 0;
	for(int i=0; i<t; i++){
	    int n = s.nextInt();
	    int a[] = new int[n+1];
	    for(int j=0; j<n; j++){
		a[j]=s.nextInt();
	    }
	    for(int j=0; j<n; j++){
		if(a[j]!=a[j+1] && 1<=j && j<n){
		    c++;
		}
	    }
	    System.out.print(a.length-c);
	}
	
    }
}
