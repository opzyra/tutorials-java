package employee;
/*
 * Employee의 저장소에 연결하여 데이터를 등록, 수정, 삭제 등의 작업을 할수 있도록 하는 통로 역할의 클래스
 * 저장소 DB => 현재는 자바의 메모리 자료구조인 배열로 구현한다.
 * */
public class EmployeeRepository {
	private Employee[] empList;
	private int empNum;
	
	public EmployeeRepository() {
		empList = new Employee[100];
		empNum = 0;
	}
	
	// 조회 (전체)
	public Employee[] selectAll() {
		return empList;
	};
	
	// 조회 (한개)
	public Employee selectOne(int idx) {
		for(int i = 0; i<empNum; i++) {
			if(empList[i] != null && empList[i].getIdx() == idx) {
				return empList[i];
			}
		}
		
		return null;
	};
	
	// 전체 직원 수
	public int countAll() {
		int count = 0;
		for(int i = 0; i<empNum; i++) {
			if(empList[i] != null) {
				count++;
			}
		}
		return count;
	}
	
	// 고용형태별 직원 수
	public int countEmployeeType(String type) {
		int count = 0;
		for(int i = 0; i<empNum; i++) {
			if(empList[i] != null && empList[i].getEmployeeType().equals(type)) {
				count++;
			}
		}
		return count;
	}
	
	// 전체 직원 급여 합계
	public int sumSalaryAll() {
		int salarySum = 0;
		for(int i = 0; i<empNum; i++) {
			if(empList[i] != null) {
				salarySum += empList[i].getSalary();
			}
		}
		
		return salarySum;
	}
	
	// 등록
	public void createOne(Employee emp) {
		emp.setIdx(empNum);
		empList[empNum] = emp;
		empNum++;
	}
	
	// 수정
	public void updateOne(int idx, Employee emp) {
		for(int i = 0; i<empNum; i++) {
			if(empList[i] != null && empList[i].getIdx() == idx) {
				emp.setIdx(idx);
				empList[i] = emp;
				break;
			}
		}
	};
	
	// 삭제
	public void removeOne(int idx) {
		for(int i = 0; i<empNum; i++) {
			if(empList[i] != null && empList[i].getIdx() == idx) {
				empList[i] = null;
			}
		}
	}
}
