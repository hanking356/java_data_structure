package practice;

import java.util.Scanner;

public class Q17 {
	static void spira(int n) {
		
		for (int i = 1; i <= n; i++) {//i가 n부터 1보다 크거나 같을때까지 1씩 감소하면서 실행
			for (int j = 0; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i-1)*2 + 1; j++) {//행당 (i-1)*2 + 1씩 출력
				System.out.print(i);				
			}System.out.println();				
		}
	}
	public static void main(String[] args) {
		Q17.spira(4);
	}
}
