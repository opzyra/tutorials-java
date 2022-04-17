import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 
 * 다음 주어진 프로그램이 동작하도록 구현하시오.
 * <입력 및 출력형식>
 * 도형(1.점 2.원 3.사각형 4.종료)
 * 선택 = 1
 * 
 * x = 5
 * y = 5
 * 점(x, y) = (5, 5)
 * 
 * 도형(1.점 2.원 3.사각형 4.종료)
 * 선택 = 2
 * 
 * r = 10
 * 반지름(r) = 10
 * 
 * 도형(1.점 2.원 3.사각형 4.종료)
 * 선택 = 3
 * h = 7
 * w = 8
 * 폭(w) = 8, 높이(h) = 7
 * 
 * 도형(1.점 2.원 3.사각형 4.종료)
 * 선택 = 4
 * 프로그램을 종료합니다.
 * 
 */

class MyPoint{ // 점
	private int x;
	private int y;
	private BufferedReader in;
	
	public MyPoint() throws IOException{
		in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("x = ");
		x = Integer.parseInt(in.readLine());
		System.out.print("y = ");
		y = Integer.parseInt(in.readLine());
	}
	
	public void disp(){
		System.out.println("점(x,y) = (" + x + " , " + y + ")");
	}
}

class MyCircle{ // 원
	private int r;
	private BufferedReader in;
	
	public MyCircle() throws IOException{
		in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("r = ");
		r = Integer.parseInt(in.readLine());
		
	}
	
	public void disp(){
		System.out.println("반지름(r) = " + r);
	}
}

class MyRect{ // 사각형
	private int h;
	private int w;
	private BufferedReader in;
	
	public MyRect()throws IOException{
		in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("h = ");
		h = Integer.parseInt(in.readLine());
		System.out.print("w = ");
		w = Integer.parseInt(in.readLine());
		
	}
	
	public void disp(){
		System.out.println("폭(w) = " + w + " , " + "높이(h) = " + h);
	}
	
}

// 생성자 메소드를 통해 값을 입력받을수 있다.
public class Exam_12 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int select = 0;
		boolean isStop = false;
		do{
			System.out.print("도형(1.점 2.원 3.사각형 4.종료)\n선택 = ");
			select = Integer.parseInt(in.readLine());
			
			switch(select){
			case 1:
				MyPoint mp = new MyPoint();
				mp.disp();
				break;
				
			case 2:
				MyCircle mc = new MyCircle();
				mc.disp();
				break;
				
			case 3:
				MyRect mr = new MyRect();
				mr.disp();
				break;
				
			case 4:
				System.out.println("프로그램을 종료합니다.");
				isStop = true;
				break;
				
			default:
				System.out.println("선택이 올바르지 않습니다.");
			}
			
			System.out.println();
			
		}while(!isStop);
		
	}
}
