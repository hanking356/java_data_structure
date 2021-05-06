package practice3;

import java.util.Scanner;

public class 연습문제6 {
	//요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검새합니다.
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;		
		//검색하고자 하는 키를 맨 끝에 저장
		a[n] = key;
		
		//키를 발견할때 까지 for문을 이용
		for (i = 0; i < n; i++) {
			if (a[i] == key) {
			return i;
			}			
		}return -1;
		
		
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("요솟수:");
		//요솟수 입력
		int num = stdIn.nextInt();
		//num개의 배열을 가지 x 생성
		int[] x = new int[num + 1];
		
		//배열 공간에 값을 입력
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "]:");
			x[i] = stdIn.nextInt();
		}
		
		System.out.println("검색할 값:");
		//찾고자 하는 key값 입력
		int ky = stdIn.nextInt();	
		//각 인풋값을 seqSearch 메서드에 입력 
		int idx = seqSearch(x, num, ky);
		
		if (idx == -1)
			System.out.println(" 그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은  x[" + idx + "]에 있습니다.");
	}

}
