import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sun Jun 02 21:15:30 CST 2019
 */



/**
 * @author June Chen
 */
public class JForm_Date_And_Time {
    public JForm_Date_And_Time() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();

        //======== panel1 ========
        {
            panel1.setLayout(null);
            panel1.add(textField1);
            textField1.setBounds(130, 35, 270, 24);
            panel1.add(textField2);
            textField2.setBounds(130, 70, 270, 24);
            panel1.add(textField3);
            textField3.setBounds(130, 105, 270, 24);

            //---- label1 ----
            label1.setText("Current Date:");
            panel1.add(label1);
            label1.setBounds(10, 35, 90, 20);

            //---- label2 ----
            label2.setText("SimpleDateFormat:");
            panel1.add(label2);
            label2.setBounds(10, 70, 115, 20);

            //---- label3 ----
            label3.setText("Current Date/Time:");
            panel1.add(label3);
            label3.setBounds(10, 105, 115, 20);

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
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public void JForm()
    {
        initComponents();
        JFrame f = new JFrame("Date_and_Time");
        f.getContentPane().add(panel1);
        f.setSize(500,300);             // 设置组件的大小
        f.setBackground(Color.WHITE);  // 将背景设置成白色
        f.setLocation(300,200);        // 设置组件的显示位置
        f.setLocationRelativeTo( null);
        f.setVisible(true);            // 让组件可见

        java.util.Timer timer = new Timer();

        timer.  schedule(new java.util.TimerTask()
        {
            public void run()
            {
                Date date = new Date();
                textField1.setText(date.toString());

                SimpleDateFormat ft =new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
                textField2.setText(ft.format(date));

                String str = String.format("%tc", date );
                textField3.setText(str);
            }
        }, 0 , 1000);
    }
}
