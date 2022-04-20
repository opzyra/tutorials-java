package employee;

public class Excute {
	public static void main(String[] args){
		EmployeeManager manager = new EmployeeManager();
		
		//정규직 직원 등록
		manager.addEmployee(new Permanent("홍길동", 10000));
		manager.addEmployee(new Permanent("장보고", 15000));
		manager.addEmployee(new Permanent("이순신", 18000));
		
		
		//영업직 직원 등록
		manager.addEmployee(new Sales("이판매", 1000, 1000000, 0.7f));
		manager.addEmployee(new Sales("막판매", 1000, 2000000, 0.7f));
		manager.addEmployee(new Sales("저판매", 1000, 3000000, 0.7f));
		
		//계약직 직원 등록
		manager.addEmployee(new PartTime("이알바", 11, 10000));
		manager.addEmployee(new PartTime("막알바", 9, 10000));
		manager.addEmployee(new PartTime("저알바", 18, 10000));
		
		//이번달 지급되는 직원의 급여 내역
		manager.showAllSalaryInfo();
		// 이번달 지급되는 직원의 급여 총액
		manager.showTotalSalary();
	}
}
