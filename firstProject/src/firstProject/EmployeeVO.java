package firstProject;

public class EmployeeVO {
	// 필드
	private int no; // 사번
	private String name; // 이름
	private String jobGrade;// 직책
	private int department; // 부서
	private String email; // 메일
	private String status; //

	// 생성자
	public EmployeeVO(int no, String name, String jobGrade, int department, String email) {
		this.no = no;
		this.name = name;
		this.jobGrade = jobGrade;
		this.department = department;
		this.email = email;
	}

	// status v필드의 초기화를 추가한다.
	public EmployeeVO(int no, String name, String jobGrade, int department, String email, String status) {
		this.no = no;
		this.name = name;
		this.jobGrade = jobGrade;
		this.department = department;
		this.email = email;
		this.status = status;
	}

	// 기본 생성자
	public EmployeeVO() {

	}

	// setter()/getter() 메소드 정의

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobGrade() {
		return jobGrade;
	}

	public void setJobGrade(String jobGrade) {
		this.jobGrade = jobGrade;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "EmployeeVO [no=" + no + ", name=" + name + ", jobGrade=" + jobGrade + ", department=" + department
				+ ", email=" + email + ", status=" + status + "]";
	}



}
