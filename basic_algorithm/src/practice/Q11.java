package practice;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요.");
		int num;
		do {
			num = stdIn.nextInt();
		} while (num<= 0);
		String num1 = Integer.toString(num);//정수를 스트링으로
		System.out.println("그 수는" + num1.length() + "자리입니다.");
		
	}

}
