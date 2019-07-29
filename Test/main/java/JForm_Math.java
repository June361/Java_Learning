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
public class JForm_Math {
    public JForm_Math() {
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        double a=0.0;
        double b=0.0;
        double c=0.0;
        a=Double.valueOf(textField1.getText());
        b=Double.valueOf(textField2.getText());
        c=a+b;
        textField3.setText(Double.toString(c));
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        double a=0.0;
        double b=0.0;
        double c=0.0;
        a=Double.valueOf(textField1.getText());
        b=Double.valueOf(textField2.getText());
        c=a-b;
        textField3.setText(Double.toString(c));
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        double a=0.0;
        double b=0.0;
        double c=0.0;
        a=Double.valueOf(textField1.getText());
        b=Double.valueOf(textField2.getText());
        c=a*b;
        textField3.setText(Double.toString(c));
    }

    private void button4MouseClicked(MouseEvent e) {
        // TODO add your code here
        double a=0.0;
        double b=0.0;
        double c=0.0;
        a=Double.valueOf(textField1.getText());
        b=Double.valueOf(textField2.getText());
        c=a/b;
        textField3.setText(Double.toString(c));
    }

    private void button5MouseClicked(MouseEvent e) {
        // TODO add your code here
        double a=0.0;
        double b=0.0;
        double c=0.0;
        a=Double.valueOf(textField1.getText());
        b=Double.valueOf(textField2.getText());
        c=a%b;
        textField3.setText(Double.toString(c));
    }

    private void button6MouseClicked(MouseEvent e) {
        // TODO add your code here
        double a=0.0;

        a=Double.valueOf(textField1.getText());

        textField3.setText(Double.toString(a++));
    }

    private void button7MouseClicked(MouseEvent e) {
        // TODO add your code here
        double a=0.0;

        a=Double.valueOf(textField1.getText());

        textField3.setText(Double.toString(++a));
    }

    private void button8MouseClicked(MouseEvent e) {
        // TODO add your code here
        double a=0.0;

        a=Double.valueOf(textField1.getText());

        textField3.setText(Double.toString(a--));
    }

    private void button9MouseClicked(MouseEvent e) {
        // TODO add your code here
        double a=0.0;

        a=Double.valueOf(textField1.getText());

        textField3.setText(Double.toString(--a));
    }

    private void button10MouseClicked(MouseEvent e) {
        // TODO add your code here
        double theta=0.0;

        theta=Double.valueOf(textField4.getText());

        textField3.setText(Double.toString(Math.sin(theta*Math.PI/180)));
    }

    private void button11MouseClicked(MouseEvent e) {
        // TODO add your code here
        double theta=0.0;

        theta=Double.valueOf(textField4.getText());

        textField3.setText(Double.toString(Math.cos(theta*Math.PI/180)));
    }

    private void button12MouseClicked(MouseEvent e) {
        // TODO add your code here
        double theta=0.0;

        theta=Double.valueOf(textField4.getText());

        textField3.setText(Double.toString(Math.tan(theta*Math.PI/180)));
    }

    private void button13MouseClicked(MouseEvent e) {
        // TODO add your code here
        double theta=0.0;

        theta=Double.valueOf(textField4.getText());

        textField3.setText(Double.toString(Math.atan(theta*Math.PI/180)));
    }

