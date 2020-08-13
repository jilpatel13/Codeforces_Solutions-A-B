import java.util.Scanner;

public class VanyaandFence {

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int h = s.nextInt();
	int c=0;
	int a[] = new int[n];
	for(int i=0; i<n; i++){
	    a[i]=s.nextInt();
	    if(a[i]<=h){
		c++;
	    }else{
		c+=2;
	    }
	}
	System.out.print(c);
    }
}
