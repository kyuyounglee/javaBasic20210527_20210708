
public class Ex05 {

	public static void main(String[] args) {
		// 객체생성
		// 클래스명 객체명 = new 클래스명();
		Ex04 a = new Ex04();
		int input =  a.inputF();
		
		int result = Ex04.process(input);
		Ex04.show(input, result);

	}

}
