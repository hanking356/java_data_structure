package practice3;

import java.util.Scanner;

public class ��������4 {
	
	public static void main(String[] args) {
		System.out.print("  ��");//ù ��
		for (int i = 0; i < 7; i++) {			
			System.out.printf("%3d",i);//ù ��
		}		
		System.out.println();
		System.out.println("--+-------------------------");
		
		int[] x = {1, 2, 3, 5, 6, 8, 9};
		int i;
		int pr = 6;	
		int pc;
		
		for (i = 0; i <= 6; i++) {		
			System.out.print("  ��");
			int pl = 0;				
				pc = (pl + pr) / 2;
			
			if (x[pc] < 2) {
					pl = pc + 1;}
			else {
					pr = pc - 1;}
			
			for (int j = 0; j < pl; j++) {
				System.out.print("   ");				
			}//pl��ŭ ������ �� �� <-��� 
			System.out.print("<-");
			
			//<-�Է� ��, pc��ŭ ������ �� �� +��� 
			for (int j = 0; j < pc; j++) {
				System.out.print("   ");				
			}
			System.out.print("+");
			
			//+�Է� ��, pr��ŭ ������ �� �� ->��� 
			for (int j = 0; j < pr; j++) {
				System.out.print("   ");				
			}
			System.out.print("->");	
			
			System.out.println();
			//�߾Ӱ� index
			System.out.print(pc + " ��");
			
			//x�迭 ���
			for (int j = 0; j < x.length; j++) {				
				System.out.printf("%3d", x[j]);
			}System.out.println();
			
			if (x[pc] == 2) {
				break;}

		}			
		System.out.println("2�� x[" + i + "]�� �ֽ��ϴ�.");	
	}
}
