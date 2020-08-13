import java.util.Scanner;

public class PetyaandStrings {

    public static void main(String args[]){
	
	Scanner s = new Scanner(System.in);
	String s1 = s.next();
	String s2 = s.next();
	
	int r = s1.compareToIgnoreCase(s2);
	if(r<0){
		System.out.println(-1);
	}else if(r>0){
		System.out.println(1);
	}else{
	    	System.out.println(0);
	}
    }
}
