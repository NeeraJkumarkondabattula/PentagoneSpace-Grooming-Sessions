import java.util.Scanner;

public class NumberFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int fact = 1;
		while(number>0) {
			fact = fact * number;
			number = number-1;
		}
		System.out.println(fact);
	}

}
