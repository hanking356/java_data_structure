package practice3;

import java.util.Arrays;
import java.util.Scanner;

public class �ǽ�3_5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("��ڼ�:");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		System.out.println("������������ �Է��ϼ���.");
		
		System.out.println("x[0]:");
		x[0] = stdIn.nextInt();
		
		for (int i = 1; i < num; i++) {
			do {
				System.out.println("x[" + i + "]");
				x[i] = stdIn.nextInt();
			} while (x[i] < x[i-1]);
		}
		System.out.println("�˻��� ��:");
		int ky = stdIn.nextInt();
		
		int idx = Arrays.binarySearch(x, ky);
		
		if (idx<0) {
			int p = 0;
			for (int i = 0; i < x.length; i++) {
				if (x[i] < ky && ky < x[i+1]) {
					 p = i+ 1;
				}
			}System.out.println("���� ����Ʈ��:" + p + "�Դϴ�.");
		}else {
			System.out.println(ky + "�� x[" + idx +"]�� �ֽ��ϴ�.");
		}
		}
	

}
