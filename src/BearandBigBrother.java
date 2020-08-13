import java.util.Scanner;

public class BearandBigBrother {

    public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b = s.nextInt();
	int count = 0;
	boolean big = true;
	while(big){
	    if(a<=b){
		a=a*3;
		b=b*2;
		count++;
	    }else{
		big = false;
		break;
	    }
	}
	System.out.print(count);
    }
}
