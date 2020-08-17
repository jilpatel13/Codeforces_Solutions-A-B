import java.util.Scanner;

public class UltraFastMathematician {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String a = sc.next();
	String b = sc.next();
	StringBuffer sb = new StringBuffer();
	for(int i=0; i<a.length(); i++){
	    sb.append(a.charAt(i) ^ b.charAt(i));
	}
	System.out.print(sb);
    }

}
