package practice;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;		
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�.");		
		do {
			System.out.println("�� �� �ﰢ���Դϱ�?");
			n = stdIn.nextInt();
		} while (n<=0);		
		
		for (int i = n; i >=1; i--) {//i�� n���� 1���� ũ�ų� ���������� 1�� �����ϸ鼭 ����
			System.out.print(" ");
			for (int j = 1; j <= i; j++) {
				
				System.out.print('*');
			}
			
			System.out.println();
		}
	}

}
