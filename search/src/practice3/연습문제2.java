package practice3;


public class ��������2 {
		public static void main(String[] args) {
			//ù�� �Է�
			System.out.print("  ��");
			for (int i = 0; i < 7; i++) {			
				System.out.printf("%3d",i);
			}
			System.out.println();
			System.out.println("--+-------------------------");
			//for�� �ۿ��� i�� �̿��ϱ� ���� for�� �ۿ� ���� ����
			int i;
			int[] x = {6, 4, 3, 2, 1, 9, 8};
			for (i = 0; i <= 6; i++) {		
				System.out.print("  ��");
				for (int j = 0; j < i+1; j++) {
					System.out.print("  ");				
				}		
				System.out.println("*");	
				System.out.print(i+ " ��");	 				
				for (int j = 0; j < x.length; j++) {
					System.out.printf("%3d", x[j]);
				}						
				System.out.println();
				//key���� �߰��ϸ� break
				if (x[i] == 3) {
					break;
				}		
				}System.out.println("3�� x[" + i + "]�� �ֽ��ϴ�.");
		}
}
