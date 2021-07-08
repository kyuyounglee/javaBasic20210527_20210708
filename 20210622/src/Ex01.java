
public class Ex01 {

	public static void main(String[] args) {
		// 순환문 
		// 1.for --> 횟수 , 배열
		// 2. while --> 특정조건을 만족  if  break
		//1  부터 10까지 더해라...
		// 1+2+ 3+ 4+5+6+7+8+9+10
		int result = 0;
		for (int i = 1; i <= 10; i++) {
			result += i;			
		}
		
		result = 0;
		// result 의 값을 2씩 증가시키면서 100보다 작을때까지
		// 1.
		while (true) {
			if(result>=100)
				break;
			result += 2;
		}
		result = 0;
		// 2
		while (result < 100) {
			result += 2;
		}
		
		
		

	}

}
