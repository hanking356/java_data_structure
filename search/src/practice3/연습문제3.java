package practice3;

import java.util.ArrayList;
import java.util.Scanner;

public class ��������3 {
	static int search(int[] a, int n, int key, int[] idx) {
		//���ο� �迭�� ����� ���ϱ� ���� ���� ����
		int number = 0;
      
		for (int i = 0; i < n; i++) {
			if (a[i] == key) {	
				//key���� �ִ� index�� idx ���ʴ�� ����
				idx[number] = i;
				number ++;
			}
		}
		
		//ũ�Ⱑ number�� ���ο� �迭 ����� 
	    int[] idx2 = new int[number];
	    for (int j = 0; j < idx2.length; j++) {
	    	//idx�� key�� index�� ���ʴ�� ����
	    	idx2[j] = idx[j];
		}	    
	    //idx2�� ������
		return idx2.length;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("��ڼ�:");
		int num = stdIn.nextInt();		
		int[] x = new int[num];
		//�ߺ������� �ִ� num�� 
		int[] idx = new int[num];
		
		//x�迭�� i�� ����
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "]:");
			x[i] = stdIn.nextInt();
		}
		
		System.out.println("�˻��� ��:");
		int ky = stdIn.nextInt();		
		System.out.print("��ġ�� ��ڼ���" + search(x, num, ky, idx) + "�� �Դϴ�."); 				
	}

}
