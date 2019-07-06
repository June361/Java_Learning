
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.*;

/*
 * Created by JFormDesigner on Sun Jun 02 15:30:46 CST 2019
 */



/**
 * @author June Chen
 */
public class JForm_Map extends JFrame {
    public void JForm_Map() {
        initComponents();
    }

    private Map<String,Student_Collection_Test> Student;

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        this.Student =new HashMap<String,Student_Collection_Test>();
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        Scanner console =new Scanner(System.in);
        int i=0;
        while (i<3){
            System.out.println("请输入学生姓名：");
            String ID=console.next();
            Student_Collection_Test st=Student.get(ID);
            if(st==null){
                //提示输入学生姓名
                System.out.println("请输入学生姓名：");
                String name=console.next();
                //创建新的学生对象
                Student_Collection_Test new_Student=new Student_Collection_Test(ID,name);
                //通过调用Students的put方法，添加ID-学生映射
                

            }

        }
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
            button1.setText("Add_Course_to_Select<List>");
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });
            panel1.add(button1);
            button1.setBounds(new Rectangle(new Point(30, 10), button1.getPreferredSize()));

            //---- button2 ----
            button2.setText("Read_Course_to_Select");
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });
            panel1.add(button2);
            button2.setBounds(235, 10, 195, 24);

            //---- button3 ----
            button3.setText("Modify_Course_to_Select");
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button3MouseClicked(e);
                }
            });
            panel1.add(button3);
            button3.setBounds(445, 10, 195, 24);

            //---- button4 ----
            button4.setText("Remove_Course_to_Select");
            button4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button4MouseClicked(e);
                }
            });
            panel1.add(button4);
            button4.setBounds(30, 45, 195, 24);

            //---- button5 ----
            button5.setText("List Generics");
            button5.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button5MouseClicked(e);
                }
            });
            panel1.add(button5);
            button5.setBounds(235, 45, 195, 24);

            //---- button6 ----
            button6.setText("Add_Course_to_Select<Set>");
            button6.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button6MouseClicked(e);
                }
            });
            panel1.add(button6);
            button6.setBounds(445, 45, 195, 24);

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(textPane1);
            }
            panel1.add(scrollPane1);
            scrollPane1.setBounds(30, 80, 625, 355);

            panel1.setPreferredSize(new Dimension(690, 455));
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

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
        JFrame f = new JFrame("JFrom_Object_Equals");
        f.getContentPane().add(panel1);
        f.setSize(700,495);             // 设置组件的大小
        f.setBackground(Color.WHITE);  // 将背景设置成白色
        f.setLocation(300,200);        // 设置组件的显示位置
        f.setLocationRelativeTo( null);
        f.setVisible(true);       // 让组件可见
    }
}
