import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class setName extends  JFrame{
    private JPanel setname;
    private JLabel namemsg;
    private JTextField name;
    private JButton OKButton;

    setName()
    {
        setContentPane(setname);
        setTitle("");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        name.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //newname=name.getText();
            }
        });
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeap cap=new changeap();
            }
        });
    }
}
