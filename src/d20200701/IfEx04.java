package d20200701;

import java.io.IOException;

//사용자로부터 문자 한글자를 입력받은 후
//소문자는 대문자로, 대문자는 소문자로
// ex) a => A, A => a

// 힌트 : 소문자 a = 97, z = 122
//		 대문자 A = 65, Z = 90
public class IfEx04 {
	public static void main(String[] args) throws IOException {
		System.out.println("문자 입력 : ");
		char value = (char)System.in.read(); // 딱 한글자
		
		System.out.println("처음 입력한 값 : " +value);
		
		if(value >= 'A' && value <= 'Z') {
			value += 32;
		}else if(value >= 'a' && value <= 'z') {
			value -= 32;
			
		}
		System.out.println(value);
		
		// 숫자 => 문자 (형변환)
//		char ch = value;
	}

}
