package practice5;

import java.util.Scanner;

public class �ǽ�5_4 {
	//����Լ�
	static void recur(int n) {
		while (n > 0) {
			//n = n - 1 �� �ٲٸ� n���� ������
			recur(n -1);
			System.out.println(n);
			//recur(n-2)
			n = n -2;
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���:");
		int x = stdIn.nextInt();
		
		recur(x);

	}

}
