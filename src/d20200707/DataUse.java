package d20200707;

public class DataUse {

	public static void main(String[] args) {
		Data data = new Data();

		System.out.println(data.getName());

		data.setName("홍길동");
		System.out.println(data.getName());
		
		
		System.out.println("----------------------");

		//연봉 70000000 ==> 5% 인상해서 출력
		data.setAnnual(70000000);
		System.out.println(data.getAnnual());
	}

}
