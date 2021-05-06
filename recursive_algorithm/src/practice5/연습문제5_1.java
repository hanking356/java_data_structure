package practice5;

import java.util.Scanner;

public class 연습문제5_1 {

	static int factorial(int n) {
		//곱셈을 위해 1로 초기화
		int a = 1;
		//n: 정수 조건
		if (n>0) {
			//n부터 1씩 감소하면서 곱함
			for (int i = n; i > 0; i--) {
				a = a * i;
			}return a;
		}else {
			return 1;
		}		
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요:");
		int x = stdIn.nextInt();
		
		System.out.println(x + "의 팩토리알은 " + factorial(x) + "입니다.");
	}

}
