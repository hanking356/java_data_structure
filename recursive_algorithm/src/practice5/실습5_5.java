package practice5;

import java.util.Scanner;

public class �ǽ�5_5 {
	static void recur(int n) {
	IntStack s = new IntStack(n);
	
	while (true) {
		//Ǫ�� �Ǵ� ���� �ϴ� ����
		if (n>0) {
			s.push(n);			
			n = n-1;			
			continue;
			
		}
		//s.isEmpty() == true -> n�� ��
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
		
		System.out.println("������ �Է��ϼ���:");
		int x = stdIn.nextInt();
		
		recur(x);
	}
}
