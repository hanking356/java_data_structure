package practice;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 정수합을 구합니다.");
		System.out.println("n의 값:");
		int n = stdIn.nextInt();
		double sum = 0;
		for (int i = 1; i <= n; i++) {
		sum = sum + (double)(1 + n) /2;
	
		}

		System.out.println("1부터 " + n + "까지의 정수 합은" + sum + "입니다.");
	}

}
