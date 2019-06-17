import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

/*
 * Created by JFormDesigner on Mon May 28 12:39:02 EET 2018
 */


/**
 * @author Talha
 */
public class JForm_By_June extends JPanel
{

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JMenu menu1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton button20;
    private JButton button21;
    private JButton button22;
    private JButton button23;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public JForm_By_June()
    {
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        JForm_XML_Parse jForm_XML_Parse=new JForm_XML_Parse();
        jForm_XML_Parse.JForm();
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        JForm_Timer jForm_Timer=new JForm_Timer();
        jForm_Timer.JForm();
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        JForm_Math jForm_Math=new JForm_Math();
        jForm_Math.JForm();
    }

    private void button8MouseClicked(MouseEvent e) {
        // TODO add your code here
        JForm_Boolean_Ca jForm_Boolean_Ca=new JForm_Boolean_Ca();
        jForm_Boolean_Ca.JForm();
    }

    private void button9MouseClicked(MouseEvent e) {
        // TODO add your code here
        JForm_Bit_Ca jForm_Bit_Ca=new JForm_Bit_Ca();
        jForm_Bit_Ca.JForm();
    }

    private void button10MouseClicked(MouseEvent e) {
        // TODO add your code here
        JForm_Date_And_Time jForm_Date_And_Time=new JForm_Date_And_Time();
        jForm_Date_And_Time.JForm();
    }

    private void button11MouseClicked(MouseEvent e) {
        // TODO add your code here
        JForm_Primitive_Type jForm_Primitive_Type=new JForm_Primitive_Type();
        jForm_Primitive_Type.JForm();
    }

    private void button12MouseClicked(MouseEvent e) {
        // TODO add your code here
        JForm_Logic_Ca jForm_Logic_Ca=new JForm_Logic_Ca();
        jForm_Logic_Ca.JForm();
    }

    private void button13MouseClicked(MouseEvent e) {
        // TODO add your code here
          JForm_Loop jForm_Loop=new JForm_Loop();
          jForm_Loop.JForm();
    }

    private void button14MouseClicked(MouseEvent e) {
        // TODO add your code here
        JForm_IF_Switch jForm_IF_Switch=new JForm_IF_Switch();
        jForm_IF_Switch.JForm();
    }

    private void button15MouseClicked(MouseEvent e) {
        // TODO add your code here
        JForm_Extends jForm_Extends=new JForm_Extends();
        jForm_Extends.JForm();
    }

    private void button16MouseClicked(MouseEvent e) {
        // TODO add your code here
        JForm_Hashtable jForm_Hashtable=new JForm_Hashtable();
        jForm_Hashtable.JForm();
    }

    private void button17MouseClicked(MouseEvent e) {
        // TODO add your code here
        JForm_Generics jForm_Generics=new JForm_Generics();
        jForm_Generics.JForm();
    }

    private void button18MouseClicked(MouseEvent e) {
        // TODO add your code here
        JForm_Regular_Expression jForm_Regular_Expression=new JForm_Regular_Expression();
        jForm_Regular_Expression.JForm();
    }

    private void button19MouseClicked(MouseEvent e) {
        // TODO add your code here
        JForm_Email jForm_Email=new JForm_Email();
        jForm_Email.JForm();
    }

    private void button20MouseClicked(MouseEvent e) {
        // TODO add your code here
        JForm_String_Args jForm_String_Args=new JForm_String_Args();
        jForm_String_Args.JForm();
    }

    private void button21MouseClicked(MouseEvent e) {
        // TODO add your code here
        JForm_JTree jForm_JTree=new JForm_JTree();
        jForm_JTree.JForm();
    }

    private void button22MouseClicked(MouseEvent e) {
        // TODO add your code here
        JForm_Object jForm_Object=new JForm_Object();
        jForm_Object.JForm();
    }

