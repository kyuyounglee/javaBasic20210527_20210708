import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		int hap = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int num =  sc.nextInt();		
		for (int i = 1; i <= num; i++) {
			hap +=  i;
		}
		System.out.printf("1���� %d������ �� = %d\n"
				,num,hap);

	}

}
