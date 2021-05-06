package practice3;

import java.util.Scanner;

public class 연습문제4 {
	
	public static void main(String[] args) {
		System.out.print("  ㅣ");//첫 줄
		for (int i = 0; i < 7; i++) {			
			System.out.printf("%3d",i);//첫 줄
		}		
		System.out.println();
		System.out.println("--+-------------------------");
		
		int[] x = {1, 2, 3, 5, 6, 8, 9};
		int i;
		int pr = 6;	
		int pc;
		
		for (i = 0; i <= 6; i++) {		
			System.out.print("  ㅣ");
			int pl = 0;				
				pc = (pl + pr) / 2;
			
			if (x[pc] < 2) {
					pl = pc + 1;}
			else {
					pr = pc - 1;}
			
			for (int j = 0; j < pl; j++) {
				System.out.print("   ");				
			}//pl만큼 공백을 준 후 <-출력 
			System.out.print("<-");
			
			//<-입력 후, pc만큼 공백을 준 후 +출력 
			for (int j = 0; j < pc; j++) {
				System.out.print("   ");				
			}
			System.out.print("+");
			
			//+입력 후, pr만큼 공백을 준 후 ->출력 
			for (int j = 0; j < pr; j++) {
				System.out.print("   ");				
			}
			System.out.print("->");	
			
			System.out.println();
			//중앙값 index
			System.out.print(pc + " ㅣ");
			
			//x배열 출력
			for (int j = 0; j < x.length; j++) {				
				System.out.printf("%3d", x[j]);
			}System.out.println();
			
			if (x[pc] == 2) {
				break;}

		}			
		System.out.println("2는 x[" + i + "]에 있습니다.");	
	}
}
