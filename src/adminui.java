import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class adminui extends JFrame{
    private JPanel admin;
    private JLabel q;
    private JButton brres;
    private JButton searchRes;
    private JButton brUs;
    private JButton searchU;
    private JButton ex;

    adminui()
    {
        setContentPane(admin);
        setTitle("");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        brres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //browseresui
            }
        });
        searchRes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //searchresui, nw rwtame by code/name
            }
        });
        brUs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //browseusersui
            }
        });
        searchU.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //search specific ui
            }
        });
        ex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
