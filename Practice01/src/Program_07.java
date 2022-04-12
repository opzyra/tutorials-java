import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 성적관리 프로그램
 * 
 * <입력 및 출력형식>
 * ==== Bank Menu ====
 * 1. 국어
 * 2. 수학
 * 3. 영어
 * 4. 총점
 * 5. 평균
 * 6. 학점
 * 7. 작업종료
 * ===================
 * 선택 = 
 * 
 * <국어, 수학, 영어>
 * 점수 =
 * 성공: 성적 입력완료
 * 실패: 성적 입력 실패(유효하지 않은 값)
 * 
 * <총점>
 * 성공: 성적합계는 xxx점 입니다.
 * 실패: (국어,수학,영어) 성적을 입력해주세요.
 * 
 * <평균>
 * 성공: 성적평균은 xxx.xx점 입니다.
 * 실패: (국어,수학,영어) 성적을 입력해주세요. 
 * 조건:
 * (소수점 두번째까지 표현)
 * 
 * <학점>
 * 성공: 학점은 X입니다.
 * 실패: (국어,수학,영어) 성적을 입력해주세요.
 * 조건:
 *    95점 이상 A+
 *    90점 이상 A
 *    85점 이상 B+
 *    80점 이상 B
 *    75점 이상 C+
 *    70점 이상 C
 *    65점 이상 D+
 *    60점 이상 D
 *    59점 미만 F
 *    
 * <작업종료>
 * 프로그램을 종료합니다. 이용해주셔서 감사합니다.
 * */
public class Program_07 {
	public static void main(String[] args) throws IOException {
		// 선언
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int balance = 0;

	}
}
