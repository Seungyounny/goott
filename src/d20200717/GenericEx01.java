package d20200717;

public class GenericEx01 {
	public static void main(String[] args) {
		TypeClass<Integer> t1 = new TypeClass<Integer>();
		
		t1.setValue(100);
		
		System.out.println(t1.getValue());
		
		System.out.println("---------------------------");
		TypeClass<String> ts = new TypeClass<String>();
		ts.setValue("제너릭");
		System.out.println(ts.getValue());
		
		System.out.println("--------------------------------");
		
		// float, double 출력
		
		TypeClass<Float> tf = new TypeClass<Float>(); 
		tf.setValue(3.14f);
		System.out.println("float  : " +tf.getValue());
		
		TypeClass<Double> td = new TypeClass<Double>();
		td.setValue(3.14);
		System.out.println("double  : " +td.getValue());
	}

}
