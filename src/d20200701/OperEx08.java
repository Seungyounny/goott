package d20200701;
// 8. 대입 연산자 : =, +=, -=, *=, /=, %=
public class OperEx08 {
	public static void main(String[] args) {
		int a = 10;
		
//		a++;
//		a++;
		a += 2;
		
		System.out.println("a : " +a);
		System.out.println("a += 2 " + (a+=2));
		System.out.println("a -= 2 " + (a-=2));
		System.out.println("a *= 2 " + (a*=2));
		System.out.println("a /= 2 " + (a/=2));
		System.out.println("a %= 2 " + (a%=2));
		
		
	}

}
