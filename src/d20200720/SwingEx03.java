package d20200720;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

// image 삽입

public class SwingEx03 extends JFrame {
	JLabel jbl1, jbl2, jbl3;
	ImageIcon img1,img2;
	
	public SwingEx03() {
		super("image test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setBounds(400, 300, 500, 700);
		setLayout(new FlowLayout());
		
		// 라벨 출력
		jbl1 = new JLabel("라벨에 문자 출력");
		add(jbl1);
		
		// 이미지 아이콘 생성
		img1 = new ImageIcon("src/images/img2.jpg");
		
		jbl2 = new JLabel(img1);
		add(jbl2);
		
		img2 = new ImageIcon("src/images/btnNormal.jpg");
		jbl3 = new JLabel("Button",img2,SwingConstants.CENTER);
		add(jbl3);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingEx03();
	}

}
