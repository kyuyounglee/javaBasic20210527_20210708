import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 * double 형 요소수가 5인 배열을 생성하고 모든 요소를 표시하는 프로그램
		 * */
		// 1.
		double[] abc = {1.0,2.0,3.0,4.0,5.0};
		for (int i = 0; i < abc.length; i++) {
			System.out.println(abc[i]);
		}
		//  향상된 for문 ---> for each
		
		for (double d : abc) {
			System.out.println(d);
		}
		
		

	}

}
