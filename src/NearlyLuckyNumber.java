import java.util.Scanner;

public class NearlyLuckyNumber {

    public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	String s1 = s.next();
	int c=0;
	for(int i=0; i<s1.length(); i++){
	    if(s1.charAt(i)=='4' || s1.charAt(i)=='7'){
		c++;
	    }
	}
	if(c==7 || c==4){
	    System.out.print("YES");
	}else{
	    System.out.println("NO");
	}
    }
}
