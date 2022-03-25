import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class myFrame extends JFrame implements ActionListener {
    someFunction idek = new someFunction();
    JButton button;
    JButton button2;

    JLabel label = new JLabel("this is my label");

    myFrame() {
        //set button param
        button = new JButton();
        button.setBounds(100, 100, 100, 35);
        button.addActionListener(this);
        button.setText("Button 1");
        button.setFocusable(false);
        button.setFont(new Font("Comic Sans", Font.BOLD, 12));
        button.setIconTextGap(-15);
        button.setBorder(BorderFactory.createEtchedBorder());

        //set button param for button 2
        button2 = new JButton();
        button2.setBounds(400, 100, 100, 35);
        button2.addActionListener(this);
        button2.setText("Button 2");
        button2.setFocusable(false);
        button2.setFont(new Font("Comic Sans", Font.BOLD, 12));
        button2.setIconTextGap(-15);
        button2.setBorder(BorderFactory.createEtchedBorder());

        //set frame param
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setBackground(new Color(123, 50, 250));
        this.add(button);
        this.add(button2);
        this.add(label);
    }

    //set button action
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println();
            idek.myFunction();
            button.setEnabled(false);
        }

        if (e.getSource() == button) {
            System.out.println("print 2");
            button2.setEnabled(true);
        }
    }
}

//@Override


