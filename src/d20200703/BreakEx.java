package d20200703;

public class BreakEx {

	//Break : 가장 가까운 반복문을 탈출
	//continue : 이번만 생략
	//break 라벨명 : 라벨이 붙어있는 반복문 탈출 
	//continue 라벨명 : 라벨이 붙어있는 반복문에서 조건이 true 면 이번만 생략 
	
	public static void main(String[] args) {
		
		outer :  //라벨링 ...! 
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				
				if(i==j) {
					//break outer; //break 를 여기서 했기 때문에 조건에 부합하면 라벨링된 부분을 탈출.
					continue outer;
					
				}
				System.out.println("i : " + i + ", j : "+ j );
			}//내부 for end
		}//외부 for end 
	}
}
