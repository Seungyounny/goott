package d20200721;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

//FileDialog
public class SwingEx07 extends JFrame implements ActionListener {

	JLabel jlb = new JLabel();

	public SwingEx07() {

		super("FileDialog test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1100, 300, 400, 400);

		makeMenu();
		setVisible(true);
	}

	private void makeMenu() {
		JMenuBar jmb = new JMenuBar();
		JMenu jm = new JMenu("파일");
		JMenuItem jmi = new JMenuItem("열기");

		jmi.addActionListener(this);

		jm.add(jmi);
		jmb.add(jm);
		setJMenuBar(jmb);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		System.out.println("click");
		JFileChooser choice = new JFileChooser();

		choice.showOpenDialog(null);

	}

	public static void main(String[] args) {
		new SwingEx07();

	}
}
