import java.util.Scanner;

public class Pangram {

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String str = s.next();
	boolean[] mark = new boolean[26];

        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
                index = str.charAt(i) - 'A';
            else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')
                index = str.charAt(i) - 'a';
            mark[index] = true;
        }
        for (int i = 0; i <= 25; i++)
            if (!mark[i])
                System.out.print("NO");
        System.out.print("YES");
    }

}
