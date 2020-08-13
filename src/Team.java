import java.util.ArrayList;
import java.util.Scanner;

public class Team {

    public static int a,b,c,d,counter;
    
    public static void main(String args[]){
	
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	
	if(n<1 && n>1000){
	    throw new IllegalArgumentException();
	}
	for(int i=0; i<n; i++){
	 
		 a = s.nextInt();
		 b = s.nextInt();
		 c = s.nextInt(); 
		 
		 if((a+b+c)>1){
		     counter++;
		 }
	}
	System.out.println(counter);
    }
}
