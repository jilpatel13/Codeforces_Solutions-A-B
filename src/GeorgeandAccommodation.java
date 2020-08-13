import java.util.Scanner;

public class GeorgeandAccommodation {

    public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int c=0;
	int n = sc.nextInt();
	int a[][] = new int[n][2];
	for(int i=0; i<n; i++){
	    for(int j=0; j<2; j++){
		a[i][j] = sc.nextInt();
	    }
	}
	for(int k=0; k<n; k++){
	    if(a[k][1]-a[k][0]>=2){
		c++;
	    }
	}
	System.out.print(c);
    }
}
