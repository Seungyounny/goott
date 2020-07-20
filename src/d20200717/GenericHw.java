package d20200717;

class Student2<T>{
	T grade;
	
	public Student2(T grade) {
	this.grade = grade;
	}
	
}

class Employee2<T>{
	T rank;
	
	public Employee2(T rank) {
		this.rank = rank;
	}
	
}

class Person2<T>{
	T info;
	
	public Person2(T info) {
		this.info = info;
	}
}

public class GenericHw<T> {
	public static void main(String[] args) {
		
		Student2 st2 = new Student2(2);
		
		Person2<Student2> p1 = new Person2<Student2>(new Student2(1));
		
		System.out.println(p1.info.grade);
		
		System.out.println("------------------------------------");
		
		//Person2<Employee2> p2 = new Person2<Employee2>(new Student(1));
		Person2<Employee2> p2 = new Person2<Employee2>(new Employee2(1));
		
		System.out.println(p2.info.rank);
		
	}

	

}
