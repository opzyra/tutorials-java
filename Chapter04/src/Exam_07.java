import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 구구단을 출력하는 프로그램을 구현하시오.
 * 출력할 단수를 입력받아 다음과 같은 출력형식이 되도록 코딩하시오.
 * <입력 및 출력형식>
 * 단수 = 7
 * 
 * 7 x 1 = 7
 * 7 x 2 = 14
 * 7 x 3 = 21
 * 7 x 4 = 28
 * 7 x 5 = 35
 * 7 x 6 = 42
 * 7 x 7 = 49
 * 7 x 8 = 56
 * 7 x 9 = 63 
 * 
 */
public class Exam_07 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("단수 = ");
		String line = in.readLine();
		int number = Integer.parseInt(line);
		
		for(int i =1; i < 10; i++){
			System.out.println(number + " x " + i + " = " +  number * i);
		}
	}
}
