import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Timer;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sun Jun 02 21:15:30 CST 2019
 */



/**
 * @author June Chen
 */
public class JForm_TCP_IP {
    public JForm_TCP_IP() {
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        String baseURIStr = "http://www.www.w3cschool.cn/a/b/c/index.html?id=1&rate=5%25#foo";
        String relativeURIStr = "../x/y/z/welcome.html";

        URI baseURI = null;
        try {
            baseURI = new URI(baseURIStr);
        } catch (URISyntaxException ex) {
            ex.printStackTrace();
        }
        URI relativeURI = null;
        try {
            relativeURI = new URI(relativeURIStr);
        } catch (URISyntaxException ex) {
            ex.printStackTrace();
        }

        URI resolvedURI = baseURI.resolve(relativeURI);

        printURIDetails(baseURI);
        printURIDetails(relativeURI);
        printURIDetails(resolvedURI);
    }
    public static void printURIDetails(URI uri) {
        System.out.println("URI:" + uri);
        System.out.println("Normalized:" + uri.normalize());
        String parts = "[Scheme=" + uri.getScheme() + ", Authority="
                + uri.getAuthority() + ", Path=" + uri.getPath() + ", Query:"
                + uri.getQuery() + ", Fragment:" + uri.getFragment() + "]";
        System.out.println(parts);
        System.out.println();
    }

    @NotNull
    public static String getURLContent(String urlStr) throws Exception {
        BufferedReader br = null;
        URL url = new URL(urlStr);
        InputStream ins = url.openStream();
        br = new BufferedReader(new InputStreamReader(ins));

        StringBuilder sb = new StringBuilder();
        String msg = null;
        while ((msg = br.readLine()) != null) {
            sb.append(msg);
            sb.append("\n"); // Append a new line
        }
        br.close();
        return sb.toString();
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        String urlStr = "http://www.w3cschool.cn";
        String content = null;
        try {
            content = getURLContent(urlStr);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(content);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- button1 ----
            button1.setText("URI");
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
            });
            panel1.add(button1);
            button1.setBounds(45, 30, 160, button1.getPreferredSize().height);

            //---- button2 ----
            button2.setText("getURLContent");
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });
            panel1.add(button2);
            button2.setBounds(225, 30, 160, 24);

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

    enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public void JForm()
    {
        initComponents();
        JFrame f = new JFrame("JForm_TCP_IP");
        f.getContentPane().add(panel1);
        f.setSize(500,300);             // 设置组件的大小
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
