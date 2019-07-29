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
public class JForm_JTree extends JFrame {
    public void JForm_JTree() {

        initComponents();

    }

    private void button1MouseClicked(MouseEvent e) {

        // TODO add your code here
        // 构造函数：JTree()
        JTree example1  =   new  JTree();

        // 构造函数：JTree(Object[] value)
        Object[] letters =  { " a " ,  " b " ,  " c " ,  " d " ,  " e " };
        JTree example2  =   new  JTree (letters);

        // 构造函数：JTree(TreeNode root)(TreeNode空)
        // 用空结点创建树
        DefaultMutableTreeNode node1  =   new  DefaultMutableTreeNode(); // 定义树结点
        JTree example3  =   new  JTree (node1); // 用此树结点做参数调用 JTree的构造函数创建含有一个根结点的树

        // 构造函数：JTree(TreeNode root)(同上,只是TreeNode非空)
        // 用一个根结点创建树
        DefaultMutableTreeNode node2  =   new  DefaultMutableTreeNode( " Color " );
        JTree example4  =   new  JTree (node2); // 结点不可以颜色,默认为白面黑字
        example4.setBackground (Color.pink);

        // 构造函数：JTree(TreeNode root, boolean asksAllowsChildren)(同上,只是TreeNode又有不同)
        // 使用DefaultMutableTreeNode类先用一个根结点创建树，设置为可添加孩子结点,再添加孩子结点
        DefaultMutableTreeNode color  =   new  DefaultMutableTreeNode( " Color " ,  true );
        DefaultMutableTreeNode gray  =   new  DefaultMutableTreeNode ( " Gray " );
        color.add (gray);
        color.add ( new  DefaultMutableTreeNode ( " Red " ));
        gray.add ( new  DefaultMutableTreeNode ( " Lightgray " ));
        gray.add ( new  DefaultMutableTreeNode ( " Darkgray " ));
        color.add ( new  DefaultMutableTreeNode ( " Green " ));
        JTree example5  =   new  JTree (color);
        TreeModel treeModel = new DefaultTreeModel(color);
        tree1.setModel(treeModel);

        // 构造函数：JTree(TreeNode root)(同上,只是TreeNode非空)
        // 通过逐个添加结点创建树
        DefaultMutableTreeNode biology  =   new  DefaultMutableTreeNode ( " Biology " );
        DefaultMutableTreeNode animal  =   new  DefaultMutableTreeNode ( " Animal " );
        DefaultMutableTreeNode mammal  =   new  DefaultMutableTreeNode ( " Mammal " );
        DefaultMutableTreeNode horse  =   new  DefaultMutableTreeNode ( " Horse " );
        mammal.add (horse);
        animal.add (mammal);
        biology.add (animal);
        JTree example6  =   new  JTree (biology);
        horse.isLeaf();
        horse.isRoot();

        // 构造函数:JTree(TreeModel newModel)
        // 用DefaultMutableTreeNodel类定义一个结点再用这个结点做参数定义一个用DefaultTreeMode
        // 创建一个树的模型,再用JTree的构造函数创建一个树

        DefaultMutableTreeNode root  =   new  DefaultMutableTreeNode ( " Root1 " );
        DefaultMutableTreeNode child1  =   new  DefaultMutableTreeNode ( " Child1 " );
        DefaultMutableTreeNode child11  =   new  DefaultMutableTreeNode ( " Child11 " );
        DefaultMutableTreeNode child111  =   new  DefaultMutableTreeNode ( " Child111 " );
        root.add (child1); child1.add (child11); child11.add (child111);

        DefaultTreeModel model  =   new  DefaultTreeModel (root);

        JTree example7  =   new  JTree (model);

        JPanel panel  =   new  JPanel();
        panel.setLayout ( new  BoxLayout (panel, BoxLayout.X_AXIS));
        panel.setPreferredSize ( new  Dimension ( 700 ,  400 ));
        panel.add ( new  JScrollPane (example1)); // JTree必须放在JScrollPane上
        panel.add ( new  JScrollPane (example2));
        panel.add ( new  JScrollPane (example3));
        panel.add ( new  JScrollPane (example4));
        panel.add ( new  JScrollPane (example5));
        panel.add ( new  JScrollPane (example6));
        panel.add ( new  JScrollPane (example7));

        JFrame frame  =   new  JFrame ( " JTreeDemo " );
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setContentPane (panel);
        frame.pack();
        frame.setVisible(true);
    }

    private void tree1ValueChanged(TreeSelectionEvent e) {
        // TODO add your code here
        // 设置节点选中监听器
        textField1.setText("当前被选中的节点: " + e.getPath());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        button1 = new JButton();
        textField1 = new JTextField();
        scrollPane1 = new JScrollPane();
        tree1 = new JTree();

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- button1 ----
            button1.setText("Example Windows");
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });
            panel1.add(button1);
            button1.setBounds(new Rectangle(new Point(30, 25), button1.getPreferredSize()));
            panel1.add(textField1);
            textField1.setBounds(35, 415, 290, textField1.getPreferredSize().height);

            //======== scrollPane1 ========
            {

                //---- tree1 ----
                tree1.setFocusTraversalPolicyProvider(true);
                tree1.addTreeSelectionListener(e -> tree1ValueChanged(e));
                scrollPane1.setViewportView(tree1);
            }
            panel1.add(scrollPane1);
            scrollPane1.setBounds(35, 55, 290, 350);

            panel1.setPreferredSize(new Dimension(360, 455));
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JButton button1;
    private JTextField textField1;
    private JScrollPane scrollPane1;
    private JTree tree1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public void JForm()
    {
        initComponents();
        JFrame f = new JFrame("XML Test");
        f.getContentPane().add(panel1);
        f.setSize(500,800);             // 设置组件的大小
        f.setBackground(Color.WHITE);  // 将背景设置成白色
        f.setLocation(300,200);        // 设置组件的显示位置
        f.setLocationRelativeTo( null);
        f.setVisible(true);            // 让组件可见


        // 构造函数：JTree(TreeNode root, boolean asksAllowsChildren)(同上,只是TreeNode又有不同)
        // 使用DefaultMutableTreeNode类先用一个根结点创建树，设置为可添加孩子结点,再添加孩子结点
        DefaultMutableTreeNode color  =   new  DefaultMutableTreeNode( "Color" ,  true );
        DefaultMutableTreeNode gray  =   new  DefaultMutableTreeNode ( "Gray" ,true );
        DefaultMutableTreeNode Lightgray  =   new  DefaultMutableTreeNode ( "Lightgray" ,true );
        DefaultMutableTreeNode Darkgray  =   new  DefaultMutableTreeNode ( "Darkgray" ,true );
        DefaultMutableTreeNode Red  =   new  DefaultMutableTreeNode ( "Red" ,true );
        DefaultMutableTreeNode Green  =   new  DefaultMutableTreeNode ( "Green" ,true );
        DefaultMutableTreeNode Lightgray_A  =   new  DefaultMutableTreeNode ( "Lightgray_A" ,true );
        DefaultMutableTreeNode Lightgray_B  =   new  DefaultMutableTreeNode ( "Lightgray_B" ,true );

        color.add (gray);        ;
        gray.add ( Lightgray);
        Lightgray.add ( Lightgray_A);
        Lightgray.add ( Lightgray_B);
        gray.add (Darkgray);
        color.add (Red);
        color.add (Green);

        TreeModel treeModel = new DefaultTreeModel(color);
        tree1.setModel(treeModel);
    }
}
