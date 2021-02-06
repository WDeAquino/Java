import javax.swing.*;
import java.awt.event.*;

public class P20 extends JFrame implements ActionListener{
	JButton boton1;

	public P20(){
		setLayout(null);
		boton1 = new JButton("Cerrar");
		boton1.setBounds(300,250,100,30);
		add(boton1);
		boton1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==boton1){
		System.exit(0);
		}
	}
	public static void main(String args[]){
		P20 Ventana = new P20();
		Ventana.setBounds(0,0,450,350);
		Ventana.setVisible(true);
		Ventana.setResizable(false);
		Ventana.setLocationRelativeTo(null); 
	}
}