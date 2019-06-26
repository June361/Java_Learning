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
public class JForm_Collection extends JFrame {
    public void JForm_Collection() {
        initComponents();
    }

    List_Collection_Test list_Collection_Test=new List_Collection_Test();


    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here

        Course_Collection_Test course_1=new Course_Collection_Test("1","数据结构");
        list_Collection_Test.getCourse_to_Select().add(course_1);
        Course_Collection_Test Temp_1=(Course_Collection_Test)list_Collection_Test.getCourse_to_Select().get(0);
        System.out.println("添加了课程："+Temp_1.getID()+":"+Temp_1.getName());

        Course_Collection_Test course_2=new Course_Collection_Test("2","C语言");
        list_Collection_Test.getCourse_to_Select().add(course_2);
        Course_Collection_Test Temp_2=(Course_Collection_Test)list_Collection_Test.getCourse_to_Select().get(1);
        System.out.println("添加了课程："+Temp_2.getID()+":"+Temp_2.getName());

        Course_Collection_Test course_3=new Course_Collection_Test("3","高等数学");
        list_Collection_Test.getCourse_to_Select().add(course_3);
        Course_Collection_Test Temp_3=(Course_Collection_Test)list_Collection_Test.getCourse_to_Select().get(2);
        System.out.println("添加了课程："+Temp_3.getID()+":"+Temp_3.getName());

        Course_Collection_Test course_4=new Course_Collection_Test("4","大学英语");
        list_Collection_Test.getCourse_to_Select().add(course_4);
        Course_Collection_Test Temp_4=(Course_Collection_Test)list_Collection_Test.getCourse_to_Select().get(3);
        System.out.println("添加了课程："+Temp_4.getID()+":"+Temp_4.getName());

        Course_Collection_Test course_5=new Course_Collection_Test("5","大学物理");
        list_Collection_Test.getCourse_to_Select().add(course_5);
        Course_Collection_Test Temp_5=(Course_Collection_Test)list_Collection_Test.getCourse_to_Select().get(4);
        System.out.println("添加了课程："+Temp_5.getID()+":"+Temp_5.getName());

        Course_Collection_Test course_6=new Course_Collection_Test("6","汇编语言");
        list_Collection_Test.getCourse_to_Select().add(course_6);
        Course_Collection_Test Temp_6=(Course_Collection_Test)list_Collection_Test.getCourse_to_Select().get(5);
        System.out.println("添加了课程："+Temp_6.getID()+":"+Temp_6.getName());
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        int Size =list_Collection_Test.getCourse_to_Select().size();
        System.out.println("有如下课程待选：");
        for(int i=0;i<Size;i++){
            Course_Collection_Test  course_Collection_Test=(Course_Collection_Test)list_Collection_Test.getCourse_to_Select().get(i);
            System.out.println("课程："+course_Collection_Test.getID()+":"+course_Collection_Test.getName() );
        }
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        Course_Collection_Test course_Collection_Test=new Course_Collection_Test("7","毛概");
        list_Collection_Test.getCourse_to_Select().set(4,course_Collection_Test);
    }

    private void button4MouseClicked(MouseEvent e) {
        // TODO add your code here
        list_Collection_Test.getCourse_to_Select().remove(4);
    }

    private void button5MouseClicked(MouseEvent e) {
        // TODO add your code here
        Course_Collection_Test course_Collection_Test=new Course_Collection_Test("8","大学语文");
        List_Generics  list_Generics=new List_Generics();
        list_Generics.getCourse().add(course_Collection_Test);
        list_Generics.getCourse().add(course_Collection_Test);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        button1 = new JButton();
        scrollPane1 = new JScrollPane();
        textPane1 = new JTextPane();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- button1 ----
            button1.setText("Add_Course_to_Select");
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
            scrollPane1.setBounds(30, 80, 625, 355);

            //---- button2 ----
            button2.setText("Read_Course_to_Select");
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });
            panel1.add(button2);
            button2.setBounds(200, 10, 156, 24);

            //---- button3 ----
            button3.setText("Modify_Course_to_Select");
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button3MouseClicked(e);
                }
            });
            panel1.add(button3);
            button3.setBounds(370, 10, 156, 24);

            //---- button4 ----
            button4.setText("Remove_Course_to_Select");
            button4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button4MouseClicked(e);
                }
            });
            panel1.add(button4);
            button4.setBounds(30, 45, 156, 24);

            //---- button5 ----
            button5.setText("List Generics");
            button5.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button5MouseClicked(e);
                }
            });
            panel1.add(button5);
            button5.setBounds(200, 45, 156, 24);

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
    private JButton button4;
    private JButton button5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public void JForm()
    {
        initComponents();
        JFrame f = new JFrame("JFrom_Object_Equals");
        f.getContentPane().add(panel1);
        f.setSize(700,495);             // 设置组件的大小
        f.setBackground(Color.WHITE);  // 将背景设置成白色
        f.setLocation(300,200);        // 设置组件的显示位置
        f.setLocationRelativeTo( null);
        f.setVisible(true);       // 让组件可见
    }
}
