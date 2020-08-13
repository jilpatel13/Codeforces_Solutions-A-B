import java.util.Scanner;

public class Drinks {

    public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int d = 100*n;
	int sum = 0;
	int o;
	for(int i=0; i<n; i++){
	    o=sc.nextInt();
	    sum += o;
	}
	
	System.out.print((((double)sum) / d)*100);
    }
}
