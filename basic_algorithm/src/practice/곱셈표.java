package practice;

public class ����ǥ {

	public static void main(String[] args) {
		System.out.print("  |");//ù ��
		for (int i = 1; i < 10; i++) {			
			System.out.printf("%3d",i);//ù ��
		}
		System.out.println();
		System.out.println("--+-------------------------");
		for (int j = 1; j <= 9; j++) {
			System.out.print(j+ " |");
			for (int k = 1; k <= 9; k++) {
				//i�� 1���� 9�� ������ ���� j�� 1���� 9���� ���� 				
				System.out.printf("%3d", j + k);//i * j�� ���ڸ��� ���				
			}
			System.out.println();
		}
	}

}
