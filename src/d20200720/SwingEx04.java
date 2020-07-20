package d20200720;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class SwingEx04 extends JFrame implements ItemListener {
	
	//JRadioButton  jrb1,jrb2,jrb3;
	JRadioButton[] jrbs = new JRadioButton[3];
	JLabel jlb;
	JPanel jp;
	String[] str = {"C","Java","C++"};
	
	//ImageIcon imageIcon1, imageIcon2, imageIcon3, imageChecked;
	ImageIcon[] img = {
			new ImageIcon("src/images/c_img.jpg"),
			new ImageIcon("src/images/java_img.jpg"),
			new ImageIcon("src/images/cpp_img.jpg")
	};
	
	public SwingEx04() {
		super("radion button test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
//		imageIcon1 = new ImageIcon("src/images/java.jpg");
//		imageChecked = new ImageIcon("src/images/java_check.jpg");
		
		
		jp = new JPanel();
		jp.setBackground(Color.CYAN);
		
		ButtonGroup group = new ButtonGroup();
		
		for(int i=0;i<jrbs.length;i++) {
			jrbs[i] = new JRadioButton(str[i]);
			jrbs[i].setOpaque(false);
			
			group.add(jrbs[i]);
			jp.add(jrbs[i]);
			
			jrbs[i].addItemListener(this);
			
		}
		
		jlb = new JLabel("",JLabel.CENTER);
		
//		jlb = new JLabel("Label",JLabel.CENTER);
//		//jlb.setHorizontalAlignment(SwingConstants.CENTER);
//		
//		jrb1 = new JRadioButton("java",imageIcon1);
//		jrb1.setOpaque(false);
//		jrb1.setBorderPainted(true);
		
//		jp.add(jrb1);
		
		
		jrbs[1].setSelected(true);
		this.add(jp,"North");
		this.add(jlb,"Center");
		
//		jrb1.addItemListener(this);;
		
		setBounds(400, 300, 500, 500);
		setVisible(true);
		
		
	} // 생성자 end
	
	public static void main(String[] args) {
		new SwingEx04();
	}
	

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(jrbs[0].isSelected()) {
			jlb.setIcon(img[0]);
		}else if(jrbs[1].isSelected()) {
			jlb.setIcon(img[1]);
		}else if(jrbs[2].isSelected()) {
			jlb.setIcon(img[2]);
		}
	
	}

}
