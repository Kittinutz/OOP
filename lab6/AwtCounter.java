import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AwtCounter extends JFrame implements ActionListener{
	JButton btnAdd;
	JLabel myLabel;
	JTextField myTextField;
	Container c;
	int mycount;

	public AwtCounter(){
		c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));

		mycount = 8;
		btnAdd = new JButton("btnAdd");
		myLabel = new JLabel("Counter: ");
		myTextField = new JTextField(Integer.toString(mycount),10);

		btnAdd.addActionListener(this);

		c.add(myLabel);
		c.add(myTextField);
		c.add(btnAdd);

		setTitle("Buttons In Action");
		setSize(300,100);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		String str = e.getActionCommand();
		int newCount = mycount + 1;
		mycount = newCount;
		if(str.equals("btnAdd")){
			myTextField.setText(Integer.toString(newCount));
		}
	}

	public static void main(String args[]){
		new AwtCounter();
	}
}