package practice5;

import java.util.Scanner;

public class 연습문제5_2 {
	//정수 x,y의 최대 공약수를 구하여 반환합니다.
		static int gcd(int x, int y) {
			while (y != 0) {				
				 int a  = x % y;
				 x = y;
				 y = a;
			}return x;		
		}
		public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);
			
			System.out.println("두 정수의 최대공약수를 구합니다.");
			
			System.out.println("정수를 입력하세요:"); int x = stdIn.nextInt();
			System.out.println("정수를 입력하세요:"); int y = stdIn.nextInt();
			
			System.out.println("최대 공약수는 " + gcd(x, y) + "입니다.");
			
		}

	}