import javax.swing.*;
import java.awt.event.*;

public class P22 extends JFrame implements ActionListener{
	private JButton B1;
	private JLabel L1;
	private JTextField T1;

	public P22(){
		setLayout(null);
		L1 = new JLabel("Usuario");
		L1.setBounds(10,10,100,30);
		add(L1);
		
		T1 = new JTextField();
		T1.setBounds(120,17,150,20);
		add(T1);
		
		B1 = new JButton("Aceptar");
		B1.setBounds(10,80,100,30);
		add(B1);
		B1.addActionListener(this); 
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource()==B1){
			String texto = T1.getText();
			setTitle(texto);
		}
	
	}
	
	public static void main(String args[]){
		P22 A = new P22();
		A.setBounds(0,0,300,150);
		A.setLocationRelativeTo(null);
		A.setVisible(true);
		A.setResizable(false);
	}
	
	
}
