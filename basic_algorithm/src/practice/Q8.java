package practice;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ �������� ���մϴ�.");
		System.out.println("n�� ��:");
		int n = stdIn.nextInt();
		double sum = 0;
		for (int i = 1; i <= n; i++) {
		sum = sum + (double)(1 + n) /2;
	
		}

		System.out.println("1���� " + n + "������ ���� ����" + sum + "�Դϴ�.");
	}

}
