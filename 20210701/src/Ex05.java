import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// �������� �հ� ���, �ְ���, ������
		// ���������� �Է��� �޾�
		// ������� �Է¹޾Ƽ�...(�迭�� ����)
		 
		// ������� �ش��ϴ� ������ �迭�� �����
		Scanner sc = new Scanner(System.in);
		System.out.println("����� : ");
		int num = sc.nextInt();
		int[] abc = new int[num];
		// ��ȯ���� �̿��ؼ� ���������� �Է� ���� ��
		int sum = 0;
		for (int i = 0; i < abc.length; i++) {
			sum += abc[i];
		}
		double avg = (double)sum / (double)abc.length;
		int min = abc[0], max=abc[0];
		
		for (int i = 0; i < abc.length; i++) {
			if(max < abc[i])
				max = abc[i];
			
			if(min > abc[i])
				min = abc[i];			
		}
		System.out.printf("����:%d ���:%f �ְ���:%d ������:%d\n",
				 sum,avg,max,min);
		
		
		
		

	}

}
