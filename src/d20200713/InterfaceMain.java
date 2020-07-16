package d20200713;

public class InterfaceMain{
	public static void main(String[] args) {
		Horse h = new Horse();
		h.먹기();
		h.달리기();
		h.비행();
		
		System.out.println("--------------------");
		// 1) Marine객체 생성해서 2) 100, 200 좌표로 이동 3) 비행
		
		Marine m1 = new Marine();
		m1.이동하기(100,200);
		m1.비행();
		
		System.out.println("---------------");
		// Interface를 통해서도 배열 가능
		Flyable[] fList = new Flyable[2];
		
		System.out.println("fList : " +fList);
		
		// 인터페이스는 간접적인 상속 (has - a 관계)
		// cf) 상속관계 (is - a 관계)
		
		Flyable f = h;
		fList[0] = f;
		
		f = m1;
		fList[1]=f;
		
		for(int i = 0 ; i<fList.length;i++) {
			fList[i].비행();
		}
		
		
		
	}

}
