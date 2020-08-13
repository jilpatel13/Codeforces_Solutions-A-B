import java.util.Scanner;

public class Bitland {
    
    public static void main(String args[]){
	
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int X=0;

	for(int i=0; i<n; i++){	
	    String str = s.next();
	    if(str.contains("+")){
		X++;
	    }
	    else{
		X--;
	    }
	}
	System.out.print(X);
    }
}
