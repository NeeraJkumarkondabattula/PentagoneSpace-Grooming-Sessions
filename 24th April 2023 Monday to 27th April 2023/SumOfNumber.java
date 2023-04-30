import java.util.Scanner;

public class SumOfNumber {
	
	public void SumString() {
		try(Scanner sc = new Scanner(System.in)){
		String number = sc.nextLine();
		int sum=0;
		for(int i=0;i<number.length();i++) {
			sum = sum + number.charAt(i)-48;
		}
		System.out.println(sum);
		}
	}
	
	public void SumNumber() {
		try(Scanner sc = new Scanner(System.in)){
		long sum=0;
		long number = sc.nextLong();
		while(number>0) {
			long num = number%10;
			sum = sum + num;
			number = number/10;
		}
		System.out.println(sum);
		}
	}
	public static void main(String[] args) {
		SumOfNumber obj = new SumOfNumber();
//		obj.SumString();
		obj.SumNumber();
	}
}
