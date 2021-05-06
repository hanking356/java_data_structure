package practice;

import java.util.Scanner;

public class 실습1_4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값:");
		int n = stdIn.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while (i <= n) {
			sum += i;
			i++;
		}
		
//		int sum = 0;
//		for (int i = 0; i <= n ; i++) {
//			sum1 += i;
	
//		}
		
		
		
		System.out.println("1부터" + n + "까지의 합은" + sum + "입니다.");
		System.out.println(i);
	}

}
