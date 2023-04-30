import java.util.Scanner;

public class NumberDivisor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int num = 1;
		int count = 0;
		while(num<=number) {
			if(number%num==0) {
				count++;
				System.out.print(num+" ");
			}
			num = num + 1;
		}
		System.out.println("\nNumber of Divisors of "+number+" is "+count);
	}

}
