package d20200720;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Hw01 extends JFrame {

	JPanel jp;
	JLabel sumLabel;

	JCheckBox[] lang = new JCheckBox[3];
	String names[] = { "Java", "C", "C++" };

	Hw01() {

		super("CheckBox");

		setTitle("CheckBox test"); // title 생성
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setBounds(400, 300, 500, 500);
		setLayout(new FlowLayout());

		add(new JLabel("Java 50000원   C 30000원    C++ 40000원  "));

		MyItemListener listener = new MyItemListener();

		for (int i = 0; i < lang.length; i++) {
			lang[i] = new JCheckBox(names[i]);
			lang[i].setBorderPainted(true);
			add(lang[i]);
			lang[i].addItemListener(listener);
		}

		sumLabel = new JLabel("현재 0 원 입니다.");
		add(sumLabel);
		setSize(250, 200);
		setVisible(true);
	}

	class MyItemListener implements ItemListener {
		int sum = 0; // 가격의 합

		public void itemStateChanged(ItemEvent e) {
			// 선택됬을때
			if (e.getStateChange() == ItemEvent.SELECTED) {
				if (e.getItem() == lang[0])
					sum += 50000;
				else if (e.getItem() == lang[1])
					sum += 30000;
				else
					sum += 40000;
			} // 선택 안됬을 때
			else {
				if (e.getItem() == lang[0])
					sum -= 50000;
				else if (e.getItem() == lang[1])
					sum -= 30000;
				else
					sum -= 40000;
			}
			sumLabel.setText("현재 " + sum + "원 입니다.");
		}
	}

	public static void main(String[] args) {
		new Hw01();
	}

}
