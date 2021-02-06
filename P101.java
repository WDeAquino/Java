import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class P101 extends JFrame implements ActionListener, ChangeListener{
  private JLabel label1, label2;
  private JCheckBox Acepto;
  private JTextArea Terminos;
  private JScrollPane Scroll;
  private JButton Acepto1, NoAcepto;
  String usuario2 = "";

  public P101(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Licencia de uso");
    getContentPane().setBackground(new Color(255,255,255));
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    P100 ventana1 = new P100();
    usuario2 = ventana1.Usuario;

    label1 = new JLabel("Terminos y condiciones");
    label1.setBounds(115,5,300,30);
    label1.setFont(new Font("Andale Mono",1,18));
    label1.setForeground(new Color(0,0,0));
    add(label1);

    Terminos = new JTextArea("\n\n        TERMINOS Y CONDICIONES"+
                             "\n         A. Prohibida la venta de este codigo"+
                             "\n         B. Quedo chido :v ");
    Terminos.setEditable(false);
    Terminos.setFont(new Font("Andale Mono",0,9));
    Scroll = new JScrollPane(Terminos);
    Scroll.setBounds(10,40,540,200);
    add(Scroll);

    Acepto = new JCheckBox("Yo "+ usuario2 +" acepto");
    Acepto.setBounds(10,250,300,30);
    Acepto.setBackground(new Color(255,255,255));
    Acepto.addChangeListener(this);
    add(Acepto);


    Acepto1 = new JButton("Continuar");
    Acepto1.setBounds(10,290,100,30);
    Acepto1.addActionListener(this);
    Acepto1.setEnabled(false);
    add(Acepto1);

    NoAcepto = new JButton("No acepto");
    NoAcepto.setBounds(120,290,100,30);
    NoAcepto.addActionListener(this);
    NoAcepto.setEnabled(true);
    add(NoAcepto);

    ImageIcon image= new ImageIcon("images/coca-cola.png");
    label2 = new JLabel(image);
    label2.setBounds(315,135,300,300);
    add(label2);
  }

  public void stateChanged(ChangeEvent e){
    if (Acepto.isSelected()){
      Acepto1.setEnabled(true);
      NoAcepto.setEnabled(false);
    }else{
      Acepto1.setEnabled(false);
      NoAcepto.setEnabled(true);
    }
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource()==Acepto1){
      P102 Principal = new P102();
      Principal.setBounds(0,0,500,550);
      Principal.setVisible(true);
      Principal.setLocationRelativeTo(null);
      Principal.setResizable(false);
      this.setVisible(false);
    }
    if(e.getSource()==NoAcepto){
      P100 ventanabienvenida = new P100();
      ventanabienvenida.setBounds(0,0,350,450);
      ventanabienvenida.setVisible(true);
      ventanabienvenida.setResizable(true);
      ventanabienvenida.setLocationRelativeTo(null);
      this.setVisible(false);
    }
  }
  public static void main(String[] args) {
    P101 TyC = new P101();
    TyC.setBounds(0,0,600,450);
    TyC.setVisible(true);
    TyC.setLocationRelativeTo(null);
    TyC.setResizable(false);
  }
}
