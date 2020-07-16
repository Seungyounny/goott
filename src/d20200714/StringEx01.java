package d20200714;

public class StringEx01 {
	public static void main(String[] args) {
		String str1 = new String("java");
		String str2 = new String("java");
		
		
		System.out.println("str1 : " +str1);
		System.out.println("str1.toString() : " +str1.toString());
		
		// 아주 예외적으로 String 클래스만 primitive type 처럼 쓰도록 허용
		
		String str3 = "java";
		System.out.println("str3 : " +str3);
		
		System.out.println(str1.hashCode());
		// hashCode : 해당 객체의 고유한 값을 return
		//			: 일반적으로 객체 내부 주소를 정수값(16진수)으로 변환
		System.out.println("str 1 : "+
							str1.getClass().getName()+'@'+
							Integer.toHexString( str1.hashCode())
							);
		System.out.println("-----------------------------------");
		
		if(str1 == str2) {
			System.out.println("동일 객체");
		}else {
			System.out.println("다른 객체");
		}
		
		System.out.println("-------------------------");
		if(str1.equals(str2)) { // String만 특이
			System.out.println("동일 객체");
		}else {
			System.out.println("다른 객체");
		}
		/*
		 * 						Object				String
		 * 
		 *  toString()			참조값				자기 자신 문자열
		 *  equals()			주소동일여부			내용 동일 여부
		 * 
		 * 
		 * 
		 */
		
		System.out.println("------------------------");
		String str4 = "Java";  // new 안써서 같은 객체가 됨
		String str5 = "Java";
		
		// 내용이 같으면 같은 메모리를 사용
		if(str4==str5) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
		}
		
	}

}
