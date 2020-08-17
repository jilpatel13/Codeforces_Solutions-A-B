import java.util.Scanner;

public class CalculatingFunction {

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	long n = s.nextLong();
	long sum=0;
	if(n%2==0){
	    sum=n/2;
	}else{
	    sum=((-1*(n/2))-1);
	}
	System.out.print(sum);
	
    }

}
