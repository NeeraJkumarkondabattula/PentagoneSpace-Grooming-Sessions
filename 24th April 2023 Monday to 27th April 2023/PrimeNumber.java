import java.util.Scanner;

public class PrimeNumber {
	
	public int primeNumber(int number) {
		int num = number;
		int count = 0;
		int primeCount = 0;
		while(num>0) {
			if(number%num==0) {
				count++;
			}
			num = num-1;
		}
		if(count>2) {
			primeCount++;
//			System.out.println("Not a Prime Number");
		}else {
//			System.out.println("Prime Number");
		}
		return primeCount;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrimeNumber obj = new PrimeNumber();
		int count = 0;
		int num = sc.nextInt();
		for(int i=2;i<=num;i++) {
			int number = i;
//			System.out.print(i+" ");
			int result = obj.primeNumber(number);
			if(result == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
