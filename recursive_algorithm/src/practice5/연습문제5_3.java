package practice5;

import java.util.Scanner;

public class 연습문제5_3 {
	//정수 x,y의 최대 공약수를 구하여 반환합니다.
		static int gcd(int[] a) {
		int[] b = new int[a.length];
		int i;
		for (i = 0; i < a.length - 1; i++) {
			System.out.println(a[i]);
			System.out.println(a[i + 1]);
			while(a[i + 1] != 0) {						
				 b[i]  = a[i] % a[i + 1];			
				 a[i] = a[i + 1];				
				 a[i + 1] = b[i];				
			}if (i == a.length -1) {
				a[i] = a[i];
			}
			else{
				a[i + 1] = a[i];
			}													
		}
		return a[i];			
		}
		public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);
			
			System.out.println("배열 a의 모든 요소의 최대공약수를 구합니다.");
			System.out.println("요솟수:");
			int num = stdIn.nextInt();
			
			 int[] x = new int[num];
			for (int i = 0; i < x.length; i++) {
				System.out.println("x["+i+"] = ");
				x[i] = stdIn.nextInt();
			}		
			System.out.println("최대 공약수는 " + gcd(x) + "입니다.");			
		}
	}