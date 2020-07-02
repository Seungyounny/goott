package d20200702;

public class WhileBasic {

	
	/*
	 * while(조건){
	 * 문장...
	 * }
	 * 
	 * 반복문 
	 * 1. for(초기식;조건식;증감식){
	 * 
	 * } // 횟수가 정해져 있을 때 유용
	 *
	 * 
	 * 2. while(조건){
	 * 
	 * } //몇 번 할 지 모르지만 특정한 조건이 될 떄 유용
	 * 특정한 조건이 true가 아니면 실행조차 안함 
	 * 
	 * 
	 * 3. do{
	 * 문장
	 * }while(조건); // 몇번 할 지 모르지만 특정한 조건이 될 때 유용.
	 *  *** while 문과 차이 : 일단 한번은 실행하는 것 .
	 *  
	 * 
	 * 
	 * 
	 */
	
	//for 문 9단 출력
	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			System.out.println("9 * " + i + " = "+ (9*i));
		}
		
		System.out.println("--------------");
		
		int j=1;
		while(j<=9) {
			System.out.println(9*j);
			j++;
		}
	}

	
}
