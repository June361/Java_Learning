import java.awt.*;
import java.awt.event.*;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Timer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sun Jun 02 21:15:30 CST 2019
 */



/**
 * @author June Chen
 * @version v1.0
 */
public class JForm_Regular_Expression {
    public JForm_Regular_Expression(){
        initComponents();
    }

    private String text;

    private int Number_of_Mouse_Clicked;

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        String string="";
        // 按指定模式在字符串查找
        if (Number_of_Mouse_Clicked==0) {
            text = textPane1.getText();
        }
        String pattern = "(.*)("+textField1.getText()+")(.*)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(text);
        if (m.find( )) {
            string=string+"Found value: " + m.group(0) +"\n";//返回原有字符串
            string=string+"Found value: " + m.group(1) +"\n";//从后往前查找，返回查找值左边的字符串
            string=string+"Found value: " + m.group(2) +"\n";//返回查找值
            string=string+"Found value: " + m.group(3) +"\n";//从后往前查找，返回查找值右边的字符串
            text =m.group(1);
            Number_of_Mouse_Clicked++;
        } else {
            string=string+"No Match!";
        }
        textPane1.setText(string);

    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here

    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here

    }

    private void button4MouseClicked(MouseEvent e) {
        // TODO add your code here

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
        scrollPane1 = new JScrollPane();
        textPane1 = new JTextPane();
        textField1 = new JTextField();
        textField2 = new JTextField();
        label1 = new JLabel();
        label2 = new JLabel();

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- button1 ----
            button1.setText("Find");
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });
            panel1.add(button1);
            button1.setBounds(35, 30, 75, 24);

            //---- button2 ----
            button2.setText("Replace");
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });
            panel1.add(button2);
            button2.setBounds(35, 60, 75, 24);

            //======== scrollPane1 ========
            {

                //---- textPane1 ----
                textPane1.setText("This order was placed for QT3000! OK?");
                scrollPane1.setViewportView(textPane1);
            }
            panel1.add(scrollPane1);
            scrollPane1.setBounds(35, 95, 325, 185);
            panel1.add(textField1);
            textField1.setBounds(165, 30, 70, 24);
            panel1.add(textField2);
            textField2.setBounds(295, 30, 70, 24);

            //---- label1 ----
            label1.setText("Result");
            panel1.add(label1);
            label1.setBounds(new Rectangle(new Point(245, 35), label1.getPreferredSize()));

            //---- label2 ----
            label2.setText("Text");
            panel1.add(label2);
            label2.setBounds(120, 35, 35, 17);

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

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JScrollPane scrollPane1;
    private JTextPane textPane1;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel label1;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public void JForm()
    {
        initComponents();
        JFrame f = new JFrame("JForm_Regular_Expression");
        f.getContentPane().add(panel1);
        f.setSize(500,340);             // 设置组件的大小
        f.setBackground(Color.WHITE);  // 将背景设置成白色
        f.setLocation(300,200);        // 设置组件的显示位置
        f.setLocationRelativeTo( null);
        f.setVisible(true);            // 让组件可见

        java.util.Timer timer = new Timer();

        timer.  schedule(new java.util.TimerTask()
        {
            public void run()
            {

            }
        }, 0 , 1000);
    }
}
