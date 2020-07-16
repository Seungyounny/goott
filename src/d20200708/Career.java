package d20200708;

// 직위와 직책을 출력하는 객체 - 이름도 알 수 있게 하고 싶음

public class Career extends Name {
	String job;
	String position;
	
	
//	public Career(String job, String position) {
//		this.job = job;
//		this.position = position;
//		
//	}
	public Career(String name, String job, String position) {
		super(name); // private으로 선언해서 이렇게 선언해줘야함
		this.job = job;
		this.position = position;
	}
	
	void showInfo() {
		System.out.println("Job is " + job);
		System.out.println("position is : " + position);
		showName();
	}

}
