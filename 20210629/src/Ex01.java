import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] abc = new int[5];
		
		for (int i = 0; i < abc.length ; i++) {
			abc[i] = sc.nextInt(); 
		}
			
		int sum = 0; // +=
		for (int i = 0; i < abc.length; i++) {
			sum += abc[i];
		}
		
		System.out.println((double)sum / abc.length);
		
		

	}

}
