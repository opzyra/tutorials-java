package grade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GradeController {
	
	public static void main(String[] args) throws IOException{
		//실체 처리를 담당하는 클래스의 객체 생성
		GradeService service = new GradeService();
		int check = 0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			//메뉴출력
			service.showMenu();
			System.out.print("선택 = ");
			check = Integer.parseInt(in.readLine());
			
			//사용자가 선택할 작업을 수행하는 Logic을 구현한다.
			switch(check){
			case 1 : service.addStudent(); break;
			case 2 : service.showAllStudent(); break;
			case 3 : System.out.println("프로그램을 종료합니다."); System.exit(0);
			default : System.out.println("선택이 올바르지 않습니다.");
			}
			System.out.println();
		}
	}
}
