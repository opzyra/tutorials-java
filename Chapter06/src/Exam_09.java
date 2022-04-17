/*
 * 소나타, k5, 그랜져, SM5, ...... = > 자동차 
 * - 행위
 *   
 * 
 * */

class Car {
	String owner;
	int speed;
	int fuel;
	
	static final int MAX = 200;
	static final int STEP = 10;
	static final int FUEL_STEP = 2;
	
	//생성자 메서드
	public Car(String owner, int speed, int fuel){
		this.owner = owner;
		this.speed = speed;
		this.fuel = fuel;
	}
	
	public void carAccel(){ // 악셀이라는 페달을 밟았을때 상황
		/*
		 * 현재 연료의 상태를 파악한 후 자동차의 속도를 증가시킨다. 단, 현재속도와 증가할 속도의 합이 
		 * 최고속도를 추가할 수 없다.	
		 */
			if(fuel < FUEL_STEP){
				// 연료가 부족한 상태
				return;
			}else{
				//연료가 충분한 상태
				fuel -= FUEL_STEP;
				if(speed + STEP >= MAX){
					speed = MAX;
				}else{
					speed += STEP;
				}
			}
			
		}
		
		public void carBreak(){ //브레이크 페달을 밟았을때 상황
			// 속도 체크
			if(speed < STEP){
				speed = 0;
			}else{
				speed -=STEP;
			}
		}
		
		void showCar(){
			System.out.println("소유주 : " + owner);
			System.out.println("현재속도 : " + speed);
			System.out.println("남은연료 : " + fuel);
		}
}

public class Exam_09 {
	public static void main(String[] args) {
		Car sonata = new Car("강씨", 0, 70);
		Car avante = new Car("박씨", 0, 95);
		
		sonata.showCar();
		sonata.carAccel(); // 속도10 연료-2
		sonata.carAccel(); // 20 -4
		sonata.carAccel(); // 30 -6
		
		sonata.showCar();
		System.out.println();
		
		avante.showCar();
		avante.carAccel(); // 속도10 연료-2
		avante.carAccel(); // 20 -4
		avante.carAccel(); // 30 -6
		
		avante.showCar();
	}
}
