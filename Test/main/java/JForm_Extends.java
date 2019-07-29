import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sun Jun 02 21:15:30 CST 2019
 */



/**
 * @author June Chen
 */
public class JForm_Extends {
    public JForm_Extends() {
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        Biology biology=new Biology("Male",12);
        textPane1.setText(biology.Age());
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        Animal animal=new Animal("Animal",15,"Male",12);
        textPane1.setText(animal.introduction());
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        Penguin penguin=new Penguin("Penguin",12,"Female",5);
        textPane1.setText(penguin.introduction());
    }

    private void button4MouseClicked(MouseEvent e) {
        // TODO add your code here
        Biology biology=new Biology("Male",12);
        textPane1.setText(biology.introduction());
    }

    private void button5MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button6MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button7MouseClicked(MouseEvent e) {
        // TODO add your code here
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        scrollPane1 = new JScrollPane();
        textPane1 = new JTextPane();

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- button1 ----
            button1.setText("Biology Age");
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });
            panel1.add(button1);
            button1.setBounds(35, 15, 160, 24);

            //---- button2 ----
            button2.setText("Animal Instruction");
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });
            panel1.add(button2);
            button2.setBounds(35, 55, 160, 24);

            //---- button3 ----
            button3.setText("Penguin Instruction");
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button3MouseClicked(e);
                }
            });
            panel1.add(button3);
            button3.setBounds(205, 55, 160, 24);

            //---- button4 ----
            button4.setText("Biology Instruction");
            button4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button4MouseClicked(e);
                }
            });
            panel1.add(button4);
            button4.setBounds(205, 15, 160, 24);

            //---- button5 ----
            button5.setText("Animal Override");
            button5.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button5MouseClicked(e);
                }
            });
            panel1.add(button5);
            button5.setBounds(35, 90, 160, 24);

            //---- button6 ----
            button6.setText("a>>2");
            button6.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button6MouseClicked(e);
                }
            });
            panel1.add(button6);
            button6.setBounds(205, 90, 160, 24);

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(textPane1);
            }
            panel1.add(scrollPane1);
            scrollPane1.setBounds(40, 130, 325, 145);

            panel1.setPreferredSize(new Dimension(400, 300));
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JScrollPane scrollPane1;
    private JTextPane textPane1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public void JForm()
    {
        initComponents();
        JFrame f = new JFrame("JForm_Extends");
        f.getContentPane().add(panel1);
        f.setSize(400,330);             // 设置组件的大小
        f.setBackground(Color.WHITE);  // 将背景设置成白色
        f.setLocation(300,200);        // 设置组件的显示位置
        f.setLocationRelativeTo( null);
        f.setVisible(true);            // 让组件可见

        java.util.Timer timer = new Timer();

        Value_Table_Static.a=0;

        timer.  schedule(new java.util.TimerTask()
        {
            public void run()
            {

            }
        }, 0 , 1000);
    }

}
