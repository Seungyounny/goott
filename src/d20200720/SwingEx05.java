package d20200720;

import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class SwingEx05 extends JFrame {

	String str[] = { "서울", "인천", "대전", "대구", "울산", "부산", "광주", "제주" };
	JScrollPane jp;

	public SwingEx05() {
		super("JList, JComboBox Test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(400, 300, 500, 500);
		setLayout(new FlowLayout());

		// list
		JList<String> list = new JList<String>(str);
		add(list);

		// 스크롤이 있는 리스트
		JList<String> ScrollList = new JList<String>(str);
		jp = new JScrollPane(ScrollList, jp.VERTICAL_SCROLLBAR_ALWAYS, jp.HORIZONTAL_SCROLLBAR_NEVER); // 어디에 붙일지,
		add(jp);

		// comboobox

		JComboBox<String> combobox = new JComboBox<String>(str);
		add(combobox);

		JComboBox<String> combobox2 = new JComboBox<String>();

		for (int i = 0; i < str.length; i++) {
			combobox2.addItem(str[i]);
		}
		add(combobox2);
		setVisible(true);

	}

	public static void main(String[] args) {
		new SwingEx05();

	}

}
