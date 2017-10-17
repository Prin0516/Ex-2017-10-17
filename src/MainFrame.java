import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Label.RIGHT;

public class MainFrame extends JFrame {
    private JLabel jlbID=new JLabel("ID:");
    private JLabel jlbPW=new JLabel("Password:");
    private JTextField jtfID=new JTextField();
    private JTextField jtfPW=new JTextField();
    private JPasswordField jpf=new JPasswordField();
    private JButton jbtnlogin=new JButton("Login");
    private JButton jbtneixt=new JButton("Exit");
    private Container cp;
    public MainFrame(){
        init();
    }
    public void init(){
        this.setBounds(50,50,300,150);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp=this.getContentPane();
        cp.setLayout(new GridLayout(3,2, 3,5));
        jlbID.setHorizontalAlignment(SwingConstants.RIGHT);
        jlbPW.setHorizontalAlignment(SwingConstants.RIGHT);
        cp.add(jlbID);
        cp.add(jtfID);
        cp.add(jlbPW);
        cp.add(jpf);
        cp.add(jbtnlogin);
        cp.add(jbtneixt);
        jbtneixt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jbtnlogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });



    }
}
