package practice;

import java.util.Scanner;

public class �ǽ�1_4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.println("n�� ��:");
		int n = stdIn.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while (i <= n) {
			sum += i;
			i++;
		}
		
//		int sum = 0;
//		for (int i = 0; i <= n ; i++) {
//			sum1 += i;
	
//		}
		
		
		
		System.out.println("1����" + n + "������ ����" + sum + "�Դϴ�.");
		System.out.println(i);
	}

}
