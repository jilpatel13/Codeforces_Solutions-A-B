import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IWannaBetheGuy {

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int a = s.nextInt();
	Set c = new HashSet<>();
	for(int i=1; i<=a; i++){
	     int x = s.nextInt();
	     c.add(x);
	}
	int b = s.nextInt();
	for(int i=1; i<=b; i++){
	    int x = s.nextInt();
	    c.add(x);
	}
	if(c.size()==n){
	    System.out.print("I become the guy.");
	}else{
	    System.out.print("Oh, my keyboard!");
	}
	
    }

}
