package d20200720;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingBasic2 extends JFrame{
	public SwingBasic2() {
		super("Panel 부착");
		setSize(300,300);
		setVisible(true);
		
		Container panel = getContentPane();
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.BLACK);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton jb1 = new JButton("jb1");
		JButton jb2 = new JButton("jb2");
		JButton jb3 = new JButton("jb3");
		
		panel.add(jb1);
		panel.add(jb2);
		panel.add(jb3);
		
		
	}

	public static void main(String[] args) {
		new SwingBasic2();
	}
}
