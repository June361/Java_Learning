
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Class;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/*
 * Created by JFormDesigner on Sun Jun 02 15:30:46 CST 2019
 */



/**
 * @author June Chen
 */
public class JForm_Spring_IoC extends JFrame {
    public void JForm_Spring_IoC() {
        initComponents();
    }

    private IoCContainer ioCContainer=new IoCContainer();

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here

        /**
         * 1.所有的依赖关系被集中统一的管理起来，清晰明了
         * 2.每个类只需要关注自己的业务逻辑
         * 3.修改依赖关系将是一件很容易的事情
         */

        ioCContainer.setBean(Audi.class, "audi");
        ioCContainer.setBean(Buick.class, "buick");
        ioCContainer.setBean(ZhangSan.class, "zhangsan","audi");
        ioCContainer.setBean(LiSi.class, "lisi","buick");

        Humen zhangsan=(Humen) ioCContainer.getBean("zhangsan");
        Humen lisi=(Humen) ioCContainer.getBean("lisi");

        zhangsan.HoHome();
        lisi.HoHome();
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Bean bean=applicationContext.getBean("bean",Bean.class);
        System.out.println("bean = "+bean);

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
            button1.setText("Spring Test");
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });
            panel1.add(button1);
            button1.setBounds(30, 10, 205, button1.getPreferredSize().height);

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(textPane1);
            }
            panel1.add(scrollPane1);
            scrollPane1.setBounds(30, 140, 625, 295);

            //---- button2 ----
            button2.setText("Bean Test");
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });
            panel1.add(button2);
            button2.setBounds(240, 10, 205, 24);

            //---- button3 ----
            button3.setText("Bean Test");
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });
            panel1.add(button3);
            button3.setBounds(450, 10, 205, 24);

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
        JFrame f = new JFrame("JFrom_Spring_IoC");
        f.getContentPane().add(panel1);
        f.setSize(700,495);              // 设置组件的大小
        f.setBackground(Color.WHITE);                    // 将背景设置成白色
        f.setLocation(300,200);                  // 设置组件的显示位置
        f.setLocationRelativeTo( null);
        f.setVisible(true);                              // 让组件可见
    }
}
