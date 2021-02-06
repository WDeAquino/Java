import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class P51 extends JFrame implements ActionListener{
	private JLabel R1,G1,B1;
	private JComboBox CBR,CBG,CBB;
	private JButton BTN;

	public P51(){
		setLayout(null);
		R1 = new JLabel("Rojo: ");
		R1.setBounds(10,10,50,30);
		add(R1);
		G1 = new JLabel("Verde: ");
		G1.setBounds(10,50,50,30);
		add(G1);
		B1 = new JLabel("Azul: ");
		B1.setBounds(10,90,50,30);
		add(B1);

		CBR = new JComboBox();
		CBR.setBounds(100,10,50,30);
		for(int i=0;i<256;i++){
			CBR.addItem(String.valueOf(i));
		}
		add(CBR);
		CBG = new JComboBox();
		CBG.setBounds(100,50,50,30);
		for(int i=0;i<256;i++){
			CBG.addItem(String.valueOf(i));
		}
		add(CBG);
		CBB = new JComboBox();
		CBB.setBounds(100,90,50,30);
		for(int i=0;i<256;i++){
			CBB.addItem(String.valueOf(i));	
		}
		add(CBB);
		
		BTN = new JButton("Mezclar");
		BTN.setBounds(100,160,100,40);
		add(BTN);
		BTN.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == BTN){
			String box1 = CBR.getSelectedItem().toString();
			String box2 = CBG.getSelectedItem().toString();
			String box3 = CBB.getSelectedItem().toString();

			int rojo = Integer.parseInt(box1);
			int verde = Integer.parseInt(box2); 
			int azul=Integer.parseInt(box3);
			
			Color color1 = new Color(rojo,verde,azul);
			BTN.setBackground(color1);
		}
	}	
	
	public static void main(String args[]){
		P51 a = new P51();
		a.setBounds(0,0,300,300);
		a.setVisible(true);
		a.setResizable(false);
		a.setLocationRelativeTo(null);
	}

	
}
