import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		// 5�� ������ �迭
		// 5 4 3 2 1 �� �ʱ�ȭ  -for
		int[] abc = new int[5];
		int i = 0;
		for ( ; i < abc.length; i++) {
			abc[i] = abc.length-i;
			System.out.println(" i = "+i);
		}
				
		System.out.println(abc[i]); 
		
	}

}
