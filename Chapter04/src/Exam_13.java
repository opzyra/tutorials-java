import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 정수를 입력받아 그 수에 맞는 층의 피라미드를 출력하는
 * 프로그램을 구현하시오.
 * 
 * <입력형식>
 * 출력할 피라미드의 층수 = 
 * 
 * <출력조건>
 * 최대 30층까지 출력 가능함
 * 
 * <예시>
 * 입력: 5
 * 출력
 *      #
 *     ###
 *    #####
 *   #######
 *  #########
 * 
 */
public class Exam_13 {
	public static void main(String[] ar) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int input = 0;
		
		System.out.println("피라미드 출력 프로그램(최대 30층까지 가능)");
		
		do{
		System.out.print("층수 입력 : ");
		input = Integer.parseInt(in.readLine());
		}while(input <= 0 || input > 30);
		
		System.out.println();
		for(int h = 1; h < input+1; h++){
			for(int i = 0; i < input-h; i++){
				System.out.print(" ");
			}
			for(int j = 0; j < 2*h-1; j++){
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
