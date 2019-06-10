import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sun Jun 02 21:15:30 CST 2019
 */



/**
 * @author June Chen
 */
public class JForm_Loop {
    public JForm_Loop() {
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        int x;
        int y;
        String string="";
        x=Integer.valueOf(textField1.getText());
        y=Integer.valueOf(textField2.getText());
        while( x < y ){
            string=string+ "value of x : " +Integer.toString(x)+ "\n";
            textPane1.setText(string);
            x++;
        }
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        int x;
        int y;
        String string="";
        x=Integer.valueOf(textField1.getText());
        y=Integer.valueOf(textField2.getText());
        do{
            string=string+ "value of x : " +Integer.toString(x)+ "\n";
            textPane1.setText(string);
            x++;
        }while( x < y );
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        int y;
        String string="";
        y=Integer.valueOf(textField2.getText());
        for(int x = Integer.valueOf(textField1.getText()); x < y; x = x+1){
            string=string+ "value of x : " +Integer.toString(x)+ "\n";
            textPane1.setText(string);
        }
    }

    private void button4MouseClicked(MouseEvent e) {
        // TODO add your code here
        String string1="";
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ){
            string1=string1 +Integer.toString(x)+ ",";
            textPane1.setText(string1);
        }

        string1=string1 + "\n";

        String string2=string1;
        String [] names ={"James", "Larry", "Tom", "Lacy"};
        for( String name : names ) {
            string2= string2 + name+ ",";
            textPane1.setText(string2);
        }
    }

    private void button5MouseClicked(MouseEvent e) {
        // TODO add your code here
        String string="";
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            if( x == 30 ) {
                break;
            }
            string=string +Integer.toString(x)+ "\n";
            textPane1.setText(string);
        }

    }

    private void button6MouseClicked(MouseEvent e) {
        // TODO add your code here
        String string="";
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            if( x == 30 ) {
                continue;
            }
            string=string +Integer.toString(x)+ "\n";
            textPane1.setText(string);
        }
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
        textField1 = new JTextField();
        textField2 = new JTextField();
        label1 = new JLabel();
        label2 = new JLabel();
        textPane1 = new JTextPane();

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- button1 ----
            button1.setText("While");
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });
            panel1.add(button1);
            button1.setBounds(35, 75, 75, 24);

            //---- button2 ----
            button2.setText("Do While");
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });
            panel1.add(button2);
            button2.setBounds(120, 75, 75, 24);

            //---- button3 ----
            button3.setText("For");
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button3MouseClicked(e);
                }
            });
            panel1.add(button3);
            button3.setBounds(205, 75, 75, 24);

            //---- button4 ----
            button4.setText("For(int x : numbers )");
            button4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button4MouseClicked(e);
                }
            });
            panel1.add(button4);
            button4.setBounds(35, 105, 160, 24);

            //---- button5 ----
            button5.setText("break");
            button5.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button5MouseClicked(e);
                }
            });
            panel1.add(button5);
            button5.setBounds(290, 75, 75, 24);

            //---- button6 ----
            button6.setText("continue");
            button6.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button6MouseClicked(e);
                }
            });
            panel1.add(button6);
            button6.setBounds(290, 105, 75, 24);

            //---- textField1 ----
            textField1.setText("10");
            panel1.add(textField1);
            textField1.setBounds(35, 35, 70, 24);

            //---- textField2 ----
            textField2.setText("20");
            panel1.add(textField2);
            textField2.setBounds(160, 35, 70, 24);

            //---- label1 ----
            label1.setText("x");
            panel1.add(label1);
            label1.setBounds(10, 35, 20, 20);

            //---- label2 ----
            label2.setText("y");
            panel1.add(label2);
            label2.setBounds(115, 35, 20, 20);
            panel1.add(textPane1);
            textPane1.setBounds(10, 150, 383, 425);

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
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel label1;
    private JLabel label2;
    private JTextPane textPane1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public void JForm()
    {
        initComponents();
        JFrame f = new JFrame("JForm_Loop");
        f.getContentPane().add(panel1);
        f.setSize(500,800);             // 设置组件的大小
        f.setBackground(Color.WHITE);  // 将背景设置成白色
        f.setLocation(300,200);        // 设置组件的显示位置
        f.setLocationRelativeTo( null);
        f.setVisible(true);            // 让组件可见

        java.util.Timer timer = new Timer();

        Value_Table_Static.a=0;

        timer.  schedule(new java.util.TimerTask()
        {
            public void run()
            {

            }
        }, 0 , 1000);
    }
}
