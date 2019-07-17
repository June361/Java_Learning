
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
public class JForm_File extends JFrame {
    public void JForm_File() {
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("My_File.txt"));
            bufferedWriter.write("June Chen");
            bufferedWriter.close();
            System.out.println("The file is be created.");
        }
        catch (IOException e1) {
        }
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        try {
            BufferedReader bufferedReader = new BufferedReader (new FileReader("My_File.txt"));
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(str);
            }
            System.out.println(str);
        } catch (IOException e1) {
        }

    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        try{
            File file = new File("c:\\test.txt");
            if(file.delete()){
                System.out.println(file.getName() + " 文件已被删除！");
            }else{
                System.out.println("文件删除失败！");
            }
        }catch(Exception e1){
            e1.printStackTrace();
        }

    }

    private void button4MouseClicked(MouseEvent e) {
        // TODO add your code here
        String directories = "D:\\a\\b\\c\\d\\e\\f\\g\\h\\i";
        File file = new File(directories);
        boolean result = file.mkdirs();
        System.out.println("Status = " + result);

    }

    private void button5MouseClicked(MouseEvent e) {
        // TODO add your code here
        File file = new File("C:\\Users\\Administrator\\IdeaProjects\\June_Chen\\src");
        if (file.isDirectory()) {
            String[] files = file.list();
            if (files.length > 0) {
                System.out.println("目录 " + file.getPath() +" 不为空！");
            }else {
                System.out.println("files.length=0");
            }
        }else {
            System.out.println("file.isDirectory()=False");
        }
    }

    private void button6MouseClicked(MouseEvent e) {
        // TODO add your code here
        File file = new File("C:\\Users\\Administrator\\IdeaProjects\\June_Chen\\src\\Animal.java");
        System.out.println(file.isHidden());
    }

    private void button7MouseClicked(MouseEvent e) {
        // TODO add your code here
        File dir = new File("C:\\Users\\Administrator\\IdeaProjects\\June_Chen\\src");
        String[] children = dir.list();
        if (children == null) {
            System.out.println( "目录不存在或它不是一个目录");
        }
        else {
            for (int i=0; i< children.length; i++) {
                String filename = children[i];
                System.out.println(filename);
            }
        }
    }

    static void showDir(int indent, File file) throws IOException {
        for (int i = 0; i < indent; i++)
            System.out.print('-');
        System.out.println(file.getName());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++)
                showDir(indent + 4, files[i]);
        }
    }

    private void button8MouseClicked(MouseEvent e) {
        // TODO add your code here
        try {
            showDir(1, new File("C:\\Users\\Administrator\\IdeaProjects\\June_Chen"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    private void button9MouseClicked(MouseEvent e) {
        // TODO add your code here
        File dir = new File("C:\\Users\\Administrator\\IdeaProjects\\June_Chen");
        File[] files = dir.listFiles();
        FileFilter fileFilter = new FileFilter() {
            public boolean accept(File file) {
                return file.isDirectory();
            }
        };
        files = dir.listFiles(fileFilter);
        System.out.println(files.length);
        if (files.length == 0) {
            System.out.println("目录不存在或它不是一个目录");
        }
        else {
            for (int i=0; i< files.length; i++) {
                File filename = files[i];
                System.out.println(filename.toString());
            }
        }
    }

    private void button10MouseClicked(MouseEvent e) {
        // TODO add your code here
        System.out.println("遍历目录");
        File dir = new File("C:\\Users\\Administrator\\IdeaProjects\\June_Chen\\src"); //要遍历的目录
        System.out.println(dir);
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                new File(dir, children[i]);
            }
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        scrollPane1 = new JScrollPane();
        textPane1 = new JTextPane();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        button10 = new JButton();

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- button1 ----
            button1.setText("Create File");
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });
            panel1.add(button1);
            button1.setBounds(30, 10, 195, button1.getPreferredSize().height);

            //---- button2 ----
            button2.setText("Read File");
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
            scrollPane1.setBounds(30, 195, 625, 240);

            //---- button3 ----
            button3.setText("Delete File");
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button3MouseClicked(e);
                }
            });
            panel1.add(button3);
            button3.setBounds(445, 10, 195, 24);

            //---- button4 ----
            button4.setText("mkdirs()");
            button4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button4MouseClicked(e);
                }
            });
            panel1.add(button4);
            button4.setBounds(30, 50, 195, 24);

            //---- button5 ----
            button5.setText("file.isDirectory()");
            button5.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button5MouseClicked(e);
                }
            });
            panel1.add(button5);
            button5.setBounds(235, 50, 195, 24);

            //---- button6 ----
            button6.setText("file.isHidden()");
            button6.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button6MouseClicked(e);
                }
            });
            panel1.add(button6);
            button6.setBounds(445, 50, 195, 24);

            //---- button7 ----
            button7.setText("dir.list()");
            button7.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button7MouseClicked(e);
                }
            });
            panel1.add(button7);
            button7.setBounds(30, 90, 195, 24);

            //---- button8 ----
            button8.setText("file.getName()");
            button8.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button8MouseClicked(e);
                }
            });
            panel1.add(button8);
            button8.setBounds(235, 90, 195, 24);

            //---- button9 ----
            button9.setText("dir.listFiles()");
            button9.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button9MouseClicked(e);
                }
            });
            panel1.add(button9);
            button9.setBounds(445, 90, 195, 24);

            //---- button10 ----
            button10.setText("dir.isDirectory()");
            button10.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button10MouseClicked(e);
                }
            });
            panel1.add(button10);
            button10.setBounds(30, 130, 195, 24);

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
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public void JForm()
    {
        initComponents();
        JFrame f = new JFrame("JFrom_File");
        f.getContentPane().add(panel1);
        f.setSize(700,495);             // 设置组件的大小
        f.setBackground(Color.WHITE);  // 将背景设置成白色
        f.setLocation(300,200);        // 设置组件的显示位置
        f.setLocationRelativeTo( null);
        f.setVisible(true);       // 让组件可见
    }
}
