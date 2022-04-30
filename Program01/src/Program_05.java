import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 369게임을 구현하시오.
 * 1 ~ 99 사이의 정수를 키보드로 입력받고, 1부터 입력받은 수까지 반복하여 출력하는 작업을 수행하다가,
 * 해당 숫자가 3, 6, 9중 하나가 있으면 "박수짝"을 출력하고, 두개가 있으면 "박수짝짝"을 출력하도록 구현
 * 하시오.
 * 
 * <입력>
 * 정수 = 60
 * 
 * <출력>
 * 1
 * 2
 * 박수짝
 * 4
 * 5
 * 박수짝
 * 7
 * ...
 * 32
 * 박수짝짝
 * ...
 * 
 * */
public class Program_05 {
	public static void main(String[] args) throws IOException {
		// 선언
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int input;
		
		// 입력
		do {
			System.out.print("정수 = ");
			input = Integer.parseInt(in.readLine());
		} while(input < 1 || input > 99);
		
		// 처리 + 출력
		for(int i = 0; i<input; i++) {
			int number = (i+1);
			int first = number/10;
			int secend = number%10;
			
			if(first == 3 || first == 6 || first == 9) {
				System.out.print("박수짝");
				if(secend == 3 || secend == 6 || secend == 9) {
					System.out.print("짝");
				}
				System.out.println();
			} else if(secend == 3 || secend == 6 || secend == 9) {
				System.out.println("박수짝");
			} else {
				System.out.println(number);
			}
		}
		
		
	}
}
