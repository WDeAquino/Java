import javax.swing.event.*;
import javax.swing.*;

public class P90 extends JFrame implements ChangeListener{
  private JRadioButton JR1,JR2,JR3;
  private ButtonGroup JL1;

  public P90(){
    setLayout(null);
    JL1 = new ButtonGroup();
    JR1 = new JRadioButton("240*360");
    JR1.setBounds(10,10,100,30);
    JR1.addChangeListener(this);
    add(JR1);
    JL1.add(JR1);

    JR2 = new JRadioButton("360*720");
    JR2.setBounds(10,50,100,30);
    JR2.addChangeListener(this);
    add(JR2);
    JL1.add(JR2);

    JR3 = new JRadioButton("1020*720");
    JR3.setBounds(10,90,100,30);
    JR3.addChangeListener(this);
    add(JR3);
    JL1.add(JR3);
  }

  public void stateChanged(ChangeEvent e){
    if(JR1.isSelected()){
      setSize(240,360);
    }
    if(JR2.isSelected()){
      setSize(360,720);
    }
    if(JR3.isSelected()){
      setSize(1020,720);
    }
  }

  public static void main(String args[]){
    P90 a = new P90();
    a.setBounds(0,0,500,500);
    a.setResizable(true);
    a.setVisible(true);
//    a.setLocationRelativeTo(null);
  }

}
