import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeSelectionModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
/*
 * Created by JFormDesigner on Sun Jun 02 15:30:46 CST 2019
 */



/**
 * @author June Chen
 */
public class JForm_Exception extends JFrame {
    public void JForm_Exception() {

        initComponents();

    }

    //int[]和int...的本质相同（都是字符串数组）。
    //等同于private static int Sum_of_Variable_Arguments(int[] intArrays) 编译无错误
    private static int Test_of_Exception(){
        int divider=10;
        int result=100;

        try {
            while (divider > -1) {
                divider--;
                result = result + 100 / divider;
            }
            return result;
        }catch(Exception event){
            event.printStackTrace();
            System.out.println("循环抛出异常了！");
            return result=999;
        }finally {
            System.out.println("这是finally！！哈哈！！");
            System.out.println("我是result，我的值是"+result);
        }
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        String string1="";

        string1=Integer.toString(Test_of_Exception());
        textPane1.setText(string1);
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        Exception_Chain_Test exception_Chain_Test=new Exception_Chain_Test();
        try {
            exception_Chain_Test.Exception_Test2();
        }catch (Exception e2){
            e2.printStackTrace();
        }
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        try {
            throw new Exception("My Exception");
        } catch (Exception e1) {
            System.err.println("Caught Exception");//System.err.println();输出字体为红色  System.out.println();输出字体为普通黑色
            System.err.println("getMessage():" + e1.getMessage());//获取异常信息
            System.err.println("getLocalizedMessage():"+ e1.getLocalizedMessage());//
            System.err.println("toString():" + e1);//打印整个异常对象
            System.err.println("printStackTrace():");
            e1.printStackTrace();
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        button1 = new JButton();
        scrollPane1 = new JScrollPane();
        textPane1 = new JTextPane();
        button2 = new JButton();
        button3 = new JButton();

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- button1 ----
            button1.setText("Exceptoin");
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });
            panel1.add(button1);
            button1.setBounds(new Rectangle(new Point(30, 10), button1.getPreferredSize()));

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(textPane1);
            }
            panel1.add(scrollPane1);
            scrollPane1.setBounds(30, 45, 625, 390);

            //---- button2 ----
            button2.setText("Exceptoin Chain Test");
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });
            panel1.add(button2);
            button2.setBounds(130, 10, 150, 24);

            //---- button3 ----
            button3.setText("Throw My Exception");
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button3MouseClicked(e);
                }
            });
            panel1.add(button3);
            button3.setBounds(295, 10, 150, 24);

            panel1.setPreferredSize(new Dimension(690, 455));
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JButton button1;
    private JScrollPane scrollPane1;
    private JTextPane textPane1;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public void JForm()
    {
        initComponents();
        JFrame f = new JFrame("JFrom_Exception");
        f.getContentPane().add(panel1);
        f.setSize(700,495);             // 设置组件的大小
        f.setBackground(Color.WHITE);  // 将背景设置成白色
        f.setLocation(300,200);        // 设置组件的显示位置
        f.setLocationRelativeTo( null);
        f.setVisible(true);       // 让组件可见
    }
}
