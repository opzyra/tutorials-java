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
public class Exam_08 {
	public static void main(String[] args) {
		int i = 0;
		while(i < 10){
			System.out.println("매우 졸리다.");
			i++;
		}
	}
}
