import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 은행계좌관리 프로그램
 * 
 * <입력 및 출력형식>
 * ==== Bank Menu ====
 * 1. 입금처리
 * 2. 출금처리
 * 3. 잔액조회
 * 4. 작업종료
 * ===================
 * 선택 = 
 * 
 * <입금처리>
 * 입금액 =
 * 성공: xxx 입금완료
 * 
 * <출금처리>
 * 출금금액 =
 * 성공: xxx 출금완료
 * 실패: 잔액부족!
 * 
 * <잔액조회>
 * 고객님의 잔액은 XXX원 입니다.
 * 
 * <작업종료>
 * 프로그램을 종료합니다. 이용해주셔서 감사합니다.
 * */
public class Program_06 {
	public static void main(String[] args) throws IOException {
		// 선언
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int balance = 0;
		
		// 입력
		while(true) {
			
			System.out.println("==== Bank Menu ====");
			System.out.println("1. 입금처리");
			System.out.println("2. 출금처리");
			System.out.println("3. 잔액조회");
			System.out.println("4. 작업종료");
			System.out.println("===================");
			System.out.print("선택 =");
			
			int menu = Integer.parseInt(in.readLine());
			
			switch(menu) {
				case 1:{ // 입금처리
					System.out.print("입금액 =");
					int add = Integer.parseInt(in.readLine());
					balance += add;
					System.out.println(add + "원 입금 완료");
					break;
				}
				case 2: {
					System.out.print("출금액 =");
					int sub = Integer.parseInt(in.readLine());
					if(balance - sub >= 0) {
						balance -= sub;
						System.out.println(sub + "원 출금 완료");
					} else {
						System.out.println("잔액 부족!");
					}
					break;
				}
				case 3: {
					System.out.println("고객님의 잔액은 " + balance + "원 입니다.");
					break;
				}
				case 4: {
					System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
					System.exit(0);
					break;
				}
			}
			
			System.out.println();
			
		}
		
	}
}
