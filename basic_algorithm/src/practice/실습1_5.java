package practice;

import java.util.Scanner;

public class �ǽ�1_5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�");
		int n;
		
		do {
			System.out.println("n�� ��:");
			n = stdIn.nextInt();
		} while (n<=0);
		
		
		int i;
		int sum = 0;
		
		for (i = 0; i <= n; i++) {
			sum += i;
		}System.out.println("1���� " + n + "������ ����" + sum + "�Դϴ�.");
		System.out.println("for�� ���� i����:" + i);
	}

}
