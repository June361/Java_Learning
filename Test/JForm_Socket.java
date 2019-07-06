
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
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
public class JForm_Socket extends JFrame {
    public void JForm_Socket() {
        initComponents();
    }

    /**
     * 基于TCP的Socket通信
     * @param e
     */

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        try {
            ServerSocket server_Socket=new ServerSocket(8888);
            System.out.println("The Sever is going to start.");
            Socket socket=server_Socket.accept();
            InputStream inputStream=socket.getInputStream();
            InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
            String information=null;
            while ((information=bufferedReader.readLine())!=null){
                System.out.println("This is server,I want to say"+information);
            }
            socket.shutdownInput();
            bufferedReader.close();
            inputStreamReader.close();
            inputStream.close();
            socket.close();
            server_Socket.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        try {
            Socket socket=new Socket("localhost",8888);
            OutputStream outputStream=socket.getOutputStream();
            PrintWriter printWriter=new PrintWriter(outputStream);
            printWriter.write("Name:Administrator,Password:123");
            printWriter.flush();
            socket.shutdownOutput();
            printWriter.close();
            outputStream.close();
            socket.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        Socket Skt;
        String host = "localhost";

        for (int i = 0; i < 1024; i++) {
            try {
                System.out.println("查看 "+ i);
                Skt = new Socket(host, i);
                System.out.println("端口 " + i + " 已被使用");
            }
            catch (IOException e1) {
            }
        }

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
        scrollPane1 = new JScrollPane();
        textPane1 = new JTextPane();
        button3 = new JButton();

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- button1 ----
            button1.setText("Server");
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });
            panel1.add(button1);
            button1.setBounds(30, 10, 195, button1.getPreferredSize().height);

            //---- button2 ----
            button2.setText("Client");
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });
            panel1.add(button2);
            button2.setBounds(235, 10, 195, 24);

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(textPane1);
            }
            panel1.add(scrollPane1);
            scrollPane1.setBounds(30, 45, 625, 390);

            //---- button3 ----
            button3.setText("Port Check");
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button3MouseClicked(e);
                }
            });
            panel1.add(button3);
            button3.setBounds(445, 10, 195, 24);

            panel1.setPreferredSize(new Dimension(690, 455));
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
