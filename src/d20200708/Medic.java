package d20200708;

public class Medic {
	int 치료,mp;
	
	public Medic() {
		this.치료 = 2;
	}
	
	void 치료하기(Marine x) {
		x.hp += 치료;
		this.mp -= 5;
		if(x.hp > 100) {
			x.hp = 100;
		}
		System.out.println("치료하였습니다.");
	}
	


}
