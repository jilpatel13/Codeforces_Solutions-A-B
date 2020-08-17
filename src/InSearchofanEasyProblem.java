import java.util.Scanner;

public class InSearchofanEasyProblem {

    public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int a[] = new int[n];
	int c=0;
	for(int i=0; i<n; i++){
	    a[i]=s.nextInt();
	    if(a[i]==1){
		c++;
	    }
	}
	if(c>=1){
	    System.out.print("HARD");
	}else{
	    System.out.print("EASY");
	}
    }
}
