import java.util.Scanner;

public class WordCapitalization {

    public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	String s1 = s.next();
	String s2 = s1.substring(0, 1);
	String s3 = s1.substring(1,s1.length());
	System.out.println(s2.toUpperCase()+s3);
    }
}
