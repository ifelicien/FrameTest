import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JTextField;


public class myFrame extends JFrame implements ActionListener {
    someFunction idek = new someFunction();
    JButton button;
    JLabel label;

    myFrame(){
        //set button param
        button = new JButton();
        button.setBounds(200, 100, 100, 35);
        button.addActionListener(this);
        button.setText("Click Here");
        button.setFocusable(false);
        button.setFont(new Font("Comic Sans",Font.BOLD,12));
        button.setIconTextGap(-15);
        button.setBorder(BorderFactory.createEtchedBorder());

        //set frame param
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }

    //set button action
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button) {
            //System.out.println();
            idek.myFunction();
            button.setEnabled(false);
        }
    }
}
