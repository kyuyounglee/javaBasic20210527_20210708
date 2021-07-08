
public class Ex03 {

	static int checkData(int input) {
		int result=0;
		if(input > 0)
			result = 1;
		else if(result == 0)
			result = 0;
		else
			result = -1;
		return result;
	}
	
	public static void main(String[] args) {
		// 입력한 값을 받아서  양수면 1을 리턴하고
		// 제로면 0, 음수면 -1을 리턴하는 함수
		
		// 1. 여기에 들어가는 코드를 먼저 만들고
		// 2 그 코드를 메소드형태로 표현
		
		int input = -15;
		int result = 0;

		if(input > 0)
			result = 1;
		else if(result == 0)
			result = 0;
		else
			result = -1;
		
		

	}

}
