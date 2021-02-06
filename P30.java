import javax.swing.*;

public class P30 extends JFrame{
	private JTextField tf1;
	private JTextArea Ta1;
	
	public P30(){
	setLayout(null);
	tf1 = new JTextField();
	tf1.setBounds(10,10,200,30);
	add(tf1);

	Ta1 = new JTextArea();
	Ta1.setBounds(10,50,400,300);
	add(Ta1);	
	}
	
	public static void main(String args[]){
	P30 a = new P30();
	a.setBounds(0,0,450,600);
	a.setVisible(true);
	a.setLocationRelativeTo(null);
	a.setResizable(false);
	}

}
