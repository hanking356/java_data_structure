package practice;

public class 곱셈표 {

	public static void main(String[] args) {
		System.out.print("  |");//첫 줄
		for (int i = 1; i < 10; i++) {			
			System.out.printf("%3d",i);//첫 줄
		}
		System.out.println();
		System.out.println("--+-------------------------");
		for (int j = 1; j <= 9; j++) {
			System.out.print(j+ " |");
			for (int k = 1; k <= 9; k++) {
				//i가 1부터 9일 때까지 각각 j를 1부터 9까지 곱함 				
				System.out.printf("%3d", j + k);//i * j를 세자리로 출력				
			}
			System.out.println();
		}
	}

}
