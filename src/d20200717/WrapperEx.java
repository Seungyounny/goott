package d20200717;

import java.util.ArrayList;

// WrapperClass : 완전한 객체 지향을 위한 도구
// 

public class WrapperEx {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("딸기");
		list.add("포도");
		
		int a = 300;
		
		Integer it = new Integer(a);  // Boxing
		list.add(it);
		
		Integer it2 = a;  // AutoBoxing
		list.add(it2);
		
		Object obj = it;
		list.add(obj);
		
		System.out.println(list);
		System.out.println("-------------------------");
		
		int b = it.intValue();   // UnBoxing
		
		int num = it;   // AutoUnBoxing
		System.out.println("---------------------------------------");
		
		System.out.println(it.intValue());
		System.out.println(it.MAX_VALUE);
		
		System.out.println("----------------------------------------");
		
		// 2진수변환
		System.out.println(Integer.toBinaryString(a));
		
		// WrapperClass 형변환 - int <--> String
		// : Parsing
		String str = "01011112222";
		int value = Integer.parseInt(str);
		System.out.println("value : " +value);
		
		double d = Double.parseDouble(str);
		System.out.println("d : " +d);
		
		
		
		
		
		
		
		
		
	}

}
