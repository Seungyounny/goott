package d20200716;

import java.util.*;

public class CollectionEx04 {

	public static void main(String[] args) {

		// map - hash map
		HashMap hm = new HashMap();

		System.out.println("hm : " + hm);

		// 얘는 add 아니고 put 이용
		hm.put("실", "바늘");
		hm.put("삼계탕", 18000);
		hm.put("햄버거", "콜라");
		hm.put("햄버거", "사이다");

		System.out.println("hm : " + hm);

		System.out.println(hm.get("실"));

		if (hm.containsKey("실")) {
			System.out.println("존재함");
		}
		if (hm.containsKey("밀크쉐이크")) {
			System.out.println("존재함");
		}

		System.out.println("-------------------------");
		// 현재 hm의 key의 첫 문자만 모두 콘솔에 출력. - API확인

		Set s = hm.keySet();

		System.out.println("s : " + s);

		Iterator it = s.iterator();

		while (it.hasNext()) {
			//Object obj = it.next();

			String str = (String) it.next();

			System.out.println(str.substring(0, 1));
		}
	}

}
