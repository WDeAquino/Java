import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class P70 extends JFrame implements ActionListener{
	private JMenuBar JMB;
	private JMenu JM1, JM2,JM3;
	private JMenuItem JMI1,JMI2,JMI3,JMI4;

	public P70(){
		setLayout(null);
		JMenuBar JMB = new JMenuBar();
		setJMenuBar(JMB);

		JM1 = new JMenu("Opciones");
		JMB.add(JM1);

		JM2 = new JMenu("Tamaño de ventana");
		JM1.add(JM2);

		JM3 = new JMenu("Color de ventana");
		JM1.add(JM3);

		JMI1 = new JMenuItem("350*400");
		JM2.add(JMI1);
		JMI1.addActionListener(this);
	
		JMI2 = new JMenuItem("400*350");
		JM2.add(JMI2);
		JMI2.addActionListener(this);

		JMI3 = new JMenuItem("Verde");
		JM3.add(JMI3);
		JMI3.addActionListener(this);

		JMI4 = new JMenuItem("Rojo");
		JM3.add(JMI4);
		JMI4.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){	
		if(e.getSource() == JMI3){
			getContentPane().setBackground(new Color(0,255,0));
		}	

		if(e.getSource() == JMI4){
			getContentPane().setBackground(new Color(255,0,0));
		}

		if(e.getSource() == JMI1){
			setSize(350,400);
		}	

		if(e.getSource() == JMI2){
			setSize(400,350);
		}

	}

	public static void main(String args[]){
		P70 a = new P70();
		a.setBounds(0,0,200,300);
		a.setVisible(true);
		a.setLocationRelativeTo(null);
		
	}
}















