import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 프로그램의 처리 플로우
 * 1. 선언
 * 2. 입력
 * 3. 처리
 * 4. 출력
 * 
 * */
public class Exam_09 {
	public static void main(String[] args) throws IOException {
		//선언
		int number;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력
		System.out.print("숫자 하나를 입력하세요. > ");
		String line = in.readLine();
		number = Integer.parseInt(line);
		
		// 처리
		number++;
		
		// 출력
		System.out.println("입력하신 숫자의 다음은 " + number + "입니다.");
	}
}
