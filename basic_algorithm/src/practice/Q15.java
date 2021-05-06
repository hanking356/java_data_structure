package practice;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");		
		do {
			System.out.println("몇 단 삼각형입니까?");
			n = stdIn.nextInt();
		} while (n<=0);		
		
		for (int i = n; i >=1; i--) {//i가 n부터 1보다 크거나 같을때까지 1씩 감소하면서 실행
			System.out.print(" ");
			for (int j = 1; j <= i; j++) {
				
				System.out.print('*');
			}
			
			System.out.println();
		}
	}

}
