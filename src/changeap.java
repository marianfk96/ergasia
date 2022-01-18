import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class changeap extends JFrame{
    private JPanel change;
    private JLabel select;
    private JButton nofb;
    private JButton chname;
    private JButton chpr;
    private JButton chavail;
    private JButton chtype;
    private JButton ex;

    changeap()
    {
        setContentPane(change);
        setTitle("");
        setSize(450, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        chname.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setName sn=new setName();
            }
        });
        nofb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBeds sb=new setBeds();
            }
        });
        chpr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setPrice sp=new setPrice();
            }
        });
        chavail.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setAvail sav=new setAvail();
            }
        });
        chtype.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setType st=new setType();
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
