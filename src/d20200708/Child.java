package d20200708;

public class Child extends Parent {
//	String a = "자식";
//	
//	public void c_method() {
//		System.out.println(a + " 호줄");
//		System.out.println("잔소리 하기");
	//    }
	
	String b = "자식";
	
	public void c_method() {
		System.out.println(b +" 호출");
		System.out.println("클럽가기");
	}
	
	@Override
	public void method() {
		System.out.println(b+ " 클래스에서");
		
		// super : 부모를 가리키는 참조변수(키워드)
		System.out.println("super.a : " +super.a +" 변수 호출");
		
		System.out.println("자식은 친구(동생)에게 잔소리 하기"); 
	}
	
	}


