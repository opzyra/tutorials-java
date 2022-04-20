package employee;

//실제 처리를 담당하는 클래스, 일명 Control Class or Handler Class
//직원 등록, 모든 직원의 급여정보, 급여의 총합

public class EmployeeManager {
	
	Employee[] empList;
	//Permanent[] empList; // 객체 배열
	int empNum;
	
	//생성자 메서드를 통해 클래스의 멤버 필드를 초기화!!
	public EmployeeManager(){ // default생성자 - 멤버필드 초기화!!
		empList = new Employee[100];
		
		empNum = 0;
	}
	
	public void addEmployee(Employee emp){ // Permanent emp = 
		empList[empNum++] = emp;
	}
	
	public void showAllSalaryInfo(){
		for(int i = 0; i < empNum; i++){
			empList[i].showSalary(); 
			// 자식의 메소드에 접근이 가능한가?
			// 다형성의 속성을 활용해서 오버라이딩
		}
	}
	
	public void showTotalSalary(){
		int total = 0;
		for(int i = 0; i < empNum; i++){
			total += empList[i].getSalary();
		}
		System.out.println("직원 총 급여 = " + total);
	}
}

