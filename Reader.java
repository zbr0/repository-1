import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Reader extends JFrame{
	JButton b1, b2;
	JLabel l1, l2, l3, l4;
	JTextField t1, t2;
	int i, k;
	String a, b;
	public Reader(String s){
		super(s);
		setLayout(new FlowLayout());
		b1 = new JButton("��������");
		b2 = new JButton("���������");
		l1 = new JLabel("������� ������ �����");
		l2 = new JLabel("������� ������ �����");
		l3 = new JLabel("");
		l4 = new JLabel("");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		
		add(l2);
		add(t2);
		add(l1);
		add(t1);
		add(t1);
		add(b2);
		add(b1);
		
	}
}
