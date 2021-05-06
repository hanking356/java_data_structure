package practice;

import java.util.Scanner;

public class 실습1_5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다");
		int n;
		
		do {
			System.out.println("n의 값:");
			n = stdIn.nextInt();
		} while (n<=0);
		
		
		int i;
		int sum = 0;
		
		for (i = 0; i <= n; i++) {
			sum += i;
		}System.out.println("1부터 " + n + "까지의 합은" + sum + "입니다.");
		System.out.println("for문 후의 i값은:" + i);
	}

}
