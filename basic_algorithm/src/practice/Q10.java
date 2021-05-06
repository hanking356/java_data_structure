package practice;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("a의 값:");
		int a = stdIn.nextInt();
		int b;
		do {
			System.out.println("b의 값:");
			b = stdIn.nextInt();
		} while (a >= b);//a가 b보다 크면 다시 실행
		int value = b - a; 
		System.out.println("b-a는" + value + "입니다.");
	}

}
