package d20200708;

public class ExtendsMain {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		
		System.out.println("p.a : " +p.a);
		p.method();
		
		System.out.println("---------------------");
		System.out.println("c.b : " +c.b);
		c.method();
		
		System.out.println("-----------------------");
		c.c_method();
	}

}
