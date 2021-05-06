package practice3;

import java.util.ArrayList;
import java.util.Scanner;

public class 연습문제3 {
	static int search(int[] a, int n, int key, int[] idx) {
		//새로운 배열의 사이즈를 구하기 위해 변수 선언
		int number = 0;
      
		for (int i = 0; i < n; i++) {
			if (a[i] == key) {	
				//key값이 있는 index를 idx 차례대로 저장
				idx[number] = i;
				number ++;
			}
		}
		
		//크기가 number인 새로운 배열 만들기 
	    int[] idx2 = new int[number];
	    for (int j = 0; j < idx2.length; j++) {
	    	//idx에 key값 index를 차례대로 저장
	    	idx2[j] = idx[j];
		}	    
	    //idx2의 사이즈
		return idx2.length;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("요솟수:");
		int num = stdIn.nextInt();		
		int[] x = new int[num];
		//중복갯수는 최대 num개 
		int[] idx = new int[num];
		
		//x배열에 i값 대입
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "]:");
			x[i] = stdIn.nextInt();
		}
		
		System.out.println("검색할 값:");
		int ky = stdIn.nextInt();		
		System.out.print("일치한 요솟수는" + search(x, num, ky, idx) + "개 입니다."); 				
	}

}
