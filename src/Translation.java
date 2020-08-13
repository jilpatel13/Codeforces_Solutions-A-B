import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Translation {

    public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	ArrayList<Character> a = new ArrayList<Character>();
	ArrayList<Character> b = new ArrayList<Character>();
	String s = sc.nextLine();
	String t = sc.nextLine();
	for(int i=0; i<t.length(); i++){
	    a.add(t.charAt(i));
	}
	Collections.reverse(a);
	for(int i=0; i<s.length(); i++){
	    b.add(s.charAt(i));
	}
	if(a.equals(b)){
	    System.out.print("YES");
	}else{
	    System.out.print("NO");
	}
	
    }
}
