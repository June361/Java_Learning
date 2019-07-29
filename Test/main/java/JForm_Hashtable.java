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
public class JForm_Hashtable {
    public JForm_Hashtable(){
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        // Create a hash map
        Hashtable hashtable = new Hashtable();
        Enumeration names;
        String str;
        String string1="";

        hashtable.put("Zara", new Double(3434.34));
        hashtable.put("Mahnaz", new Double(123.22));
        hashtable.put("Ayan", new Double(1378.00));
        hashtable.put("Daisy", new Double(99.22));
        hashtable.put("Qadir", new Double(-19.08));

        // Show all keys and value in hash table.
        names = hashtable.keys();
        while(names.hasMoreElements()) {
            str = (String) names.nextElement();
            string1=string1+str + ": " +hashtable.get(str)+"\n";
        }
        textPane1.setText(string1);
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        Hashtable hashtable = new Hashtable();
        Enumeration names;
        String str;
        String string1="";
        double reward;

        hashtable.put("Zara", new Double(3434.34));
        hashtable.put("Mahnaz", new Double(123.22));
        hashtable.put("Ayan", new Double(1378.00));
        hashtable.put("Daisy", new Double(99.22));
        hashtable.put("Qadir", new Double(-19.08));

        // Deposit 1,000 into Zara's account
        reward = ((Double)hashtable.get("Zara")).doubleValue();
        hashtable.put("Zara", new Double(reward+1000));
        string1=string1+"Zara's new balance: " +hashtable.get("Zara");
        textPane1.setText(string1);
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
        button2 = new JButton();
        scrollPane1 = new JScrollPane();
        textPane1 = new JTextPane();

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- button1 ----
            button1.setText("Show all keys and value in hash table");
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });
            panel1.add(button1);
            button1.setBounds(35, 30, 325, 24);

            //---- button2 ----
            button2.setText("Deposit 1,000 into Zara's account");
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });
            panel1.add(button2);
            button2.setBounds(35, 60, 325, 24);

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(textPane1);
            }
            panel1.add(scrollPane1);
            scrollPane1.setBounds(35, 95, 325, 185);

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
