package practice;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("a�� ��:");
		int a = stdIn.nextInt();
		int b;
		do {
			System.out.println("b�� ��:");
			b = stdIn.nextInt();
		} while (a >= b);//a�� b���� ũ�� �ٽ� ����
		int value = b - a; 
		System.out.println("b-a��" + value + "�Դϴ�.");
	}

}
