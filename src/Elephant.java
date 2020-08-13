import java.util.Scanner;

public class Elephant {

    public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	double x = s.nextInt();
	int d = (int)(Math.ceil((x/5.0)));
	System.out.print(d);
    }
}
