import java.util.Scanner;

public class BeautifulYear {

    public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	int y = s.nextInt();
	while(++y<=9011){
	    if(Integer.toString(y).chars().distinct().count() == 4){
		break;
	    }
	}
	System.out.print(y);
    }
}
