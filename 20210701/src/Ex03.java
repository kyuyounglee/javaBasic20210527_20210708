import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		// 5개 정수형 배열
		// 5 4 3 2 1 로 초기화  -for
		int[] abc = new int[5];
		int i = 0;
		for ( ; i < abc.length; i++) {
			abc[i] = abc.length-i;
			System.out.println(" i = "+i);
		}
				
		System.out.println(abc[i]); 
		
	}

}
