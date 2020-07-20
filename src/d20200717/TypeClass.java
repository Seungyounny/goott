package d20200717;

// 설계 시점에 자료형 타입을 결정하지 않고 run time시에 자료형을 결정하게 하자
// : 자료형 일반화 - Generic

public class TypeClass<T> {
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
	

}
