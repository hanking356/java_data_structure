package practice3;

import java.util.Scanner;

public class 연습문제5 {

	//요솟수가 n인 배열 a에서 key와 같은 요소를 이진 검색합니다.
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;
		int pr = n - 1;
	do {
		int pc = (pl + pr) / 2;
		if (a[pc] == key) {
			//중앙값이 key일 경우 중앙값부터 왼쪽으로 한칸씩 이동하면서 key값 확인
			for (int i = 1; i < pc; i++) {				
				if (a[pc -i] != key) {
					//key값이 아니라면 그 한칸 전의 인덱스를 리턴
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
			return -1;// 검색 실패
		}
	} 
	
	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	
	System.out.println("요솟수: ");
	int num = stdIn.nextInt();
	int[] x = new int[num];
	
	System.out.println("오른차순으로 입력하세요.");
	
	System.out.println("x[0]:" );
	x[0] = stdIn.nextInt();
	
	for (int i = 1; i < num; i++) {
		do {
			System.out.println("x[" + i + "]:");
			x[i] = stdIn.nextInt();
		} while (x[i] < x[i - 1]);
	}
	System.out.println("검색할 값:");
	int ky =stdIn.nextInt();
	
	int idx = binSearch(x, num, ky);
	
	if (idx == -1) {
		System.out.println("그 값의 요소가 없습니다.");				
	}else {
		System.out.println(ky + "은 x[" + idx + "]에 있습니다.");
	}
	}

}
