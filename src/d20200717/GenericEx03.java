package d20200717;

/*
 * Generic type
 * : 다양한 클래스를 하나의 클래스로 처리
 * : 생성클래스 뒤에 <~> : '~' - 일반화 시킨 객체(변수)
 * => 구현클래스에서 필요한 자료형을 대입한 후 사용
 * 
 * 
 * 
 * 
 */

class Student{
	int grade;
	
	public Student(int grade) {
	this.grade = grade;
	}
	
}

class Employee{
	int rank;
	
	public Employee(int rank) {
		this.rank = rank;
	}
	
}

class Person{
	Object info;
	
	public Person(Object info) {
		this.info = info;
	}
}

public class GenericEx03 {
	public static void main(String[] args) {
		Person p1 = new Person(new Student(1));
		Person p2 = new Person(new Employee(3));
		
		// Student, Employee 정보 확인
		Student st = (Student)p1.info;
		System.out.println(st.grade);
		
		Employee ep = (Employee)p2.info;
		System.out.println(ep.rank);
		
		
//		Student st2 = (Student)p2.info;
//		System.out.println(st2.grade);
//      컴파일 전에는 에러가 발견이 안됨 - 컴파일 후에 에러가 있다고 나옴
// 		==> 추후에 큰 문제가 될 가능성이 농후
		
		
		// GenericHw.java를 통해 위 오류를 사전에 방지해보세요.
		
		
		
	}

}


























