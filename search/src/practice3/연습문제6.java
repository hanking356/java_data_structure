package practice3;

import java.util.Scanner;

public class ��������6 {
	//��ڼ��� n�� �迭 a���� key�� ���� ��Ҹ� ���� �˻��մϴ�.
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;		
		//�˻��ϰ��� �ϴ� Ű�� �� ���� ����
		a[n] = key;
		
		//Ű�� �߰��Ҷ� ���� for���� �̿�
		for (i = 0; i < n; i++) {
			if (a[i] == key) {
			return i;
			}			
		}return -1;
		
		
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("��ڼ�:");
		//��ڼ� �Է�
		int num = stdIn.nextInt();
		//num���� �迭�� ���� x ����
		int[] x = new int[num + 1];
		
		//�迭 ������ ���� �Է�
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "]:");
			x[i] = stdIn.nextInt();
		}
		
		System.out.println("�˻��� ��:");
		//ã���� �ϴ� key�� �Է�
		int ky = stdIn.nextInt();	
		//�� ��ǲ���� seqSearch �޼��忡 �Է� 
		int idx = seqSearch(x, num, ky);
		
		if (idx == -1)
			System.out.println(" �� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky + "��  x[" + idx + "]�� �ֽ��ϴ�.");
	}

}
