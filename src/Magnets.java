import java.util.Arrays;
import java.util.Scanner;

public class Magnets {

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int a[] = new int[n+1];
	int c=0;
	for(int i=0; i<n; i++){
	    a[i] = s.nextInt();
	}
	for(int i=0; i<n; i++){
	    if(a[i]!=a[i+1]){
		c++;
	    }
	}
	System.out.print(c);
    }

}
