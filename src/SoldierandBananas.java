import java.util.Scanner;

public class SoldierandBananas {

    public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	int k = s.nextInt();
	int n = s.nextInt();
	int w = s.nextInt();
	int r = (k*(w*(w+1)))/2;
	if(r>n){
	    System.out.println(r-n);
	}else{
	    System.out.println(0);
	}
    }
}
