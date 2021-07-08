import java.util.Scanner;

public class Ex04 {
	static int input = 0;
	static int hap = 0;	
	int inputF() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 n까지의 합 n을 입력하세요:");
		input =  sc.nextInt();
		return input;
	}
	static int process(int input) {
		for (int i = 1; i <= input; i++) {
			hap+= i;
		}
		return hap;
	}
	static void show(int input, int hap) {
		System.out.println("1 부터 "+input + " 까지의 합은 " + hap);
	}
}







