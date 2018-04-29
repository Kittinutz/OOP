import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Converter extends JFrame {
	Container container;
	JButton btnConverter;
	JLabel myLabel;
	JTextField myTextField;
	int mycount;
	JTextArea Mytext;

	public Converter(){
		container = getContentPane();
		container.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
		mycount = 1;
		myTextField = new JTextField(Integer.toString(mycount),10); //กล่องข้อความ
		btnConverter = new JButton("Convert!!"); //ปุ่มไอสัส
		myLabel = new JLabel("Distance in miles: "); //ข้อความ
		Mytext = new JTextArea(10,30);
	
		btnConverter.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt) {
				Double newValue = Double.parseDouble(myTextField.getText()); //.gettext "1" 
				String input = myTextField.getText();
				 newValue = newValue * 1.6;
	
		// mycount = newCount;
	
			Mytext.setText(input+" "+"miles "+"equals"+Double.toString(newValue)+" Kilometers");
	
			}
		}); 

		container.add(myLabel); //container add ข้อความ
		container.add(myTextField); //กล่องข้อความ
		container.add(btnConverter); //ปุ่ม
		container.add(Mytext);

		setTitle("Converter");
		setSize(500,600);
		setVisible(true);
	}
	

	public static void main(String args[]){
		new Converter();
	}
}