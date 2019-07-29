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
public class JForm_Primitive_Type {
    public JForm_Primitive_Type() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        textPane1 = new JTextPane();

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(textPane1);
            }
            panel1.add(scrollPane1);
            scrollPane1.setBounds(5, 10, 385, 680);

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
    private JScrollPane scrollPane1;
    private JTextPane textPane1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public void JForm()
    {
        initComponents();
        JFrame f = new JFrame("JForm_Primitive_Type");
        f.getContentPane().add(panel1);
        f.setSize(500,600);             // 设置组件的大小
        f.setBackground(Color.WHITE);  // 将背景设置成白色
        f.setLocation(300,200);        // 设置组件的显示位置
        f.setLocationRelativeTo( null);
        f.setVisible(true);            // 让组件可见


        textPane1.setText(
        "包装类：java.lang.Byte"+'\n'+
        "最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE+'\n'+
        "最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE+'\n'+
        +'\n'+
        // short
        "基本类型：short 二进制位数：" + Short.SIZE+'\n'+
        "包装类：java.lang.Short"+'\n'+
        "最小值：Short.MIN_VALUE=" + Short.MIN_VALUE+'\n'+
        "最大值：Short.MAX_VALUE=" + Short.MAX_VALUE+'\n'+
        +'\n'+

        // int
        "基本类型：int 二进制位数：" + Integer.SIZE+'\n'+
        "包装类：java.lang.Integer"+'\n'+
        "最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE+'\n'+
        "最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE+'\n'+
        +'\n'+

        // long
        "基本类型：long 二进制位数：" + Long.SIZE+'\n'+
        "包装类：java.lang.Long"+'\n'+
        "最小值：Long.MIN_VALUE=" + Long.MIN_VALUE+'\n'+
        "最大值：Long.MAX_VALUE=" + Long.MAX_VALUE+'\n'+
        +'\n'+

        // float
        "基本类型：float 二进制位数：" + Float.SIZE+'\n'+
        "包装类：java.lang.Float"+'\n'+
        "最小值：Float.MIN_VALUE=" + Float.MIN_VALUE+'\n'+
        "最大值：Float.MAX_VALUE=" + Float.MAX_VALUE+'\n'+
        +'\n'+

        // double
        "基本类型：double 二进制位数：" + Double.SIZE+'\n'+
        "包装类：java.lang.Double"+'\n'+
        "最小值：Double.MIN_VALUE=" + Double.MIN_VALUE+'\n'+
        "最大值：Double.MAX_VALUE=" + Double.MAX_VALUE+'\n'+
        +'\n'+

        // char
        "基本类型：char 二进制位数：" + Character.SIZE+'\n'+
        "包装类：java.lang.Character"+'\n'+
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        "最小值：Character.MIN_VALUE="
                + (int) Character.MIN_VALUE+'\n'+
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        "最大值：Character.MAX_VALUE="
                + (int) Character.MAX_VALUE+'\n');

        java.util.Timer timer = new Timer();




        timer.  schedule(new java.util.TimerTask()
        {
            public void run()
            {

            }
        }, 0 , 1000);
    }
}
