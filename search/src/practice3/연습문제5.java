package practice3;

import java.util.Scanner;

public class ��������5 {

	//��ڼ��� n�� �迭 a���� key�� ���� ��Ҹ� ���� �˻��մϴ�.
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;
		int pr = n - 1;
	do {
		int pc = (pl + pr) / 2;
		if (a[pc] == key) {
			//�߾Ӱ��� key�� ��� �߾Ӱ����� �������� ��ĭ�� �̵��ϸ鼭 key�� Ȯ��
			for (int i = 1; i < pc; i++) {				
				if (a[pc -i] != key) {
					//key���� �ƴ϶�� �� ��ĭ ���� �ε����� ����
					return (pc - i + 1);
				}else {
					continue;
				}
				}
			}
		else if (a[pc] < key) {
				pl = pc + 1;}
				else {
					pr = pc - 1;}
		}while (pl <= pr);{
			return -1;// �˻� ����
		}
	} 
	
	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	
	System.out.println("��ڼ�: ");
	int num = stdIn.nextInt();
	int[] x = new int[num];
	
	System.out.println("������������ �Է��ϼ���.");
	
	System.out.println("x[0]:" );
	x[0] = stdIn.nextInt();
	
	for (int i = 1; i < num; i++) {
		do {
			System.out.println("x[" + i + "]:");
			x[i] = stdIn.nextInt();
		} while (x[i] < x[i - 1]);
	}
	System.out.println("�˻��� ��:");
	int ky =stdIn.nextInt();
	
	int idx = binSearch(x, num, ky);
	
	if (idx == -1) {
		System.out.println("�� ���� ��Ұ� �����ϴ�.");				
	}else {
		System.out.println(ky + "�� x[" + idx + "]�� �ֽ��ϴ�.");
	}
	}

}
