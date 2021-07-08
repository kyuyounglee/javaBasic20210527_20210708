import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		int hap = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num =  sc.nextInt();		
		for (int i = 1; i <= num; i++) {
			hap +=  i;
		}
		System.out.printf("1부터 %d까지의 합 = %d\n"
				,num,hap);

	}

}
