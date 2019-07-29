import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import javax.swing.*;

import javax.mail.*;
import javax.mail.internet.*;

/*
 * Created by JFormDesigner on Sun Jun 02 21:15:30 CST 2019
 */

/**
 * @author June Chen
 * @version v1.0
 */
public class JForm_String_Args {
    public JForm_String_Args(){
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        String string1="";

        string1=string1+"args[0]="+Value_Table_Static.string1+"\n";
        string1=string1+"args[1]="+Value_Table_Static.string2+"\n";
        string1=string1+"args[2]="+Value_Table_Static.string3+"\n";

        textPane1.setText(string1);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        button1 = new JButton();
        scrollPane1 = new JScrollPane();
        textPane1 = new JTextPane();

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- button1 ----
            button1.setText("Print");
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });
            panel1.add(button1);
            button1.setBounds(35, 30, 325, 25);

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(textPane1);
            }
            panel1.add(scrollPane1);
            scrollPane1.setBounds(35, 60, 325, 195);

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
    private JScrollPane scrollPane1;
    private JTextPane textPane1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public void JForm()
    {
        initComponents();
        JFrame f = new JFrame("JForm_String_Args");
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
