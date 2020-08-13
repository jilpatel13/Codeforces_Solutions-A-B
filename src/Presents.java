import java.util.Scanner;

public class Presents {

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int a[] = new int[n+1];
	for(int i=1; i<n+1; i++){
            a[s.nextInt()-1]=i;
	}
	for(int i=0; i<n; i++){
	    System.out.print(a[i] + " ");
	}
	
    }

}
