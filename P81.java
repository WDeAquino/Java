import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class P81 extends JFrame implements ActionListener, ChangeListener{
	private JLabel JL1;
	private JCheckBox JCB;
	private JButton BTN;

	public P81(){
		setLayout(null);
		JL1 = new JLabel("Aceptar terminos y condiciones");
		JL1.setBounds(10,10,400,30);
		add(JL1);

		JCB = new JCheckBox("Acepto");
		JCB.setBounds(50,50,100,30);
		JCB.addChangeListener(this);
		add(JCB);

		BTN = new JButton("Continuar");
		BTN.setBounds(30,100,100,30);
		add(BTN);
		BTN.addActionListener(this);
		BTN.setEnabled(false);
	}

	public void stateChanged(ChangeEvent e){
		if(JCB.isSelected()==true){
			BTN.setEnabled(true);
		}else{
			BTN.setEnabled(false);
		}
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource()==BTN){
			System.exit(0);
		}		
	}

	public static void main(String args[]){
		P81 a =new P81();
		a.setBounds(0,0,500,300);
		a.setVisible(true);
		a.setResizable(false);
		a.setLocationRelativeTo(null);
	}
}
