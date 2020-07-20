package d20200720;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingEx06 extends JFrame {

	public SwingEx06() {
		super("optionPanel-dialog test");
		setBounds(1100, 300, 500, 300);

		// JPanel 호출

		MyJPanel jp = new MyJPanel();
		add(jp);
		setVisible(true);

	}

	public static void main(String[] args) {
		new SwingEx06();
	}
}

class MyJPanel extends JPanel {
	JButton inputBtn, confirmBtn, msgBtn;
	JTextField jtf;

	public MyJPanel() {
		setBackground(Color.pink);
		inputBtn = new JButton("Input Dialog");
		confirmBtn = new JButton("Confrim Dialog");
		msgBtn = new JButton("msg Dialog");
		jtf = new JTextField(20);

		add(inputBtn);
		add(confirmBtn);
		add(msgBtn);
		add(jtf);

		inputBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String input = JOptionPane.showInputDialog("전화번호를 입력하세요");
				jtf.setText(input);
				return;

			}
		});// inputBtn

		confirmBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int result = JOptionPane.showConfirmDialog(null, "계속 진행하시겠습니까?", "확인",
						JOptionPane.YES_NO_CANCEL_OPTION);
				// 확인, 거부, 취소

				if (result == 0) {
					jtf.setText("YES");
				} else if (result == 1) {
					jtf.setText("NO");
				} else if (result == 2) {
					jtf.setText("CANCEL");
				}

			}
		});// confirm

		msgBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showConfirmDialog(null, "경고", "경고메시지창", JOptionPane.ERROR_MESSAGE);

			}
		});//msg 끝

	}

}
