import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class setName extends  JFrame{
    private JPanel setname;
    private JLabel namemsg;
    private JTextField name;
    private JButton OKButton;

    setName(Accommodation a)
    {
        setContentPane(setname);
        setTitle("");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        name.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a.setName(name.getText());
                setVisible(false);
                //changeap cap=new changeap();
            }
        });
    }
}
