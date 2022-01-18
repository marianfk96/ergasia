import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class inmess extends JFrame{
    private JLabel tf1;
    private JButton b1;
    private JButton b2;
    private JPanel inmessage;

    inmess()
    {
       setContentPane(inmessage);
       setTitle("");
       setSize(450,300);
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       setVisible(true);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                register reg=new register();


            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login log=new login();
            }
        });
    }





}
