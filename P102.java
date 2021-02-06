import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class P102 extends JFrame implements ActionListener{
  private JMenuBar mb;
  private JMenu menuOpciones, menuCalcular, menuColorFondo,menuAcercade;
  private JMenuItem miCalculo, miRojo, miMorado, miNegro, miCreador,miSalir,miNuevo;
  private JLabel labelLogo, labelBienvenida, labelTitle, labelNombre, labelPaterno, labelMaterno, labelDepartamento, labelAntiguedad, labelResultado, labelfooter;
  private JTextField txfNombretrabajador, txfPaterno, txfMaterno;
  private JComboBox comboDepartamento, comboAntiguedad;
  private JScrollPane Scroll;
  private JTextArea Area;
  String usuario2 = "";

  public P102(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Pantalla Principal");
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    getContentPane().setBackground(new Color(255,0,0));
    P100 ventana1 = new P100();
    usuario2 = ventana1.Usuario;

//Barra de tareas
    mb = new JMenuBar();
    mb.setBackground(new Color(255, 0, 0));
    setJMenuBar(mb);

    menuOpciones = new JMenu("Opciones");
    menuOpciones.setBackground(new Color(255,0,0));
    menuOpciones.setFont(new Font("Andale Mono",1,14));
    menuOpciones.setForeground(new Color(255,255,255));
    mb.add(menuOpciones);

    menuCalcular = new JMenu("Calcular");
    menuCalcular.setBackground(new Color(255,0,0));
    menuCalcular.setFont(new Font("Andale Mono",1,14));
    menuCalcular.setForeground(new Color(255,255,255));
    mb.add(menuCalcular);

    menuAcercade = new JMenu("Acerca de...");
    menuAcercade.setBackground(new Color(255,0,0));
    menuAcercade.setFont(new Font("Andale Mono",1,14));
    menuAcercade.setForeground(new Color(255,255,255));
    mb.add(menuAcercade);

    menuColorFondo = new JMenu("Color de Fondo");
    menuColorFondo.setBackground(new Color(255,255,255));
    menuColorFondo.setFont(new Font("Andale Mono",1,14));
    menuColorFondo.setForeground(new Color(255,0,0));
    menuOpciones.add(menuColorFondo);

    miRojo = new JMenuItem("Rojo");
    miRojo.setBackground(new Color(255,255,255));
    miRojo.setFont(new Font("Andale Mono",1,14));
    miRojo.setForeground(new Color(255,0,0));
    miRojo.addActionListener(this);
    menuColorFondo.add(miRojo);

    miMorado = new JMenuItem("Morado");
    miMorado.setBackground(new Color(255,255,255));
    miMorado.setFont(new Font("Andale Mono",1,14));
    miMorado.setForeground(new Color(255,0,0));
    miMorado.addActionListener(this);
    menuColorFondo.add(miMorado);

    miNegro = new JMenuItem("Negro");
    miNegro.setBackground(new Color(255,255,255));
    miNegro.setFont(new Font("Andale Mono",1,14));
    miNegro.setForeground(new Color(255,0,0));
    miNegro.addActionListener(this);
    menuColorFondo.add(miNegro);

    miNuevo = new JMenuItem("Nuevo");
    miNuevo.setBackground(new Color(255,255,255));
    miNuevo.setFont(new Font("Andale Mono",1,14));
    miNuevo.setForeground(new Color(255,0,0));
    miNuevo.addActionListener(this);
    menuOpciones.add(miNuevo);

    miSalir = new JMenuItem("Cerrar sesi\u00f3n");
    miSalir.setBackground(new Color(255,255,255));
    miSalir.setFont(new Font("Andale Mono",1,14));
    miSalir.setForeground(new Color(255,0,0));
    miSalir.addActionListener(this);
    menuOpciones.add(miSalir);

    miCalculo = new JMenuItem("Calcular");
    miCalculo.setBackground(new Color(255,255,255));
    miCalculo.setFont(new Font("Andale Mono",1,14));
    miCalculo.setForeground(new Color(255,0,0));
    miCalculo.addActionListener(this);
    menuCalcular.add(miCalculo);

     miCreador = new JMenuItem("Acerca de...");
     miCreador.setBackground(new Color(255,255,255));
     miCreador.setFont(new Font("Andale Mono",1,14));
     miCreador.setForeground(new Color(255,0,0));
     miCreador.addActionListener(this);
     menuAcercade.add(miCreador);


//Imagen

    ImageIcon imagen = new ImageIcon("images/logo-coca.png");
    labelLogo = new JLabel(imagen);
    labelLogo.setBounds(5,10,250,100);
    add(labelLogo);

//Titulos
    labelBienvenida = new JLabel("Bienvenido "+ usuario2);
    labelBienvenida.setBounds(265,30,250,60);
    labelBienvenida.setFont(new Font("Andale Mono", 3, 20));
    labelBienvenida.setForeground(new Color(255,255,255));
    labelBienvenida.setBackground(new Color(255,0,0));
    add(labelBienvenida);

    labelTitle = new JLabel("Datos del trabajador para el calculo");
    labelTitle.setBounds(120,125,400,30);
    labelTitle.setFont(new Font("Andale Mono", 3, 16));
    labelTitle.setForeground(new Color(255,255,255));
    labelTitle.setBackground(new Color(255,255,0));
    add(labelTitle);
//Ingreso de datos para calculo
    labelNombre = new JLabel("Nombre completo");
    labelNombre.setBounds(45,155,200,30);
    labelNombre.setFont(new Font("Andale Mono", 3, 16));
    labelNombre.setForeground(new Color(255,255,255));
    labelNombre.setBackground(new Color(255,0,0));
    add(labelNombre);

    txfNombretrabajador = new JTextField();
    txfNombretrabajador.setBounds(45,180,200,30);
    add(txfNombretrabajador);


    labelPaterno = new JLabel("Apellido Paterno");
    labelPaterno.setBounds(45,215,200,30);
    labelPaterno.setFont(new Font("Andale Mono", 3, 16));
    labelPaterno.setForeground(new Color(255,255,255));
    labelPaterno.setBackground(new Color(255,0,0));
    add(labelPaterno);

    txfPaterno = new JTextField();
    txfPaterno.setBounds(45,240,200,30);
    add(txfPaterno);


    labelMaterno= new JLabel("Apellido Materno");
    labelMaterno.setBounds(45,275,200,30);
    labelMaterno.setFont(new Font("Andale Mono", 3, 16));
    labelMaterno.setForeground(new Color(255,255,255));
    labelMaterno.setBackground(new Color(255,0,0));
    add(labelMaterno);

    txfMaterno = new JTextField();
    txfMaterno.setBounds(45,300,200,30);
    add(txfMaterno);


    labelDepartamento= new JLabel("Departamento");
    labelDepartamento.setBounds(275,155,200,30);
    labelDepartamento.setFont(new Font("Andale Mono", 3, 16));
    labelDepartamento.setForeground(new Color(255,255,255));
    labelDepartamento.setBackground(new Color(255,0,0));
    add(labelDepartamento);

    comboDepartamento = new JComboBox();
    comboDepartamento.setBounds(275,180,200,30);
    comboDepartamento.setFont(new Font("Andale Mono", 3, 16));
    add(comboDepartamento);
    comboDepartamento.addItem("");
    comboDepartamento.addItem("Atencion al cliente");
    comboDepartamento.addItem("Departamento de Logistica");
    comboDepartamento.addItem("Departamento de gerencia");


    labelAntiguedad= new JLabel("Antiguedad");
    labelAntiguedad.setBounds(275,215,200,30);
    labelAntiguedad.setFont(new Font("Andale Mono", 3, 16));
    labelAntiguedad.setForeground(new Color(255,255,255));
    labelAntiguedad.setBackground(new Color(255,0,0));
    add(labelAntiguedad);

    comboAntiguedad = new JComboBox();
    comboAntiguedad.setBounds(275,240,200,30);
    comboAntiguedad.setFont(new Font("Andale Mono", 3, 16));
    add(comboAntiguedad);
    comboAntiguedad.addItem("");
    comboAntiguedad.addItem("1 año de servicio");
    comboAntiguedad.addItem("2-6 años de servicio");
    comboAntiguedad.addItem("+7 años de servicio");

    labelResultado = new JLabel("Resultado del calculo");
    labelResultado.setBounds(45,340,200,30);
    labelResultado.setFont(new Font("Andale Mono", 3, 16));
    labelResultado.setForeground(new Color(255,255,255));
    labelResultado.setBackground(new Color(255,0,0));
    add(labelResultado);

    Area = new JTextArea();
    Area.setEditable(false);
    Area.setFont(new Font("Andale Mono", 3, 16));
    Scroll = new JScrollPane(Area);
    Scroll.setBounds(45,365,400,100);
    add(Scroll);

  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource()==miNegro){
      getContentPane().setBackground(new Color(0,0,0));
      mb.setBackground(new Color(0, 0, 0));
    }

    if(e.getSource()==miRojo){
      getContentPane().setBackground(new Color(255,0,0));
      mb.setBackground(new Color(255, 0, 0));
    }
    if(e.getSource()==miMorado){
      getContentPane().setBackground(new Color(100,0,100));
      mb.setBackground(new Color(100, 0, 100));
    }
    if(e.getSource()==miCreador){
      JOptionPane.showMessageDialog(null,"Version 1.0 \nDesarrollado por:\nWillinton De Aquino Perez");
    }
    if(e.getSource()==miNuevo){
      txfNombretrabajador.setText("");
      txfPaterno.setText("");
      txfMaterno.setText("");
      Area.setText("");
    }
    if(e.getSource()==miSalir){
      P100 ventanabienvenida = new P100();
      ventanabienvenida.setBounds(0,0,350,450);
      ventanabienvenida.setVisible(true);
      ventanabienvenida.setResizable(true);
      ventanabienvenida.setLocationRelativeTo(null);
      this.setVisible(false);
    }
    if(e.getSource()==miCalculo){

      String nombretrabajador = txfNombretrabajador.getText();
      String AP = txfPaterno.getText();
      String AM = txfMaterno.getText();
      String Depa = comboDepartamento.getSelectedItem().toString();
      String Anti = comboAntiguedad.getSelectedItem().toString();

      if (nombretrabajador.equals("")||AP.equals("")||AM.equals("")||Depa.equals("")||Anti.equals("")){
        JOptionPane.showMessageDialog(null,"LLENA TODOS LOS CAMPOS");
      }else if(Depa.equals("Atencion al cliente")){
        if(Anti.equals("1 año de servicio")){
          Area.setText("El trabajador: "+nombretrabajador+" "+AP+" "+AM+"\nDepartamento: "+Depa+"\nTiene 5 dias de vacaciones");
        }else if(Anti.equals("2-6 años de servicio")){
          Area.setText("El trabajador: "+nombretrabajador+" "+AP+" "+AM+"\nDepartamento: "+Depa+"\nTiene 3 dias de vacaciones");
        }else if(Anti.equals("+7 años de servicio")){
          Area.setText("El trabajador: "+nombretrabajador+" "+AP+" "+AM+"\nDepartamento: "+Depa+"\nTiene 15 dias de vacaciones");
        }
      }else if(Depa.equals("Departamento de Logistica")){
        if(Anti.equals("1 año de servicio")){
          Area.setText("El trabajador: "+nombretrabajador+" "+AP+" "+AM+"\nDepartamento: "+Depa+"\nTiene 5 dias de vacaciones");
        }else if(Anti.equals("2-6 años de servicio")){
          Area.setText("El trabajador: "+nombretrabajador+" "+AP+" "+AM+"\nDepartamento: "+Depa+"\nTiene 3 dias de vacaciones");
        }else if(Anti.equals("+7 años de servicio")){
          Area.setText("El trabajador: "+nombretrabajador+" "+AP+" "+AM+"\nDepartamento: "+Depa+"\nTiene 15 dias de vacaciones");
        }
      }else if(Depa.equals("Departamento de gerencia")){
        if(Anti.equals("1 año de servicio")){
          Area.setText("El trabajador: "+nombretrabajador+" "+AP+" "+AM+"\nDepartamento: "+Depa+"\nTiene 13 dias de vacaciones");
        }else if(Anti.equals("2-6 años de servicio")){
          Area.setText("El trabajador: "+nombretrabajador+" "+AP+" "+AM+"\nDepartamento: "+Depa+"\nTiene 15 dias de vacaciones");
        }else if(Anti.equals("+7 años de servicio")){
          Area.setText("El trabajador: "+nombretrabajador+" "+AP+" "+AM+"\nDepartamento: "+Depa+"\nTiene 25 dias de vacaciones");
        }
      }
    }
  }

  public static void main(String args[]) {
    P102 Principal = new P102();
    Principal.setBounds(0,0,500,550);
    Principal.setVisible(true);
    Principal.setLocationRelativeTo(null);
    Principal.setResizable(false);
  }
}
