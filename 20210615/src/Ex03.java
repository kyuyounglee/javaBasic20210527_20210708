import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// ������� �Է��� ó���ϴ� �κ�
		Scanner s = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int max = s.nextInt();
		int[] scores = new int[max];		
		for (int i = 0; i < scores.length; i++) {
			System.out.println("������ �Է��ϼ���");
			scores[i] =  s.nextInt();			
		}		
		int hap = 0;
		for (int i = 0; i < scores.length; i++) {
			hap += scores[i];
		}
		
		double avg = hap / (double)max;
		System.out.println(hap);
		System.out.println(avg);
	}

}
