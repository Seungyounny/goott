package exam_awt02;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Hw02 extends Frame implements ActionListener {

	TextField tf1, tf2, tf3, tf4, tf5, tf6;
	Button btn;

	public Hw02() {
		super("Lotto 대박 ! ");
		setSize(400, 250);
		setVisible(true);

		FlowLayout f1 = new FlowLayout();

		setLayout(f1);

		tf1 = new TextField();
		tf2 = new TextField();
		tf3 = new TextField();
		tf4 = new TextField();
		tf5 = new TextField();
		tf6 = new TextField();

		add(tf1);
		add(tf2);
		add(tf3);
		add(tf4);
		add(tf5);
		add(tf6);

		btn = new Button("Lotto");

		add(btn);

		btn.addActionListener(this);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
			}
		});

	}

	public static void main(String[] args) {
		new Hw02();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		System.out.println("click");

		// 로또번호 6개 출력 ==> textfield에 출력

		Lotto lt = new Lotto();
		lt.print();

		//data에 들어있는 값을 가져와서 input
		tf1.setText(" " + lt.data[0]);
		tf2.setText(" " + lt.data[1]);
		tf3.setText(" " + lt.data[2]);
		tf4.setText(" " + lt.data[3]);
		tf5.setText(" " + lt.data[4]);
		tf6.setText(" "+lt.data[5]);
		

	}

}
