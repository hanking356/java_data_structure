package practice5;

import java.util.Stack;
//기본형이 정수인 stack을 상속
public class IntStack extends Stack<Integer>   {

	int n;	
	//멤버변수 n이 있는 생성자 
	public IntStack(int n) {
		
		this.n = n;
	}
	
}
