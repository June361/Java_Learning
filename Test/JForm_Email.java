import java.awt.*;
import java.awt.event.*;
import java.util.Properties;
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
public class JForm_Email {
    public JForm_Email(){
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
            // 收件人电子邮箱
            String to = textField2.getText();

            // 发件人电子邮箱
            String from = textField1.getText();

        // 指定发送邮件的主机为 localhost
        String host = "smtp.qq.com";  //QQ 邮件服务器

        // 获取系统属性
        Properties properties = System.getProperties();

        // 设置邮件服务器
        properties.setProperty("mail.smtp.host", host);

        properties.put("mail.smtp.auth", "true");
        // 获取默认session对象
        Session session = Session.getDefaultInstance(properties,new Authenticator(){
            public PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication("512646617@qq.com", "zhebirfxezfxcajf"); //发件人邮件用户名、密码
            }
        });

        try{
            // 创建默认的 MimeMessage 对象
            MimeMessage message = new MimeMessage(session);

            // Set From: 头部头字段
            message.setFrom(new InternetAddress(from));

            // Set To: 头部头字段
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));

            // Set Subject: 头部头字段
            message.setSubject(textField3.getText());

            // 设置消息体
            message.setText(textPane1.getText());

            // 发送消息
            Transport.send(message);
            textField4.setText("Successful delivery.");
        }catch (MessagingException mex) {
            mex.printStackTrace();
        }
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
        scrollPane1 = new JScrollPane();
        textPane1 = new JTextPane();
        textField1 = new JTextField();
        textField2 = new JTextField();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        textField3 = new JTextField();
        label4 = new JLabel();
        textField4 = new JTextField();

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- button1 ----
            button1.setText("Send");
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });
            panel1.add(button1);
            button1.setBounds(285, 30, 75, 55);

            //======== scrollPane1 ========
            {

                //---- textPane1 ----
                textPane1.setText("This is a email from QQ email.");
                scrollPane1.setViewportView(textPane1);
            }
            panel1.add(scrollPane1);
            scrollPane1.setBounds(35, 125, 325, 130);

            //---- textField1 ----
            textField1.setText("512646617@qq.com");
            panel1.add(textField1);
            textField1.setBounds(75, 30, 205, 24);

            //---- textField2 ----
            textField2.setText("867041091@qq.com");
            panel1.add(textField2);
            textField2.setBounds(75, 60, 205, 24);

            //---- label1 ----
            label1.setText("To");
            panel1.add(label1);
            label1.setBounds(new Rectangle(new Point(35, 65), label1.getPreferredSize()));

            //---- label2 ----
            label2.setText("From");
            panel1.add(label2);
            label2.setBounds(35, 35, 35, 17);

            //---- label3 ----
            label3.setText("Theme");
            panel1.add(label3);
            label3.setBounds(35, 95, 45, 17);

            //---- textField3 ----
            textField3.setText("This is a email from QQ email.");
            panel1.add(textField3);
            textField3.setBounds(75, 90, 285, 24);

            //---- label4 ----
            label4.setText("Status");
            panel1.add(label4);
            label4.setBounds(35, 270, 45, 17);
            panel1.add(textField4);
            textField4.setBounds(75, 265, 285, 24);

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
    private JTextField textField1;
    private JTextField textField2;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField textField3;
    private JLabel label4;
    private JTextField textField4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public void JForm()
    {
        initComponents();
        JFrame f = new JFrame("JForm_Email");
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
