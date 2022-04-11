import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * while : 횟수제어보다는 사용자의 행위로 제어함(반복횟수가 명확하지 않음)
 * 반복을 수행할때 무한Loop(무한반복)사용자의 행위에 의해 반복을 멈추고 싶을때.
 * while(논리조건문){
 * 	반복할 문장;
 * }
 * 
 * while(true){
 * 	
 * }
 */
public class Exam_09 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			System.out.print("x를 입력하면 종료됩니다. >> ");
			String line = in.readLine();
			char ch = line.charAt(0);
			
			if(ch == 'x') {
				System.out.println("x를 누르셨네요 종료됩니다.");
				break;
			}
			
		}
	}
}