    private void button23MouseClicked(MouseEvent e) {
        // TODO add your code here
        JForm_Variable_Arguments jForm_Variable_Arguments=new JForm_Variable_Arguments();
        jForm_Variable_Arguments.JForm();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        menu1 = new JMenu();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        button10 = new JButton();
        button11 = new JButton();
        button12 = new JButton();
        button13 = new JButton();
        button14 = new JButton();
        button15 = new JButton();
        button16 = new JButton();
        button17 = new JButton();
        button18 = new JButton();
        button19 = new JButton();
        button20 = new JButton();
        button21 = new JButton();
        button22 = new JButton();
        button23 = new JButton();

        //======== this ========
        setLayout(null);

        //---- label1 ----
        label1.setText("Welcome!");
        add(label1);
        label1.setBounds(40, 30, 70, 45);

        //======== menu1 ========
        {
            menu1.setText("Start");
        }
        add(menu1);
        menu1.setBounds(new Rectangle(new Point(0, 0), menu1.getPreferredSize()));

        //---- button1 ----
        button1.setText("XML_Parse");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        add(button1);
        button1.setBounds(35, 95, 100, button1.getPreferredSize().height);

        //---- button2 ----
        button2.setText("Timer");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        add(button2);
        button2.setBounds(35, 130, 100, button2.getPreferredSize().height);

        //---- button3 ----
        button3.setText("Enumeration");
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button3MouseClicked(e);
            }
        });
        add(button3);
        button3.setBounds(35, 165, 100, 24);

        //---- button4 ----
        button4.setText("Math");
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button3MouseClicked(e);
            }
        });
        add(button4);
        button4.setBounds(35, 200, 100, 24);

        //---- button5 ----
        button5.setText("MsSQL");
        button5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button3MouseClicked(e);
            }
        });
        add(button5);
        button5.setBounds(35, 235, 100, 24);

        //---- button6 ----
        button6.setText("Perporties R/W");
        button6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button3MouseClicked(e);
            }
        });
        add(button6);
        button6.setBounds(155, 95, 100, 24);

        //---- button7 ----
        button7.setText("TCP/IP");
        button7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button3MouseClicked(e);
            }
        });
        add(button7);
        button7.setBounds(155, 130, 100, 24);

        //---- button8 ----
        button8.setText("Boolean Ca");
        button8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button8MouseClicked(e);
            }
        });
        add(button8);
        button8.setBounds(155, 165, 100, 24);

        //---- button9 ----
        button9.setText("Bit Ca");
        button9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button9MouseClicked(e);
            }
        });
        add(button9);
        button9.setBounds(155, 200, 100, 24);

        //---- button10 ----
        button10.setText("Date&Time");
        button10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button10MouseClicked(e);
            }
        });
        add(button10);
        button10.setBounds(155, 235, 100, 24);

        //---- button11 ----
        button11.setText("PrimitiveType");
        button11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button11MouseClicked(e);
            }
        });
        add(button11);
        button11.setBounds(270, 95, 100, 24);

        //---- button12 ----
        button12.setText("Logic Ca");
        button12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button12MouseClicked(e);
            }
        });
        add(button12);
        button12.setBounds(270, 130, 100, 24);

        //---- button13 ----
        button13.setText("Loop");
        button13.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button13MouseClicked(e);
            }
        });
        add(button13);
        button13.setBounds(270, 165, 100, 24);

        //---- button14 ----
        button14.setText("IF_Switch");
        button14.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button14MouseClicked(e);
            }
        });
        add(button14);
        button14.setBounds(270, 200, 100, 24);

        //---- button15 ----
        button15.setText("Extends");
        button15.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button15MouseClicked(e);
            }
        });
        add(button15);
        button15.setBounds(270, 235, 100, 24);

        //---- button16 ----
        button16.setText("HashTable");
        button16.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button16MouseClicked(e);
            }
        });
        add(button16);
        button16.setBounds(385, 95, 100, 24);

        //---- button17 ----
        button17.setText("Generics");
        button17.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button17MouseClicked(e);
            }
        });
        add(button17);
        button17.setBounds(385, 130, 100, 24);

        //---- button18 ----
        button18.setText("Regular Ex");
        button18.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button18MouseClicked(e);
            }
        });
        add(button18);
        button18.setBounds(385, 165, 100, 24);

        //---- button19 ----
        button19.setText("Email");
        button19.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button19MouseClicked(e);
            }
        });
        add(button19);
        button19.setBounds(385, 200, 100, 24);

        //---- button20 ----
        button20.setText("String[] args");
        button20.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button20MouseClicked(e);
            }
        });
        add(button20);
        button20.setBounds(385, 235, 100, 24);

        //---- button21 ----
        button21.setText("JTree");
        button21.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button21MouseClicked(e);
            }
        });
        add(button21);
        button21.setBounds(500, 95, 100, 24);

        //---- button22 ----
        button22.setText("Object");
        button22.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button22MouseClicked(e);
            }
        });
        add(button22);
        button22.setBounds(500, 130, 100, 24);

        //---- button23 ----
        button23.setText("Variable args");
        button23.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button23MouseClicked(e);
            }
        });
        add(button23);
        button23.setBounds(500, 165, 100, 24);

        setPreferredSize(new Dimension(705, 300));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    @JForm_By_June_Annotation
    public static void main(String[] args)
    {
        JFrame f = new JFrame("JForm_By_June");

        f.getContentPane().add(new JForm_By_June());
        f.setSize(630,400) ;             // 设置组件的大小
        f.setLocation(300,200) ;                 // 设置组件的显示位置
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setLocationRelativeTo( null);
        f.setVisible(true);

        Value_Table_Static.string1=args[0];
        Value_Table_Static.string2=args[1];
        Value_Table_Static.string3=args[2];
    }
}
