import java.util.Iterator;

public class Ex01 {

	public static void main(String[] args) {
//		for (int i = 0; i < 4; i++) {
//			System.out.print("*");			
//		}
		// format
		// 205�� 201ȣ�� �������� 13000�� �Դϴ�.
		// 505�� 501ȣ�� �������� 16000�� �Դϴ�.
//		int dong = 205, ho = 201, pay = 13000;
//		System.out.printf("%d�� %dȣ�� �������� %d�� �Դϴ�.\n"
//				,dong,ho,pay);
//		
//		System.out.printf("%d�� %dȣ�� �������� %d�� �Դϴ�.\n"
//				,dong,ho,pay);
//		
//		System.out.println(dong+"�� "+ho+"ȣ�� �������� "
//		+pay+"�� �Դϴ�.");
		
//		for (int i = 0; i < 4; i++) {
//			for (int ii = 0; ii < 4; ii++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//*      0
//**     1 
//***    2
//****   3
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}	
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4-i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}		
		
	}

}
