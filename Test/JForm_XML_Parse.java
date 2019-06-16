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
public class JForm_XML_Parse extends JFrame {
    public void JForm_XML_Parse() {

        initComponents();

    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here

        String string1="";

        //创建一个DocumentBuilderFactory的对象
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        //创建一个DocumentBuilder的对象
        try {
            //创建DocumentBuilder对象
            DocumentBuilder db = dbf.newDocumentBuilder();

            //通过DocumentBuilder对象的parser方法加载books.xml文件到当前项目下
            Document document = null;
            try {
                document = db.parse("C:\\Users\\Administrator\\IdeaProjects\\June_Chen\\src\\XML_based_properties.xml");
            } catch (org.xml.sax.SAXException e1) {
                e1.printStackTrace();
            }

            //获取所有book节点的集合
            NodeList bookList = document.getElementsByTagName("book");

            //通过nodelist的getLength()方法可以获取bookList的长度
            string1=string1+"一共有" + bookList.getLength() + "本书"+"\n";

            //遍历每一个book节点
            for (int i = 0; i < bookList.getLength(); i++) {
                string1=string1+"=================下面开始遍历第" + (i + 1) + "本书的内容================="+"\n";

                //通过 item(i)方法 获取一个book节点，nodelist的索引值从0开始
                Node book = bookList.item(i);

                //获取book节点的所有属性集合
                NamedNodeMap attrs = book.getAttributes();
                string1=string1+"第 " + (i + 1) + "本书共有" + attrs.getLength() + "个属性"+"\n";

                //遍历book的属性
                for (int j = 0; j < attrs.getLength(); j++) {

                    //通过item(index)方法获取book节点的某一个属性
                    Node attr = attrs.item(j);

                    //获取属性名
                    string1=string1+"属性名：" + attr.getNodeName();

                    //获取属性值
                    string1=string1+"--属性值" + attr.getNodeValue()+"\n";
                }

                //解析book节点的子节点
                NodeList childNodes = book.getChildNodes();

                //遍历childNodes获取每个节点的节点名和节点值
                string1=string1+"第" + (i + 1) + "本书共有" +childNodes.getLength() + "个子节点"+"\n";

                for (int k = 0; k < childNodes.getLength(); k++) {
                    //区分出text类型的node以及element类型的node
                    if (childNodes.item(k).getNodeType() == Node.ELEMENT_NODE) {
                        //获取了element类型节点的节点名
                        string1=string1+"第" + (k + 1) + "个节点的节点名："+ childNodes.item(k).getNodeName();
                        //获取了element类型节点的节点值
                        string1=string1+"--节点值是：" + childNodes.item(k).getFirstChild().getNodeValue()+"\n";
                        //System.out.println("--节点值是：" + childNodes.item(k).getTextContent());
                    }
                }
                string1=string1+"======================结束遍历第" + (i + 1) + "本书的内容================="+"\n";
            }
        } catch (ParserConfigurationException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
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
            button1.setText("XML_Parse");
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

            panel1.setPreferredSize(new Dimension(690, 455));
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
        JFrame f = new JFrame("XML Test");
        f.getContentPane().add(panel1);
        f.setSize(700,495);             // 设置组件的大小
        f.setBackground(Color.WHITE);  // 将背景设置成白色
        f.setLocation(300,200);        // 设置组件的显示位置
        f.setLocationRelativeTo( null);
        f.setVisible(true);            // 让组件可见
    }
}
