import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 하나의 수를 입력받아 그 수를 제곱하는 프로그램을 작성하시오.
 * 
 * 예시
 *   입력: 3
 *   출력: 9
 * 
 * */
public class Exam_10 {
	public static void main(String[] args) throws IOException {
		// 선언
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int number;
		int result;
		
		// 입력
		System.out.print("입력 : ");
		number = Integer.parseInt(in.readLine());
		
		// 처리
		result = number * number;
		
		// 출력
		System.out.println(result);
		
		
	}
}
