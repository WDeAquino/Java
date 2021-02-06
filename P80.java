import javax.swing.*;
import javax.swing.event.*;

public class P80 extends JFrame implements ChangeListener{
	private JCheckBox Cbes,Cbin;

	public P80(){
		setLayout(null);
		Cbes = new JCheckBox("Español");
		Cbes.setBounds(10,10,150,30);
		Cbes.addChangeListener(this);
		add(Cbes);

		Cbin = new JCheckBox("Inglés");
		Cbin.setBounds(10,50,150,30);
		Cbin.addChangeListener(this);
		add(Cbin);
	}

	public void stateChanged(ChangeEvent e){
		String cad="";
		if(Cbes.isSelected() == true){
			cad=cad+"Español-";
		}
		if(Cbin.isSelected() == true){
			cad=cad+"Inglés-";
		}
		setTitle(cad);
	}

	public static void main(String args[]){
		P80 a =new P80();
		a.setBounds(0,0,350,200);
		a.setVisible(true);
		a.setResizable(false);
		a.setLocationRelativeTo(null);
	}

	
}
