package d20200716;

import java.util.*; 

//hash 는 중복 XX 
public class CollectionEx03 {
	
	public static void main(String[] args) {
		
		HashSet hs =new HashSet();
		
		System.out.println("hs : "+ hs);
		
		hs.add("삼계탕");
	      hs.add("삼계탕");
	      hs.add("삼계탕");
	      hs.add("삼계탕");
	      hs.add("삼계탕");
	      hs.add("삼계탕");
	      hs.add("삼계탕");
	      hs.add("삼계탕");
	      hs.add("햄버거");
	      hs.add("삼계탕");
	      hs.add("삼계탕");
	      hs.add("삼계탕");
	      hs.add("삼계탕");
	      hs.add("삼계탕");
	      hs.add("물고기");
	      hs.add("치킨");
	      hs.add("소고기");
		
//		while(true) {
//			hs.add((int)(Math.random()*50+1)); //1~50 까지 랜덤하게 숫자 넣는것
//			
//			if(hs.size()>10) {
//				break;
//			}
//			
//			
//		}
		//중복된 값을 제거할 수 있음 : 일종의 필터링 
		System.out.println("hs : "+ hs);
		
		
		System.out.println(" ---------------------------- ");
		
//		for(int i=0;i<hs.size();i++) {
//			System.out.println(hs.get(i));
//		}
		// order by를 통해 값을 넣지 않으므로 index를 고정할 수가 없다. 그래서 getter가 존재하지 않는다.
		
		//반복자
		Iterator it =hs.iterator();
		
		//hasNext() : 다음값이 존재하면 true, 존재하지 않으면 false. 다음값이 있을때까지 찾는다.
		
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
		}
		
		
	}

}
