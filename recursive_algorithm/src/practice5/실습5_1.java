package practice5;

import java.util.Scanner;

public class �ǽ�5_1 {
	
	static int factorial(int n) {
		//n: ���� ����
		if (n>0) {
			//n * factorial(n -1) = n * (n-1) * factoral(n -2) ....
			//n*(n-1) * (n-2) *(n-3) * .... * 1 * factoral(0)
			return n * factorial(n-1);
		}else {
			return 1;
		}		
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���:");
		int x = stdIn.nextInt();
		
		System.out.println(x + "�� ���丮���� " + factorial(x) + "�Դϴ�.");
	}

}
