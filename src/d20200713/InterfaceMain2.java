package d20200713;

public class InterfaceMain2 {
	public static void main(String[] args) {
		InterfaceClass ifc = new InterfaceClass();
		ifc.calculate();
		System.out.println(ifc.getStr());
		System.out.println(ifc.NUM);
		
		System.out.println("-----------------------------------");
		InterfaceEx01 ife1 = new InterfaceClass(); // 부 -> 자식 하면 부만 사용가능
		ife1.calculate();
		
		System.out.println("-----------------------------------");
		InterfaceEx02 ife2 = new InterfaceClass();
		ife2.getStr();
		
		
		
		
		
	}

}
