import java.awt.*;
import java.awt.event.*;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Timer;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sun Jun 02 21:15:30 CST 2019
 */



/**
 * @author June Chen
 */
public class JForm_Generics {
    public JForm_Generics(){
        initComponents();
    }

    private static String string1="";

    // 泛型方法 printArray 不带返回的方法
    public static < Generics > void printArray( Generics[] inputArray )
    {
        // 输出数组元素
        for ( Generics element : inputArray ){
            string1=string1+element;//由于是泛型使用指定类型的转换函数，element 是如何自动转换成String类型的？？
        }
        string1=string1+"\n";
    }

    // 泛型方法 printArray 带继承，带返回值
    public static <Generics extends Comparable<Generics>> Generics maximum(Generics x, Generics y, Generics z)
    {
        Generics Max = x; // 假设x是初始最大值
        if ( y.compareTo( Max ) > 0 ){
            Max = y; //y 更大
        }
        if ( z.compareTo( Max ) > 0 ){
            Max = z; // 现在 z 更大
        }
        return Max; // 返回最大对象
    }

    private void button1MouseClicked(MouseEvent e) {
        // 创建不同类型数组： Integer, Double 和 Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };

        string1="";
        string1=string1+"Array integerArray contains:" +"\n";
        printArray( intArray  ); // 传递一个整型数组

        textPane1.setText(string1);
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };

        string1="";
        string1=string1+"Array doubleArray contains:" +"\n";
        printArray( doubleArray ); // 传递一个双精度型数组

        textPane1.setText(string1);
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        // 创建不同类型数组： Integer, Double 和 Character
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        string1="";
        string1=string1+"Array characterArray contains:" +"\n";
        printArray( charArray ); // 传递一个字符型型数组

        textPane1.setText(string1);

    }

    private void button4MouseClicked(MouseEvent e) {
        // TODO add your code here
        String string1="";

        string1="Max of 3, 4 and 5 is "+maximum( 3, 4, 5 ) ;

        textPane1.setText(string1);
    }

    private void button5MouseClicked(MouseEvent e) {
        // TODO add your code here
        String string1="";

        string1="Max of 6.6, 8.8 and 7.7 is "+maximum( 6.6, 8.8, 7.7 ) ;

        textPane1.setText(string1);

    }

    private void button6MouseClicked(MouseEvent e) {
        // TODO add your code here
        String string1="";

        string1="Max of pear, apple and orange is "+maximum( "pear", "apple", "orange" );

        textPane1.setText(string1);

    }

    private void button7MouseClicked(MouseEvent e) {
        // TODO add your code here
        Box_Generics_Class<Integer> integerBox = new Box_Generics_Class<Integer>();

        integerBox.put(new Integer(10));

        textPane1.setText(Integer.toString(integerBox.get()));
    }

    private void button8MouseClicked(MouseEvent e) {
        // TODO add your code here
        Box_Generics_Class<Double> doubleBox = new Box_Generics_Class<Double>();

        doubleBox.put(new Double(36.0));

        textPane1.setText(Double.toString(doubleBox.get()));
    }

    private void button9MouseClicked(MouseEvent e) {
        // TODO add your code here
        Box_Generics_Class<String> stringBox = new Box_Generics_Class<String>();

        stringBox.put(new String("By June"));

        textPane1.setText(stringBox.get());
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        scrollPane1 = new JScrollPane();
        textPane1 = new JTextPane();
        button3 = new JButton();
        label1 = new JLabel();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- button1 ----
            button1.setText("integerArray");
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });
            panel1.add(button1);
            button1.setBounds(30, 30, 110, 24);

            //---- button2 ----
            button2.setText("doubleArray");
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });
            panel1.add(button2);
            button2.setBounds(140, 30, 110, 24);

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(textPane1);
            }
            panel1.add(scrollPane1);
            scrollPane1.setBounds(35, 120, 325, 160);

            //---- button3 ----
            button3.setText("charArray");
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button3MouseClicked(e);
                }
            });
            panel1.add(button3);
            button3.setBounds(250, 30, 110, 24);

            //---- label1 ----
            label1.setText(" The data  type of array is different,can use a same generics method.");
            panel1.add(label1);
            label1.setBounds(5, 5, 410, label1.getPreferredSize().height);

            //---- button4 ----
            button4.setText("integerMax");
            button4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button4MouseClicked(e);
                }
            });
            panel1.add(button4);
            button4.setBounds(30, 60, 110, 24);

            //---- button5 ----
            button5.setText("doubleMax");
            button5.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button5MouseClicked(e);
                }
            });
            panel1.add(button5);
            button5.setBounds(140, 60, 110, 24);

            //---- button6 ----
            button6.setText("charMax");
            button6.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button6MouseClicked(e);
                }
            });
            panel1.add(button6);
            button6.setBounds(250, 60, 110, 24);

            //---- button7 ----
            button7.setText("integerClass");
            button7.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button7MouseClicked(e);
                }
            });
            panel1.add(button7);
            button7.setBounds(30, 90, 110, 24);

            //---- button8 ----
            button8.setText("doubleClass");
            button8.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button8MouseClicked(e);
                }
            });
            panel1.add(button8);
            button8.setBounds(140, 90, 110, 24);

            //---- button9 ----
            button9.setText("stringClass");
            button9.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button9MouseClicked(e);
                }
            });
            panel1.add(button9);
            button9.setBounds(250, 90, 110, 24);

            //---- label2 ----
            label2.setText("Method");
            panel1.add(label2);
            label2.setBounds(370, 35, 56, label2.getPreferredSize().height);

            //---- label3 ----
            label3.setText("Class");
            panel1.add(label3);
            label3.setBounds(370, 95, 56, 17);

            //---- label4 ----
            label4.setText("Interface");
            panel1.add(label4);
            label4.setBounds(370, 65, 56, 17);

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
    private JButton button3;
    private JLabel label1;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public void JForm()
    {
        initComponents();
        JFrame f = new JFrame("JForm_Hashtable");
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
