package practice;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("사각형을 출력합니다.");
		
		do {
			System.out.println("단 수:");
			n = stdIn.nextInt();
		} while (n<=0);
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print('*');
			}System.out.println();
		}

	}

}
