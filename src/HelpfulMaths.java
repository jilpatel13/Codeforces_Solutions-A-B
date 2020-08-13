import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {

    public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	String[] s1 = s.split("\\+");
	Arrays.sort(s1);
	System.out.println((String.join("+", s1)));
    }
}
