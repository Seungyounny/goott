package d20200720;

import javax.swing.JFrame;

/*
 * Swing : AWT 상속
 *  - AWT가 운영체제를 기반으로 운영되므로 (상대적으로) 느림
 *  - 경량화, 빠르고 순수 자바 기술 (javax.~
 *  - 클래스 앞에 'J'자 붙임
 * 
 * 
 * 
 */

public class SwingBasic {
	public static void main(String[] args) {
		new SwingBasic();
		
		JFrame jf = new JFrame();
		jf.setTitle("처음 만들어본 swing Frame");
		jf.setSize(500, 500);
		jf.setVisible(true);
		
		
	}

}
