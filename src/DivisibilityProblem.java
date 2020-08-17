import java.util.Arrays;
import java.util.Scanner;

public class DivisibilityProblem {

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n=s.nextInt();
	int ans[]=new int[n];
	for(int i=0; i<n; i++){
	int a=s.nextInt();
	int b=s.nextInt();
	int c=0;
	while(a%b!=0){
	    a++;
	    c++;
	}
	ans[i]=c;
	}
	for(int i=0;i<n;i++){
	    System.out.println(ans[i]);
	}
    }

}
