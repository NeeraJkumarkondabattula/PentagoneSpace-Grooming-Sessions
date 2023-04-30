import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int num = 1;
		int sum = 0;
		while(num<number) {
			if(number%num==0) {
				sum = sum + num;
			}
			num = num + 1;
		}
		if(sum==number) {
			System.out.println("Perfect Number");
		}else {
			System.out.println("Not a Perfect Number");
		}
	}

}
