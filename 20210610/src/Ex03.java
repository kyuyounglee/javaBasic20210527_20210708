
public class Ex03 {

	public static void main(String[] args) {
		int hap = 0;
		int count = 1;
		while(true)
		{
//			hap += count++;
			hap += count;
			if(hap>=1000) break;			
			count++;
		}
		System.out.println("���ʷ� 1000�� �Ѵ� �� = "+count);

	}

}
