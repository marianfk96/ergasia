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
    private JButton changecode;
    private JButton changecity;

    changeap(Accommodation a)
    {
        setContentPane(change);
        setTitle("");
        setSize(450, 500);

        setVisible(true);
        chname.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setName sn=new setName(a);
            }
        });
        nofb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBeds sb=new setBeds(a);
            }
        });
        chpr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setPrice sp=new setPrice(a);
            }
        });
        chavail.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setAvail sav=new setAvail(a);
            }
        });
        chtype.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setType st=new setType(a);
            }
        });
        ex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        changecity.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setCity c=new setCity(a);
            }
        });
        changecode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setCode c=new setCode(a);
            }
        });
    }
}
