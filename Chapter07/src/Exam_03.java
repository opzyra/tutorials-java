/*
 * 접근지정자(접근제한자) : 클래스 내부의 맴버에 접근을 제한하는 기능을 가진 키워드
 * 1. private : 전용, 클래스밖에서 접근을 허용하지 않을때
 * 2. protected : 상속, 같은 클래스, 같은 폴더에서 접근허용
 * 3. public : 공용, 객체만 가지고 있다면 어디서든 접근을 허용
 * 
 * 캡슐화
 * 멤버필드의 접근제한자는 private
 * 멤버메서드는 접근제한자로 public
 * 
 * 
 */

// 평면위의 한 점을 추상화하는 클래스 Point
class Point{ 
	//멤버필드 : 은딕된 멤버필드(정보은닉)
	private int x;
	private int y;
	
	//생성자 메서드	
	Point(){ // default 생성자 - 멤버필드를 초기화시켜주는 역할을 수행한다.
		x = 0;
		y = 0;
	}
	
	Point(int x){
		this.x = x;
		y = 0;
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//멤버 메서드	
	
	// 맴버 메서드 : set() ~(설정), get ~(추출)
	void setX(int x){
		this.x = x;
	}
	
	void setY(int y){
		this.y = y;
	}
	
	int getX(){
		return x;
	}
	
	int getY(){
		return y;
	}
	
	public void disp(){
		System.out.println("점(x,y) = (" + x + " , " + y + ")") ; 
	}
	
	
}

public class Exam_03 {
	public static void main(String[] args){
		// 객체 생성
		Point ap = new Point();
		//ap.disp(); // 0, 0
//		ap.x = 10;
			ap.setX(10);
//		ap.y = 20;
			ap.setY(20);
		//ap.disp(); // 10, 20
		System.out.println("점(x,y) = (" + ap.getX() + ", " + ap.getY() + ")");
	}
}
