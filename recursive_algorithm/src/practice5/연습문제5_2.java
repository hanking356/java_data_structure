package practice5;

import java.util.Scanner;

public class ��������5_2 {
	//���� x,y�� �ִ� ������� ���Ͽ� ��ȯ�մϴ�.
		static int gcd(int x, int y) {
			while (y != 0) {				
				 int a  = x % y;
				 x = y;
				 y = a;
			}return x;		
		}
		public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);
			
			System.out.println("�� ������ �ִ������� ���մϴ�.");
			
			System.out.println("������ �Է��ϼ���:"); int x = stdIn.nextInt();
			System.out.println("������ �Է��ϼ���:"); int y = stdIn.nextInt();
			
			System.out.println("�ִ� ������� " + gcd(x, y) + "�Դϴ�.");
			
		}

	}