
public class Ex {
	static int sum(int max) {
		int sum = 0;
		for (int i = 1; i <= max; i++) {
			sum += i;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		// 1부터 10까지의 합
		int result = sum(10);
		System.out.println(sum(10));
		// ---------
		// -------
		// 1부터 15까지의 합
		System.out.println(sum(15));
		
	}
	
	
	
	

}
