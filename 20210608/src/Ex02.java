
public class Ex02 {

	public static void main(String[] args) {
		int a = 100;
		// ���� a�� ���� 100 �Դϴ�.
//		System.out.println("���� a�� ���� "+a+" �Դϴ�.");
		System.out.printf("���� a�� ���� %d �Դϴ�.\n",a);
		
		// ������ 2���� ������				
		for (int i = 9; i > 0; i--) {
			System.out.printf("2 x %d = %d\n",i, 2*i);
		}
		System.out.println();
		for (int i = 4; i >= 0; i--) {
			System.out.printf("%d : ���ۺ���\n",i);
		}
		
	}

}
