import java.util.Scanner;

public class Word {

    public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	String s1 = s.next();
	int u=0;
	int l=0;
	for(int i=0; i<s1.length(); i++){
	    if(Character.isUpperCase(s1.charAt(i))){
		u++;
	    }else{
		l++;
	    }
	}
	if(u>l){
	    System.out.println(s1.toUpperCase());
	}else{
	    System.out.println(s1.toLowerCase());
	}
    }
}
