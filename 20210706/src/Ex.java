
public class Ex {
	static int sum(int max) {
		int sum = 0;
		for (int i = 1; i <= max; i++) {
			sum += i;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		// 1���� 10������ ��
		int result = sum(10);
		System.out.println(sum(10));
		// ---------
		// -------
		// 1���� 15������ ��
		System.out.println(sum(15));
		
	}
	
	
	
	

}
