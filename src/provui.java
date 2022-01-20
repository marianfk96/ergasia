import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class provui extends JFrame{
    private JPanel choice;
    private JLabel lbltxt;
    private JButton addap;
    private JButton changeap;
    private JButton removeap;
    private JButton ex;

    public provui() {

        setContentPane(choice);
        setTitle("");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        ex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        addap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               addap ap=new addap();
            }
        });
        changeap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeap chAP=new changeap();
            }
        });
        removeap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //removeapp ui
            }
        });
    }
}
