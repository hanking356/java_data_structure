package practice5;

import java.util.Scanner;

public class ��������5_3 {
	//���� x,y�� �ִ� ������� ���Ͽ� ��ȯ�մϴ�.
		static int gcd(int[] a) {
		int[] b = new int[a.length];
		int i;
		for (i = 0; i < a.length - 1; i++) {
			System.out.println(a[i]);
			System.out.println(a[i + 1]);
			while(a[i + 1] != 0) {						
				 b[i]  = a[i] % a[i + 1];			
				 a[i] = a[i + 1];				
				 a[i + 1] = b[i];				
			}if (i == a.length -1) {
				a[i] = a[i];
			}
			else{
				a[i + 1] = a[i];
			}													
		}
		return a[i];			
		}
		public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);
			
			System.out.println("�迭 a�� ��� ����� �ִ������� ���մϴ�.");
			System.out.println("��ڼ�:");
			int num = stdIn.nextInt();
			
			 int[] x = new int[num];
			for (int i = 0; i < x.length; i++) {
				System.out.println("x["+i+"] = ");
				x[i] = stdIn.nextInt();
			}		
			System.out.println("�ִ� ������� " + gcd(x) + "�Դϴ�.");			
		}
	}