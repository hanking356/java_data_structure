package practice;

import java.util.Scanner;

public class Q16 {
	static void spira(int n) {
		
		for (int i = 1; i <= n; i++) {//i�� n���� 1���� ũ�ų� ���������� 1�� �����ϸ鼭 ����
			for (int j = 0; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i-1)*2 + 1; j++) {//��� (i-1)*2 + 1�� ���
				System.out.print("*");				
			}System.out.println();				
		}
	}
	public static void main(String[] args) {
		Q16.spira(4);
	}
}
