import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private Container cp;
    public MainFrame(){
        init();
    }
    private void init(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(50,50,500,500);


    }
}
