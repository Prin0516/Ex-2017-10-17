import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends JFrame {
    private Container cp;
    private JTextField jtf=new JTextField();
    private JButton jbtn[]=new JButton[9];
    private JPanel jpl=new JPanel(new GridLayout(3,3));
    private LoginFrame login;
    public MainFrame(LoginFrame log){
        login=log;
        init();
    }
    private void init(){
        this.setBounds(50,50,500,500);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                login.setVisible(true);
            }
        });
        cp=this.getContentPane();
        cp.setLayout(new BorderLayout(5,5));
        jtf.setEditable(false);
        cp.add(jtf,BorderLayout.NORTH);
        cp.add(jpl,BorderLayout.CENTER);
        for(int i=0;i<9;i++){
            jbtn[i]=new JButton(String.valueOf(i));
            jpl.add(jbtn[i]);
            jbtn[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton jbtn=(JButton)e.getSource();
                    jtf.setText(jtf.getText()+jbtn.getText());
                }
            });
        }
    }
}
