/*
 * 제어문
 * 2. 반복문
 *    - for: 다중 for문
 *    - while
 *    - do~while
 *    
 * for: 반복횟수를 통해 문장을 제어한다.
 * for(초기식구문; 조건(최종)식구문; 증감식구문){
 *  반복할 문장;
 * }
 */
public class Exam_05 {
	public static void main(String[] args) {
		/*
		 * 바깥쪽 for문이 한 번 동작할때 마다 아랫쪽 for문은 주어진 횟수만큼 반복된다.
		 * 
		 * #
		 * ##
		 * ###
		 * ####
		 * #####
		 * */
		for(int i = 0; i < 6; i++){ // 줄수 5 줄
			System.out.println();
			for(int j=0; j < i; j++){ // 줄마다 찍히는 수
				System.out.print("#");
			}
		}
		
		System.out.println();
		
		/*
		 * #####
		 * ####
		 * ###
		 * ##
		 * #
		 * */
		for(int i = 0; i < 5; i++) {
			for(int j = 5-i; j > 0; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
