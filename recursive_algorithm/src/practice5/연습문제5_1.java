package practice5;

import java.util.Scanner;

public class ��������5_1 {

	static int factorial(int n) {
		//������ ���� 1�� �ʱ�ȭ
		int a = 1;
		//n: ���� ����
		if (n>0) {
			//n���� 1�� �����ϸ鼭 ����
			for (int i = n; i > 0; i--) {
				a = a * i;
			}return a;
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
