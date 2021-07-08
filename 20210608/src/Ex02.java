
public class Ex02 {

	public static void main(String[] args) {
		int a = 100;
		// 변수 a의 값은 100 입니다.
//		System.out.println("변수 a의 값은 "+a+" 입니다.");
		System.out.printf("변수 a의 값은 %d 입니다.\n",a);
		
		// 구구단 2단을 만들어본다				
		for (int i = 9; i > 0; i--) {
			System.out.printf("2 x %d = %d\n",i, 2*i);
		}
		System.out.println();
		for (int i = 4; i >= 0; i--) {
			System.out.printf("%d : 빙글빙글\n",i);
		}
		
	}

}
