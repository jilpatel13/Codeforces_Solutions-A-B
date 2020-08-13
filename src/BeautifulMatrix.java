import java.util.Arrays;
import java.util.Scanner;

public class BeautifulMatrix {
    public static int a[];
    public static void main(String args[]){
	
	int m[][] = new int[5][5];
	
	Scanner s = new Scanner(System.in);
	
	for(int i=0; i<5; i++){
	    for(int j=0; j<5; j++){
		m[i][j] = s.nextInt();
	    }
	}
	if(m[2][2] == 1){
	    System.out.println(0);
	}else{
	    for(int i=0; i<5; i++){
		    for(int j=0; j<5; j++){
			if(m[i][j] == 1){
			    System.out.println(Math.abs(2-i) + Math.abs(2-j));
			}
		    }
		}
	}
    }
}
