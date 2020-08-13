import java.util.Scanner;

public class AntonandDanik {

    public static void main(String args[]){
	int d=0;
	int a=0;
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	String s1 = s.next();
	for(int i=0; i<s1.length(); i++){
	    if(s1.charAt(i) == 'A'){
		a++;
	    }
	    else{
		d++;
	    }
	}
	if(a>d){
	    System.out.print("Anton");
	}
	else if(a<d){
	    System.out.print("Danik");
	}
	else{
	    System.out.print("Friendship");
	}
    }
}
