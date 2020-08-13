import java.util.Scanner;

public class LongString {

    public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	
	for(int i=0; i<=n; i++){
	    String s=sc.nextLine();
	    if(s.length()<=10){
		System.out.println(s);
	    }
	    else{
		char first=s.charAt(0);
		char last=s.charAt(s.length()-1);
		System.out.println(first +""+ (s.length()-2) +""+ last);
	    }
	}
    }
}
