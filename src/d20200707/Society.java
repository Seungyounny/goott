package d20200707;

public class Society {
	//만들어놓은 Human 객체를 실체화 하려고 함 => new 
	
	public static void main(String[] args) {
		Human h1 =new Human();
		
		h1.먹기();
		System.out.println("이름" + h1.이름);
		System.out.println(h1);
		
		
		System.out.println("--------------");
		//참조를 따로 하면 두 객체는 다른 것이다 !!
		
		Human h2= new Human();
		System.out.println(h2);
		h2.생각하기();
		
		h2.이름 = "신사임당";
		h2.나이=21;
		
		System.out.println("h2이름 : " + h2.이름);
	
		System.out.println("----------------------");
	
		//변수를 직접 접근해서 수정하는 것은 안되는데 그 형태는 그대로 가져가고 싶을 때 
		
		Human h3 =new Human("신사임당","여성");
		System.out.println(h3 + " h3");
		System.out.println(h3.이름 + "  h3.이름 ");
		
		
		System.out.println("----------------------");
		
		Human h4 =new Human("유관순", "여성", 160.0);
		
		System.out.println(h4);
		System.out.println(h4.이름);
		System.out.println(h4.성별);
		System.out.println(h4.키);
		System.out.println(h4.나이);
		
		System.out.println("------------");
		
		Human h5 =new Human("이순신","남성", 180.0,70.5,35);
		
		System.out.println(h5.이름);
	}

}
