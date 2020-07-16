package d20200716;

import java.util.*;

public class CollectionEx01 {

	public static void main(String[] args) {

		// vector : 동적 성장형 object배열

		Vector v = new Vector();
		System.out.println(" v :  " + v);
		System.out.println(" v.capacity() : " + v.capacity()); // 기본 배열 10 칸
		System.out.println("v.size : " + v.size()); // 몇개의 데이터가 들어있는지 출력 !!!!

		String s1 = "Java";
		Object obj = s1;

		v.add(s1);

		v.add("오늘은");
		v.add("목요일");
		v.add("내일은");
		v.add("금요일");
		v.add("딸기");
		v.add("바나나");
		v.add("오렌지");
		v.add("키위");
		v.add("체리");
		v.add("수박");
		v.add("자두");

		System.out.println(" v :  " + v);
		System.out.println(" v.capacity() : " + v.capacity());
		System.out.println("v.size : " + v.size()); // 몇개의 데이터가 들어있는지 출력 !!!!

		System.out.println("-------------------------------------");

		int num[] = new int[2];

		num[0] = 10;
		num[1] = 20;
		// num[2]=30;

		System.out.println("num : " + num);

		for (int i = 0; i < num.length; i++) {

			System.out.println(num[i] + " ");
		}
		System.out.println();

		System.out.println("v : " + v);
		// 벡터 값 전체 출력

		// 한 단어씩 출력해서 첫번째 문자만 출력해 보세요
		for (int i = 0; i < v.size(); i++) {
			// System.out.println(((String) v.get(i)).charAt(0));

			Object obj1 = v.get(i);

			String str = (String) obj1;
			System.out.println(str.substring(0, 1));

			// 딸기가 몇번째 위치에 있나요 ?
			// System.out.println(str.indexOf("딸기")); -->이런게 없어

		}
		System.out.println(num[0] + "    " + v.get(0));

		// 딸기가 몇번째 위치에 있나요 ??

		if (v.contains("딸기")) {
			System.out.println("딸기가 있어요 ");

			for (int i = 0; i < v.size(); i++) {
				String s = (String) v.get(i);
				if (s.equals("딸기")) {
					System.out.println(i);
				}
			}

		} else {
			System.out.println("딸기가 없어용 ");
		}

		System.out.println(" ---------------------");
		Object [] o = {"커피", "콩", "빨간약병" ,"파란약병", "두부", "딸기", "자몽"};
		
		//딸기가 몇번째 위치에 있나요 
		
		for(int i=0;i<o.length;i++) {
//			if(o[i].equals("딸기")) {
//				System.out.println("o에 위치한 딸기 : " + i);
//			} 내가 한거
			
			String str = (String)o[i];
			if(str.equals("딸기")) {
				System.out.println(i);
			}
		}
	}
}
