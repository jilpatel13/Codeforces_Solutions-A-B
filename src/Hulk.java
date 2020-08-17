import java.util.Scanner;

public class Hulk {

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	String a[] = new String[]{"I love it ", "I hate it "};
	String b[] = new String[]{"I love that ", "I hate that "};
	StringBuilder sb = new StringBuilder();
	for(int i=1; i<=n; i++){
	    if(i==n){
		sb.append(a[i%2]);
	    }else{
		sb.append(b[i%2]);
	    }
	}
	System.out.print(sb);
    }

}
