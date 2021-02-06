import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class P100 extends JFrame implements ActionListener{
  private JTextField Nombre;
  private JLabel label1,label2,label3,label4;
  private JButton Boton1;
  public static String Usuario = "";

  public P100(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Bienvenido");
    getContentPane().setBackground(new Color(255,0,0));
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    ImageIcon imagen = new ImageIcon("images/logo-coca.png");
    label1 = new JLabel(imagen);
    label1.setBounds(25,15,300,150);
    add(label1);

    label2 = new JLabel("Sistema de control vacacional");
    label2.setBounds(35,135,300,30);
    label2.setFont(new Font("Andale Mono", 3, 18));
    label2.setForeground(new Color(255,255,255));
    add(label2);

    label3 = new JLabel("Ingrese su usuario");
    label3.setBounds(45,212,200,30);
    label3.setFont(new Font("Arial",3,14));
    label3.setForeground(new Color(255,255,255));
    add(label3);

    label4 = new JLabel("©2020 The Coca-Cola Company");
    label4.setBounds(85,375,300,30);
    label4.setFont(new Font("Arial",3,14));
    label4.setForeground(new Color(255,255,255));
    add(label3);

    Nombre = new JTextField();
    Nombre.setBounds(45,240,255,25);
    Nombre.setBackground(new Color(255,255,127));
    Nombre.setFont(new Font("Andale Mono",3,14));
    Nombre.setForeground(new Color(255,0,0));
    add(Nombre);

    Boton1 = new JButton("Ingresar");
    Boton1.setBounds(125,280,100,30);
    Boton1.setFont(new Font("Andale Mono",3,14));
    Boton1.setForeground(new Color(255,0,0));
    Boton1.addActionListener(this);
    add(Boton1);
  }
    public void actionPerformed(ActionEvent e){
      if (e.getSource()==Boton1){
        Usuario = Nombre.getText().trim();
        if(Usuario.equals("")){
          JOptionPane.showMessageDialog(null,"INGRESA UN USUARIO");
        }else{
          P101 TyC = new P101();
          TyC.setBounds(0,0,600,450);
          TyC.setVisible(true);
          TyC.setLocationRelativeTo(null);
          TyC.setResizable(false);
          this.setVisible(false);
        }
      }
    }

    public static void main(String args[]){
      P100 ventanabienvenida = new P100();
      ventanabienvenida.setBounds(0,0,350,450);
      ventanabienvenida.setVisible(true);
      ventanabienvenida.setResizable(true);
      ventanabienvenida.setLocationRelativeTo(null);
    }

}
