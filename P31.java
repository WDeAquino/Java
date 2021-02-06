import javax.swing.*;

public class P31 extends JFrame{
	private JTextField TxF;
	private JScrollPane SrP;
	private JTextArea TxA;
	
	public P31(){
		setLayout(null);
		TxF = new JTextField();
		TxF.setBounds(10,10,200,30);
		add(TxF);
		
		TxA = new JTextArea();
		SrP = new JScrollPane(TxA);
		SrP.setBounds(10,50,400,300);
		add(SrP);	
	}

	public static void main(String args[]){
		P31 A = new P31();
		A.setBounds(0,0,540,400);
		A.setVisible(true);
		A.setResizable(false);
		A.setLocationRelativeTo(null);
	}

}
