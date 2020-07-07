package d20200707;

public class Rabbit {
	String 안구색 = "";
	String 털색 ="";
	int 귀길이;
	int 다리갯수;
	
	Rabbit(){
		안구색 = "red";
		털색 ="white";
		귀길이 =10;
		다리갯수 = 4; 
		
	}
	
	void 점프하기() {
		System.out.println("깡총깡총");
	}
	
	void 먹기() {
		System.out.println("아삭아삭");
	}
	void 자기 () {
		System.out.println("쿨쿨");
	}

	public static void main(String[] args) {
		
	}
}
