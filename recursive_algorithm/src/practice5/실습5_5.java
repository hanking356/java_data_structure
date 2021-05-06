package practice5;

import java.util.Scanner;

public class 실습5_5 {
	static void recur(int n) {
	IntStack s = new IntStack(n);
	
	while (true) {
		//푸시 또는 팝을 하는 기준
		if (n>0) {
			s.push(n);			
			n = n-1;			
			continue;
			
		}
		//s.isEmpty() == true -> n값 팝
		if (s.isEmpty() != true) {		 
			 //(int) s.pop()
			 n = s.pop();
			 System.out.println(n);
			 n = n - 2;
			 continue;
		}
		break;						
	}
}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요:");
		int x = stdIn.nextInt();
		
		recur(x);
	}
}
