package d20200716;

public class WrapperClass {
	
	//WrapperClass
	// : 완전한 객체 지향을 구현하기 위한 도구 중 하나
	// : primitive type ( int , float,...)을 객체로 만들어 주는 (놓은) 클래스
	
	public static void main(String[] args) {
	
		//int, float----> Integer,Float
		
		Integer num =new Integer(3);
		//System.out.println("num : "+ num );
		showData(num);
		showData(new Integer(7));
		
		System.out.println("-------------");
		
		//Wrapper Class 기본 기능
		//1. Boxing
		Integer ival =new Integer(10);
		Double dval =new Double(3.14);
		
		System.out.println(ival);
		System.out.println(dval);
		
		System.out.println("---------");
		
		//2. unboxing
		ival =new Integer(ival.intValue()+10);
		dval =new Double(dval.doubleValue()+3.14);
		
		System.out.println(ival);
		System.out.println(dval);
		
		System.out.println("-----------------");
		
		//Wrapper class를 기본 기능으로 사용시 길어지고 불편
		//primitive type 처럼 ! 사용 가능 (AutoBoxing, AutoUnBoxing)
		
		String str ="Java";
		Integer ivalue =100;
		Double dvalue=3.131434;
		
		System.out.println(str);
		System.out.println(ivalue);
		System.out.println(dvalue);
	}

	public static void showData(Object obj) {
		// TODO Auto-generated method stub
		
		System.out.println(obj);
		
	}

}
