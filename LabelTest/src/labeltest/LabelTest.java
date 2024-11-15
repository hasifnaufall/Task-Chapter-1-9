/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labeltest;

/**
 *
 * @author Hasif
 */
import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

public class LabelTest extends JFrame {
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1 , textField2;
    private JButton plainButton , plainButton1 , fancyButton;
    private JTextArea Textbox1;
    private JRadioButton b1, b2, b3, b4 , b5;
    private JCheckBox cb1, cb2 ;
    private JComboBox ComboBox;




   
    public LabelTest(){
       super("testing JLabel");
       Container container = getContentPane();
       container.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
       label1 = new JLabel("it's");
      // label1.setToolTipText("this is label1");
container.add(label1);


       setSize(550,500);
       setVisible(true);
       Icon rabbit = new ImageIcon("fnatic.png");
       label2 = new JLabel("time", rabbit,SwingConstants.LEFT);
       label2.setToolTipText("This is an animated porcupine");
       container.add(label2); 
       
       
        textField1 = new JTextField(10);
        textField1.setPreferredSize(new Dimension(200, 20));
        textField1.setBackground(Color.black);
        textField1.setForeground(Color.white);
        container.add(textField1);

        textField2 = new JTextField(10);
        textField2.setPreferredSize(new Dimension(200, 20));
        textField2.setBackground(Color.yellow);
        textField2.setForeground(Color.black);
        container.add(textField2);
       
       
       plainButton = new JButton("Button");
       container.add(plainButton);
       plainButton1 = new JButton("Sonic");
       container.add(plainButton1);
       plainButton.setSize(50,50) ;
       plainButton1.setSize(150,15) ;
       
       
       Icon bug1 = new ImageIcon("sonic.png");
       fancyButton = new JButton("Fnatic Button", bug1);
       container.add(fancyButton);
       fancyButton.setSize(100,100) ;
       plainButton.setLocation(20,30) ;
       
       Textbox1 = new JTextArea ("Multiple line");
       Textbox1.setSize(100,70);
       Textbox1.setLocation(100,90);
       Textbox1.setBackground(Color.black);
       Textbox1.setForeground(Color.yellow);
       Textbox1.setFont(new
       Font("Bookman",Font.TRUETYPE_FONT,16));
       add(Textbox1);
       
       ButtonGroup group1 = new ButtonGroup();
       b1 = new JRadioButton("Uchiha Kairi");
       b2 = new JRadioButton("Gilak Sanz");
       b3 = new JRadioButton("This is KIBOYY");
       b4 = new JRadioButton("Lutpi!!!");
       b5 = new JRadioButton("Calvin Wanwan");
       b1.setBounds(20,20,200,50);
       b2.setBounds(20,70,200,50);
       b3.setBounds(20,110,200,50);
       b4.setBounds(20,110,200,50);
       b5.setBounds(20,110,200,50);
       container.add(b1);
       container.add(b2);
       container.add(b3);
       container.add(b4);
       container.add(b5);
       
       cb1 = new JCheckBox("CoachYeb");
       cb2 = new JCheckBox("Coach Adi");
       cb1.setBounds(20,20,200,50);
       cb2.setBounds(20,70,200,50);
       add(cb1);
       add(cb2);
       
      String names[]= {"MPL S10","MPL S11","MPL S12"};
      ComboBox = new JComboBox(names);
      ComboBox.setMaximumRowCount(3);
      ComboBox.setBounds(50,50,100,20);
      add(ComboBox);


 

    }
    
    public static void main(String[] args) {
        LabelTest application = new LabelTest();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
