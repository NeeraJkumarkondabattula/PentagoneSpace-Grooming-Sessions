import java.util.Scanner;

public class ReverseNumber {
	
	public void ReverseNum() {
		try(Scanner sc = new Scanner(System.in)){
		int number = sc.nextInt();
		int rev = 0;
		while(number>0) {
			int last = number%10;
			rev = (rev*10 + last);
			number = number/10;
		}
		System.out.println(rev);
		}
		
	}
	
	public void ReverseStr() {
		try(Scanner sc = new Scanner(System.in)){
			String number = sc.nextLine();
			String rev = "";
			for(int i=0;i<number.length();i++) {
				rev = number.charAt(i) + rev;
			}
			System.out.println(rev);
		}
	}

	public static void main(String[] args) {
		ReverseNumber obj = new ReverseNumber();
//		obj.ReverseNum();
		obj.ReverseStr();
	}

}
