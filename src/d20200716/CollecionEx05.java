package d20200716;

import java.util.*;

public class CollecionEx05 {

	
	public static void main(String[] args) {
		String str[] = {"커피", "콩", "빨간약병", "파란약병" , "두부" , "딸기", "포도"};
		
		System.out.println("str : "+ str );
		
		//ArrayList에 담에서 하나씩 꺼내서 출력
		//이 ArrayList 는 비동기적 성장형 Object 배열 => 여기에 String 만 쓸 수 있도록 하고싶음
		//JCF 뒤에 <E>를 붙임 : generic
		
		//컴파일 전에 미리 에러를 방지할 수 있음 
		
		ArrayList<String> al =new ArrayList<>();
		
		for(int i=0;i<str.length;i++) {
			al.add(str[i]);
		}
		
		al.add("키위");

		
	}
}