    private void button14MouseClicked(MouseEvent e) {
        // TODO add your code here
        String string="";
        double[] nums = { 1.4, 1.5, 1.6, -1.4, -1.5, -1.6 };
        for (double num : nums) {
            string=string+"Math.floor(" + num + ")=" +Double.toString(Math.floor(num))+"\n";
            string=string+"Math.round(" + num + ")=" +Double.toString(Math.round(num))+"\n";
            string=string+"Math.ceil(" + num + ")=" +Double.toString(Math.ceil(num))+"\n";
        }
        textPane1.setText(string);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        button1 = new JButton();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        label4 = new JLabel();
        textField4 = new JTextField();
        button10 = new JButton();
        button11 = new JButton();
        button12 = new JButton();
        button13 = new JButton();
        button14 = new JButton();
        scrollPane1 = new JScrollPane();
        textPane1 = new JTextPane();

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- button1 ----
            button1.setText("a+b");
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });
            panel1.add(button1);
            button1.setBounds(45, 120, 75, 24);
            panel1.add(textField1);
            textField1.setBounds(50, 35, 70, 24);
            panel1.add(textField2);
            textField2.setBounds(170, 35, 70, 24);
            panel1.add(textField3);
            textField3.setBounds(50, 75, 310, 24);

            //---- label1 ----
            label1.setText("a");
            panel1.add(label1);
            label1.setBounds(25, 35, 20, 20);

            //---- label2 ----
            label2.setText("b");
            panel1.add(label2);
            label2.setBounds(140, 35, 20, 20);

            //---- label3 ----
            label3.setText("result");
            panel1.add(label3);
            label3.setBounds(10, 75, 45, 20);

            //---- button2 ----
            button2.setText("a-b");
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });
            panel1.add(button2);
            button2.setBounds(125, 120, 75, 24);

            //---- button3 ----
            button3.setText("a*b");
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button3MouseClicked(e);
                }
            });
            panel1.add(button3);
            button3.setBounds(205, 120, 75, 24);

            //---- button4 ----
            button4.setText("a/b");
            button4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button4MouseClicked(e);
                }
            });
            panel1.add(button4);
            button4.setBounds(285, 120, 75, 24);

            //---- button5 ----
            button5.setText("a%b");
            button5.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button5MouseClicked(e);
                }
            });
            panel1.add(button5);
            button5.setBounds(45, 160, 75, 24);

            //---- button6 ----
            button6.setText("a++");
            button6.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button6MouseClicked(e);
                }
            });
            panel1.add(button6);
            button6.setBounds(125, 160, 75, 24);

            //---- button7 ----
            button7.setText("++a");
            button7.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button7MouseClicked(e);
                }
            });
            panel1.add(button7);
            button7.setBounds(205, 160, 75, 24);

            //---- button8 ----
            button8.setText("a--");
            button8.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button8MouseClicked(e);
                }
            });
            panel1.add(button8);
            button8.setBounds(285, 160, 75, 24);

            //---- button9 ----
            button9.setText("--a");
            button9.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button9MouseClicked(e);
                }
            });
            panel1.add(button9);
            button9.setBounds(45, 200, 75, 24);

            //---- label4 ----
            label4.setText("\u03b8\t");
            panel1.add(label4);
            label4.setBounds(260, 35, 20, 20);

            //---- textField4 ----
            textField4.setText("90");
            panel1.add(textField4);
            textField4.setBounds(290, 35, 70, 24);

            //---- button10 ----
            button10.setText("sin(\u03b8)");
            button10.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button10MouseClicked(e);
                }
            });
            panel1.add(button10);
            button10.setBounds(125, 200, 75, 24);

            //---- button11 ----
            button11.setText("cos(\u03b8)");
            button11.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button11MouseClicked(e);
                }
            });
            panel1.add(button11);
            button11.setBounds(205, 200, 75, 24);

            //---- button12 ----
            button12.setText("tan(\u03b8)");
            button12.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button12MouseClicked(e);
                }
            });
            panel1.add(button12);
            button12.setBounds(285, 200, 75, 24);

            //---- button13 ----
            button13.setText("atan(\u03b8)");
            button13.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button13MouseClicked(e);
                }
            });
            panel1.add(button13);
            button13.setBounds(45, 235, 75, 24);

            //---- button14 ----
            button14.setText("Floor Round Ceil");
            button14.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button14MouseClicked(e);
                }
            });
            panel1.add(button14);
            button14.setBounds(125, 235, 235, 24);

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(textPane1);
            }
            panel1.add(scrollPane1);
            scrollPane1.setBounds(50, 270, 310, 430);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel1.getComponentCount(); i++) {
                    Rectangle bounds = panel1.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel1.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel1.setMinimumSize(preferredSize);
                panel1.setPreferredSize(preferredSize);
            }
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JButton button1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JLabel label4;
    private JTextField textField4;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JScrollPane scrollPane1;
    private JTextPane textPane1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public void JForm()
    {
        initComponents();
        JFrame f = new JFrame("Math");
        f.getContentPane().add(panel1);
        f.setSize(500,800);             // 设置组件的大小
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
