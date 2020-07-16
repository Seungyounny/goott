package d20200716;

//vector : 동적 성장형 object 배열
//ArrayList : 비동기적 성장형 Object 배열 . 최신형. 더 많이 사용 
import java.util.*;

public class CollectionEx02 {
	
	public static void main(String[] args) {
		
		ArrayList al =new ArrayList<>();
		
		System.out.println("al : "+ al);
		System.out.println("al.size : "+ al.size());
		
		
	al.add("오늘은");
	al.add("초복");
	al.add("오늘은");
	al.add("삼계탕");
	al.add("해신탕");
	al.add("치킨");
	al.add("바나나");
	al.add("오렌지");
	al.add("수박");
	al.add("키위");
	al.add(10);
	
	System.out.println("al : "+ al);
	System.out.println("al.size : "+ al.size());
	
	System.out.println("-----------------");
	al.get(2);
	
	//바나나는 몇번째에?
	
	for(int i=0;i<al.size();i++) {
		if(al.get(i).equals("바나나")) {
			System.out.println(i);
		}
	}
	
		
	}

}
