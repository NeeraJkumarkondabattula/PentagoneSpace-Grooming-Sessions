import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 100;
		int orgNum = number;
		String Count = Integer.toString(number);
		int count = Count.length();
		int sum = 0;
		while(number>0) {
			int num = number%10;
			sum = (int) (sum + Math.pow(num, count));
			number = number/10;		
		}
		if(sum == orgNum) {
			System.out.println("ArmStrong Number");
		}else {
			System.out.println("Not a Armstrong Number");
		}
	}

}
