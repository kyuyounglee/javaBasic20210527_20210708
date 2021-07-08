import java.util.Iterator;

public class Ex01 {

	public static void main(String[] args) {
//		for (int i = 0; i < 4; i++) {
//			System.out.print("*");			
//		}
		// format
		// 205동 201호의 수도세는 13000원 입니다.
		// 505동 501호의 수도세는 16000원 입니다.
//		int dong = 205, ho = 201, pay = 13000;
//		System.out.printf("%d동 %d호의 수도세는 %d원 입니다.\n"
//				,dong,ho,pay);
//		
//		System.out.printf("%d동 %d호의 수도세는 %d원 입니다.\n"
//				,dong,ho,pay);
//		
//		System.out.println(dong+"동 "+ho+"호의 수도세는 "
//		+pay+"원 입니다.");
		
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
