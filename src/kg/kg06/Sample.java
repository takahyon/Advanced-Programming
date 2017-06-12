package kg.kg06;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Taka on 2017/05/22.
 */
public class Sample  extends javax.swing.JFrame{
    private JTextField mainText;
    private JPanel panel1;
    private JButton button1;
    private JTextArea textArea1;


    public Sample() {

        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

            }
        });
    }
}
