package d20200720;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Hw02 extends JFrame {
	String str[] = { "선택하세요", "Java", "C", "C++" };
	ImageIcon[] images = { null, new ImageIcon("src/images/java_img.jpg"), new ImageIcon("src/images/C_img.jpg"),
			new ImageIcon("src/images/cpp_img.jpg") };


	public Hw02() {

		super("선택시 이미지 출력 ");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(400, 300, 500, 500);
		setLayout(new FlowLayout());
		JLabel imgLabel = new JLabel(images[0]);

		// comboobox

		JComboBox<String> combobox = new JComboBox<String>();

		for (int i = 0; i < str.length; i++) {
			combobox.addItem(str[i]);
		}



		combobox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JComboBox cb = (JComboBox) e.getSource(); // 콤보박스 알아내기

				int index = cb.getSelectedIndex();// 선택된 아이템의 인덱스

				imgLabel.setIcon(images[index]); // 인덱스의 이미지를 이미지 레이블에 출력

			}
		});

		add(combobox);
		add(imgLabel);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Hw02();

	}

}
