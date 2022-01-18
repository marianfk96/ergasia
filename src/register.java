import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class register extends JFrame{
    private JPanel register;
    private JLabel fn;
    private JTextField tf1;
    private JLabel ln;
    private JTextField tf2;
    private JLabel un;
    private JTextField tfun;
    private JLabel pw;
    private JTextField tfpw;
    private JButton okbtn;
    private JButton clbtn;

    register()
    {
        setContentPane(register);
        setTitle("");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        okbtn.addActionListener(new ActionListener() {
            @Override
            //κανουμε set τα στοιχεια που διαβασαμε στο ui
            public void actionPerformed(ActionEvent e) {
                roles r=new roles();
            }
        });
        clbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText("");
                tf2.setText("");
                tfun.setText("");
                tfpw.setText("");
            }
        });
    }

}
