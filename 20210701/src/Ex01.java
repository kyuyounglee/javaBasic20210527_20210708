import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 * double �� ��Ҽ��� 5�� �迭�� �����ϰ� ��� ��Ҹ� ǥ���ϴ� ���α׷�
		 * */
		// 1.
		double[] abc = {1.0,2.0,3.0,4.0,5.0};
		for (int i = 0; i < abc.length; i++) {
			System.out.println(abc[i]);
		}
		//  ���� for�� ---> for each
		
		for (double d : abc) {
			System.out.println(d);
		}
		
		

	}

}
