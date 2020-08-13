import java.util.Arrays;
import java.util.Scanner;

public class QueueattheSchool {

    public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int t = s.nextInt();
	String s1 = s.next();
	while(t-->0){
	    s1=s1.replaceAll("BG", "GB");
	}
	System.out.print(s1);
    }
}
