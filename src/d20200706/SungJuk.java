package d20200706;

public class SungJuk {

	void sum() {

		int kor = 90;
		int eng = 100;

		int total = kor + eng;
		//지역변수
		System.out.println("total" + total);

	}
	
	public static void main(String[] args) {
		SungJuk sj =new SungJuk();
		
		sj.sum();//void 형은 원래 따로 리턴을 안하기 때문에, sum 메소드 안에서 출력을 해야함.
		
		//call by name : 이름으로 메소드를 호출한다.
		
	}

}
