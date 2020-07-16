package d20200714;
//StringBuffer,   StringBuilder
//	   1.0			  1.5
//     안정		         불안정(thread 사용시)
public class StringBuilderEx {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("AA");
		
		System.out.println(sb);
		
		sb.insert(1, 4);
		
		System.out.println(sb);
		
		sb.insert(0,1);
		
		System.out.println(sb);
		
		System.out.println("------------------");
		
		String str = "StarBucks";
		
		StringBuilder sb2 = new StringBuilder(str);
		System.out.println(sb2);
		System.out.println(sb2.reverse());
		
	}

}
