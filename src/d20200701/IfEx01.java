package d20200701;
// 분기(조건문)
public class IfEx01 {
	public static void main(String[] args) {
		int x = 50;
		int y = 100;
		
		//if문
		if(x < y) {
			// 조건이 참이면 {} 수행
			System.out.println("x가 y보다 작습니다.");
			
		}
		System.out.println("-------------------");
		if( x!= y) {
			System.out.println("x는 y와 다릅니다.");
		}else {
			System.out.println("x와 y는 같습니다.");
		}
	}

}
