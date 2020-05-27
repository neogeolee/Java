package sub2;

public class Student extends Person{
	
	private String school;
	private String major;
	
	public Student(String name, int age, String school, String major) {
		super(name, age);
		this.school = school;
		this.major = major;
	}
	public void hello() {
		super.hello(); //부모의 hello함수 출력
		System.out.println(school+" 학생 입니다");
		System.out.println(major+" 을 공부합니다");
	}
	

}
