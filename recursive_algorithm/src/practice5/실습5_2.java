package practice5;

import java.util.Scanner;

public class �ǽ�5_2 {
	//���� x,y�� �ִ� ������� ���Ͽ� ��ȯ�մϴ�.
	static int gcd(int x, int y) {
		if (y == 0) {
			return x;
		}else {
			return gcd(y, x % y);
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ������� ���մϴ�.");
		
		System.out.println("������ �Է��ϼ���:"); int x = stdIn.nextInt();
		System.out.println("������ �Է��ϼ���:"); int y = stdIn.nextInt();
		
		System.out.println("�ִ� ������� " + gcd(x, y) + "�Դϴ�.");		
	}

}
