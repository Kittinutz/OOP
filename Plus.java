import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Plus extends JFrame implements ActionListener{
	Container con;
	JTextField a,b;
	JTextArea c;
	JButton btn;
	JLabel d;
	int n,m;

	public Plus(){
		con = getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		n = 0;
		m = 0;
		a = new JTextField(Integer.toString(n),10);
		b = new JTextField(Integer.toString(m),10);
		btn = new JButton("Go");
		d = new JLabel("Plus Elegator:");
		c = new JTextArea(10,10);

		btn.addActionListener(this);

		con.add(a);
		con.add(b);
		con.add(c);
		con.add(btn);
		con.add(d);

		setTitle("++Elegator++");
		setSize(10,10);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		String str = e.getActionCommand();
		int x = Integer.parseInt(a.getText());
		int y = Integer.parseInt(b.getText());
		String in = a.getText();
		String put = b.getText();
		 x = x+y;

		if(str.equals("Go")){
			c.setText("result is "+Integer.toString(x));
		}
	}

	public static void main(String arg[]){
		new Plus();
	}
}