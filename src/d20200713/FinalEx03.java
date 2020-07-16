package d20200713;

class Fruit3{
	public final static Fruit3 APPLE = new Fruit3("사과"); 
	public final static Fruit3 BANANA = new Fruit3("바나나"); 
	public final static Fruit3 PEACH = new Fruit3("복숭아"); 
	
	String msg;
	
	public Fruit3(String fruit) {
		this.msg = fruit;
	}
	
}

class Company3 {
	public final static Company3 AMAZON = new Company3("아마존");
	public final static Company3 GOOGLE = new Company3("구글");
	public final static Company3 APPLE = new Company3("애플");
	
	String msg;
	
	public Company3(String company) {
		this.msg = company;
	}
}

public class FinalEx03 {
	public static void main(String[] args) {
		Fruit3 type = Fruit3.APPLE;
		
		// type = Company3.AMAZON; => 상수화가 더 확실하게
		
		if(type.equals(Fruit3.APPLE)) {
			System.out.println(Fruit3.APPLE.msg);
		}else if(type.equals(Fruit3.BANANA)) {
			System.out.println(Fruit3.BANANA.msg);
		}else if(type.equals(Fruit3.PEACH)) {
			System.out.println(Fruit3.PEACH.msg);
		}
	}
	
	

}
