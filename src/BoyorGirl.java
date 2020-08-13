import java.util.Scanner;
import java.util.stream.IntStream;

public class BoyorGirl {

    public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	int n = (int) (s.chars().distinct().count());
	if(n % 2 != 0){
		System.out.print("IGNORE HIM!");
	}else{
		System.out.print("CHAT WITH HER!");
	}
    }
}
