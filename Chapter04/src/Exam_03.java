import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * switch~case~break
 */
public class Exam_03 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("1~3 숫자중에 입력 > ");
		String line = in.readLine();
		int score = Integer.parseInt(line);
		
		String message;
		switch(score) {
			case 1: 
				message = "안녕하세요!";
				break;
			case 2: 
				message = "반갑습니다!";
				break;
			case 3: 
				message = "감사합니다!";
				break;
			default: 
				message = "그런 숫자는 없는데요?";
				break;
		}
		System.out.println(message);
	}
}
