import java.util.Scanner;

public class Dominopiling {

    public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	int M = s.nextInt();
	int N = s.nextInt();
	int ans = M*N;
	int n = (ans/2);
	System.out.println(n);
    }
}
