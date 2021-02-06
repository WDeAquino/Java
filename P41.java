import javax.swing.*;
import java.awt.event.*;

public class P41 extends JFrame implements ActionListener{

	private JTextField TxF;
	private JTextArea TxA;
	private JScrollPane SrP;
	private JButton BtN;

	public P41(){
		setLayout(null);
		TxF =new JTextField();
		TxF.setBounds(10,10,200,30);
		add(TxF);

		BtN = new JButton("Agregar");
		BtN.setBounds(200,10,90,30);
		add(BtN);
		BtN.addActionListener(this);	
		
		TxA = new JTextArea();
		SrP = new JScrollPane(TxA);
		SrP.setBounds(10,50,300,400);
		add(SrP);	
	}
	
	public void actionPerformed(ActionEvent e){
		if (e.getSource() == BtN){
			TxA.setText(TxA.getText()+"\n"+TxF.getText());
			TxF.setText("");
		}
	}
	
	public static void main(String args[]){
		P41 a = new P41();
		a.setBounds(0,0,540,550);
		a.setVisible(true);
		a.setLocationRelativeTo(null);
		a.setResizable(false);
	}		
}
