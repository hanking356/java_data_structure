package practice5;

import java.util.Scanner;

public class �ǽ�5_3 {
	//����Լ�
	static void recur(int n) {
		if (n > 0) {
			//n-1�� ��ǲ���� �ϴ� recur�޼��� ȣ��
			recur(n -1);
			System.out.println(n);
			//n-2�� ��ǲ���� �ϴ� recur�޼��� ȣ��
			recur(n -2);
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���:");
		int x = stdIn.nextInt();
		
		recur(x);

	}

}
