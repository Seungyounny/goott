package d20200706;

public class SungJuk2 {
	
	
	void sum(int kor, int eng) {
	
		//사용자가 입력한 변수를 가져오기 위해서는 메소드에 매개변수를 추가
		int sum= kor+eng; 
		
		System.out.println(sum);
	}
	public static void main(String[] args) {//1. 메인 찾기 
		
		SungJuk2 sj2=new SungJuk2(); //메모리에 적재
		sj2.sum(90, 100); // call by value : 값을 넣어서 호출 !!!
		
	}

}
