import java.util.Arrays;
import java.util.Scanner;

public class Tram {

    public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a,b,s=0;
	int c=0;
	for(int i=0; i<n; i++){
	    a=sc.nextInt();
	    b=sc.nextInt();
	    c=c+(b-a);
	    if(c>s){
		s=c;
	    }
	}
	System.out.println(s);
    }
}
