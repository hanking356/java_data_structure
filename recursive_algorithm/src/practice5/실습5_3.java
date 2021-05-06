package practice5;

import java.util.Scanner;

public class 실습5_3 {
	//재귀함수
	static void recur(int n) {
		if (n > 0) {
			//n-1을 인풋으로 하는 recur메서드 호출
			recur(n -1);
			System.out.println(n);
			//n-2를 인풋으로 하는 recur메서드 호출
			recur(n -2);
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요:");
		int x = stdIn.nextInt();
		
		recur(x);

	}

}
