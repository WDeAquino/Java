import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class P60 extends JFrame implements ActionListener{
	private JMenuBar Menu;
	private JMenu menu1;
	private JMenuItem menuitem1,menuitem2,menuitem3;
	
	public P60(){
		setLayout(null);
		Menu= new JMenuBar();
		setJMenuBar(Menu);

		menu1 = new JMenu("Opciones");
		Menu.add(menu1);
		
		menuitem1 = new JMenuItem("rojo");
		menuitem1.addActionListener(this);
		menu1.add(menuitem1);

		menuitem2 = new JMenuItem("azul");
		menuitem2.addActionListener(this);
		menu1.add(menuitem2);

		menuitem3 = new JMenuItem("verde");
		menuitem3.addActionListener(this);
		menu1.add(menuitem3);
	}

	public void actionPerformed(ActionEvent e){
		Container fondo = this.getContentPane();
		
		if(e.getSource()  == menuitem1){
			fondo.setBackground(new Color(255,0,0));
		}
		if(e.getSource()  == menuitem2){
			fondo.setBackground(new Color(0,0,255));
		}
		if(e.getSource()  == menuitem3){
			fondo.setBackground(new Color(0,255,0));
		}
	}

	public static void main(String args[]){
		P60 a = new P60();
		a.setVisible(true);
		a.setBounds(0,0,400,300);
//		a.setResizable(false);
		a.setLocationRelativeTo(null);
	}
}
