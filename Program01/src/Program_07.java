import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 성적관리 프로그램
 * 
 * <메뉴화면>
 * ==== Grade Menu ====
 * 1. 국어
 * 2. 수학
 * 3. 영어
 * 4. 총점
 * 5. 평균
 * 6. 학점
 * 7. 작업종료
 * ====================
 * 선택 = 
 * 
 * <국어, 수학, 영어 선택시>
 * ## 점수 = 
 * ## 성적 입력 완료!
 * 
 * <총점 선택시>
 * 성적합계는 xxx점 입니다.
 * (국어,수학,영어) 성적을 입력해주세요.
 * => 입력하지 않은 과목을 표기한다.
 * 
 * <평균 선택시>
 * 성적평균은 xx.xx점 입니다.
 * (국어,수학,영어) 성적을 입력해주세요.
 * => 입력하지 않은 과목을 표기한다.
 * 
 * <학점 선택시>
 * 학점은 X입니다.
 * (국어,수학,영어) 성적을 입력해주세요.
 * => 입력하지 않은 과목을 표기한다.
 * 
 * 학점 범위
 * 	95점 이상 A+
 *  90점 이상 A
 *  85점 이상 B+
 *  80점 이상 B
 *  75점 이상 C+
 *  70점 이상 C
 *  65점 이상 D+
 *  60점 이상 D
 *  59점 이하 F
 *  
 *  <작업종료 선택시>
 *  성적관리 프로그램을 종료합니다.
 *  
 *  <처리조건>
 *  1. 국어, 수학, 영어 성적을 입력받을시 0~100점 사이의 값이 아닌경우 다시 입력받는다.
 *  2. 평균은 소숫점 두번째 자리까지 표현한다.
 *  3. 메뉴에서 작업종료를 입력하기 전까지는 메뉴를 무한반복하여 출력한다.
 * */
public class Program_07 {
	public static void main(String[] args) throws IOException {
		// 선언
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int kor = -1;
		int eng = -1;
		int math = -1;
		
		boolean isStop = false;
		
		// 출력
		while(!isStop) {
			System.out.println("==== Grade Menu ====");
			System.out.println("1. 국어");
			System.out.println("2. 수학");
			System.out.println("3. 영어");
			System.out.println("4. 총점");
			System.out.println("5. 평균");
			System.out.println("6. 학점");
			System.out.println("7. 작업종료");
			System.out.println("====================");
			System.out.print("선택 = ");
			int menu = Integer.parseInt(in.readLine());
			
			switch (menu) {
			case 1:
				do {
					System.out.print("국어 점수 = ");
					kor = Integer.parseInt(in.readLine());
				}while(kor < 0 || kor > 100);
				System.out.println("국어 성적 입력 완료!");
				break;
			case 2:
				do {
					System.out.print("수학 점수 = ");
					math = Integer.parseInt(in.readLine());
				}while(math < 0 || math > 100);
				System.out.println("수학 성적 입력 완료!");
				break;
			case 3:
				do {
					System.out.print("영어 점수 = ");
					eng = Integer.parseInt(in.readLine());
				}while(eng < 0 || eng > 100);
				System.out.println("영어 성적 입력 완료!");
				break;
			case 4:
				String sumSubject = "";
				
				if(kor == -1) {
					sumSubject += "국어";
				}
				
				if(math == -1) {
					sumSubject += "수학";
				}
				
				if(eng == -1) {
					sumSubject += "영어";
				}
				
				if(!sumSubject.isEmpty()) {
					System.out.println(sumSubject + " 성적을 입력해주세요.");
				} else {
					int sum = kor + math + eng;
					System.out.println("성적합계는" + sum + " 점 입니다.");
				}
				
				break;
			case 5:
				String avgSubject = "";
				
				if(kor == -1) {
					avgSubject += "국어";
				}
				
				if(math == -1) {
					avgSubject += "수학";
				}
				
				if(eng == -1) {
					avgSubject += "영어";
				}
				
				if(!avgSubject.isEmpty()) {
					System.out.println(avgSubject + " 성적을 입력해주세요.");
				} else {
					int avgSum = kor + math + eng;
					float avg = avgSum / 3.0f;
					System.out.printf("성적평균은 %.2f점 입니다.\n", avg);
				}
				
				break;
			case 6:
				String gradeSubject = "";
				
				if(kor == -1) {
					gradeSubject += "국어";
				}
				
				if(math == -1) {
					gradeSubject += "수학";
				}
				
				if(eng == -1) {
					gradeSubject += "영어";
				}
				
				if(!gradeSubject.isEmpty()) {
					System.out.println(gradeSubject + " 성적을 입력해주세요.");
				} else {
					int gradeSum = kor + math + eng;
					float gradeAvg = gradeSum / 3.0f;
					String grade = "";
					
					int first = (int)gradeAvg/10;
					int secend = (int)gradeAvg%10;
					
					switch (first) {
					case 10:
					case 9:
						grade += "A";
						break;
					case 8:
						grade += "B";
						break;
					case 7:
						grade += "C";
						break;
					case 6:
						grade += "D";
						break;		
					default:
						grade += "F";
						break;
					}
					// 조건 3가지 => 처리 +를 붙이고 안붙이고
					// 1. 100점인경우 무조건 +를 붙인다!
					// 2. 59점이하인 경우 무조건 안붙인다.
					// 3. 위 1~2이 아닌 경우에 1의자리가 5이상인 경우 +를 붙인다
					if(first == 10 || (secend >= 5 && first >= 6) ) {
						grade += "+";
					}
					
					System.out.println("학점은 " + grade +" 입니다.");
				}
				
				break;
			case 7: 
				isStop = true;
				System.out.println("성적관리 프로그램을 종료합니다.");
				break;
			default:
				break;
			}
		}
	}
}
