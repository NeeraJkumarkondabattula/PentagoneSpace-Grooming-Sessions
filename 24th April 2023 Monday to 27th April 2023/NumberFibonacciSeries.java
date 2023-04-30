import java.util.Scanner;

public class NumberFibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int a=0;
		int b=1;
		int c=1;
		while(number>0) {
			System.out.print(a+" ");
			a=b;
			b=c;
			c=a+b;
			number = number - 1;
		}

	}

}
