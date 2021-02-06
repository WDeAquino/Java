import javax.swing.*;
import java.awt.event.*;

public class P50 extends JFrame implements ItemListener{
	private JComboBox CBx;
	
	public P50(){
	setLayout(null);
	CBx = new JComboBox();
	CBx.setBounds(10,10,80,20);
	add(CBx);

	CBx.addItem("Rojo");
	CBx.addItem("Verde");
	CBx.addItem("Azul");
	CBx.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent e){
		if(e.getSource()==CBx){
			setTitle(CBx.getSelectedItem().toString());
		}
	}
	
	public static void main(String args[]){
	P50 a = new P50();
	a.setBounds(0,0,200,150);
	a.setVisible(true);
	a.setLocationRelativeTo(null);
	a.setResizable(false);
	}
}
