package practice;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���.");
		int num;
		do {
			num = stdIn.nextInt();
		} while (num<= 0);
		String num1 = Integer.toString(num);//������ ��Ʈ������
		System.out.println("�� ����" + num1.length() + "�ڸ��Դϴ�.");
		
	}

}
