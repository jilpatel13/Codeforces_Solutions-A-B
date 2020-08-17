import java.util.HashSet;
import java.util.Scanner;

public class AntonandLetters {
    public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	String s1 = s.nextLine();
	HashSet<Character> l = new HashSet<>();
	for(int i=1; i<s1.length()-1; i=i+3){
	    l.add(s1.charAt(i));
	}
	System.out.print(l.size());
    }
}
