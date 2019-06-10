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
public class JForm_Logic_Ca {
    public JForm_Logic_Ca() {
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        boolean a;
        boolean b;
        boolean c;
        a=Boolean.valueOf(textField1.getText());
        b=Boolean.valueOf(textField2.getText());
        c=a&&b;
        textField3.setText(Boolean.toString(c));
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        boolean a;
        boolean b;
        boolean c;
        a=Boolean.valueOf(textField1.getText());
        b=Boolean.valueOf(textField2.getText());
        c=a||b;
        textField3.setText(Boolean.toString(c));
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        boolean a;
        boolean b;
        boolean c;
        a=Boolean.valueOf(textField1.getText());
        b=Boolean.valueOf(textField2.getText());
        c=!(a||b);
        textField3.setText(Boolean.toString(c));
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

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- button1 ----
            button1.setText("a&&b");
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });
            panel1.add(button1);
            button1.setBounds(35, 135, 75, 24);

            //---- textField1 ----
            textField1.setText("true");
            panel1.add(textField1);
            textField1.setBounds(35, 35, 70, 24);

            //---- textField2 ----
            textField2.setText("fasle");
            panel1.add(textField2);
            textField2.setBounds(160, 35, 70, 24);
            panel1.add(textField3);
            textField3.setBounds(310, 35, 70, 24);

            //---- label1 ----
            label1.setText("a");
            panel1.add(label1);
            label1.setBounds(10, 35, 20, 20);

            //---- label2 ----
            label2.setText("b");
            panel1.add(label2);
            label2.setBounds(115, 35, 20, 20);

            //---- label3 ----
            label3.setText("result");
            panel1.add(label3);
            label3.setBounds(260, 35, 45, 20);

            //---- button2 ----
            button2.setText("a||b");
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });
            panel1.add(button2);
            button2.setBounds(115, 135, 75, 24);

            //---- button3 ----
            button3.setText("!(a&&b)");
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button3MouseClicked(e);
                }
            });
            panel1.add(button3);
            button3.setBounds(195, 135, 75, 24);

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
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public void JForm()
    {
        initComponents();
        JFrame f = new JFrame("Bit_Ca");
        f.getContentPane().add(panel1);
        f.setSize(500,300);             // 设置组件的大小
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
