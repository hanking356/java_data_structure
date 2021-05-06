package practice3;


public class 연습문제2 {
		public static void main(String[] args) {
			//첫줄 입력
			System.out.print("  ㅣ");
			for (int i = 0; i < 7; i++) {			
				System.out.printf("%3d",i);
			}
			System.out.println();
			System.out.println("--+-------------------------");
			//for문 밖에서 i를 이용하기 위해 for문 밖에 변수 선언
			int i;
			int[] x = {6, 4, 3, 2, 1, 9, 8};
			for (i = 0; i <= 6; i++) {		
				System.out.print("  ㅣ");
				for (int j = 0; j < i+1; j++) {
					System.out.print("  ");				
				}		
				System.out.println("*");	
				System.out.print(i+ " ㅣ");	 				
				for (int j = 0; j < x.length; j++) {
					System.out.printf("%3d", x[j]);
				}						
				System.out.println();
				//key값을 발견하면 break
				if (x[i] == 3) {
					break;
				}		
				}System.out.println("3은 x[" + i + "]에 있습니다.");
		}
}
