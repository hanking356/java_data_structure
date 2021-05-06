package practice;

public class Q9 {
	static int sum;
	static int sumof(int a, int b) {			
		sum =(Math.abs(b-a)+1) * (a+b) / 2;
		return sum;
		
	}
	public static void main(String[] args) {
		Q9.sumof(10,5);
		System.out.println("a와 b사이의 모든 정수의 합은:" + sum);
	}

}
