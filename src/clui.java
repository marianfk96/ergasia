import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class clui extends JFrame{
    private JPanel client;
    private JLabel q;
    private JButton browse;
    private JButton res;
    private JButton see;
    private JButton exit;

    clui()
    {
        setContentPane(client);
        setTitle("");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        browse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //browseui
            }
        });
        res.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //reservationui
            }
        });
        see.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //seeres ui
            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
