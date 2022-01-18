import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class roles extends JFrame{
    private JLabel role;
    private JButton prov;
    private JButton cl;
    private JButton adm;
    private JPanel roles;
    private JButton okbtn;
    private JLabel msg;

    roles()
    {
        setContentPane(roles);
        setTitle("");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        okbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });
        prov.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //bazoume sto hasmap roles 1
                msg.setText("Registration Complete!");
            }
        });
        cl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //bazoume sto hm 2
                msg.setText("Registration Complete!");
            }
        });
        adm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //bazoume sto hm 3
                msg.setText("Registration Complete!");
            }
        });
    }
}
