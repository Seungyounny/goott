package d20200713;

public class InterfaceClass implements InterfaceEx01, InterfaceEx02 {

	@Override
	public String getStr() {
		
		String result = "실제로 구현될 부분, 문자열을 얻어오는 부분";
		return result;
	}
	
	
	@Override
	public void calculate() {
		System.out.println("실제로 구현될 부분");
		System.out.println("연산을 열심히 하는 로직이 들어갈 부분");
		
	}


}
