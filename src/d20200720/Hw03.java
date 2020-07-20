package d20200720;

import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Hw03 extends JFrame {

	public Hw03() {

		super("메모장 만들기!");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(400, 300, 500, 500);
		setLayout(new FlowLayout());

		JMenuBar mb = new JMenuBar();
		
		JMenu File = new JMenu("파일");
		
		

		mb.add(new JMenu("편집"));
		mb.add(new JMenu("서식"));
		mb.add(new JMenu("보기"));
		mb.add(new JMenu("도움말"));

		setJMenuBar(mb);
		
		File.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == File) {    // 열기

					FileDialog dialog = new FileDialog(this, "열기", FileDialog.LOAD);

					dialog.setDirectory(".");   // .은 지금폴더

					dialog.setVisible(true);   // 박스는 그냥 틀이고

					if(dialog.getFile() == null) return;

					String dfName = dialog.getDirectory() + dialog.getFile();  // 경로명 파일명

					

					try {

						BufferedReader reader = new BufferedReader(new FileReader(dfName));

						txtMemo.setText("");

						String line;

						while((line = reader.readLine()) != null) {     // 읽어온 문서의 줄이 없어지면

							txtMemo.append(line + "\n");       // txtMemo에 추가

						}

						reader.close();

						

						setTitle(dialog.getFile() + " - 메모장" );

					} catch (Exception e2) {

						JOptionPane.showMessageDialog(this, "열기 오류");

					}
				
			}
		});
	
		}
		

	

		setVisible(true);
	}

	public static void main(String[] args) {
		new Hw03();
	}
}
