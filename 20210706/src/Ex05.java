
public class Ex05 {

	public static void main(String[] args) {
		// ��ü����
		// Ŭ������ ��ü�� = new Ŭ������();
		Ex04 a = new Ex04();
		int input =  a.inputF();
		
		int result = Ex04.process(input);
		Ex04.show(input, result);

	}

}
