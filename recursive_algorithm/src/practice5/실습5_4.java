package practice5;

import java.util.Scanner;

public class 실습5_4 {
	//재귀함수
	static void recur(int n) {
		while (n > 0) {
			//n = n - 1 로 바꾸면 n값이 없어짐
			recur(n -1);
			System.out.println(n);
			//recur(n-2)
			n = n -2;
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요:");
		int x = stdIn.nextInt();
		
		recur(x);

	}

}
