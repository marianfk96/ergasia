import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class setType extends JFrame{
    private JPanel settype;
    private JLabel typemsg;
    private JTextField typetf;
    private JButton OKButton;
    private JLabel chtype;

    setType(Accommodation a)
    {
        setContentPane(settype);
        setTitle("");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int errors=0;
                if ((typetf.getText().equals("1") || typetf.getText().equals("2"))==false)
                {
                    errors++;
                    chtype.setForeground(Color.red);
                    chtype.setText("Type must be 1 or 2");
                }
                else
                {
                    a.setType(Integer.parseInt(typetf.getText()));
                    setVisible(false);
                    //changeap cap=new changeap();
                }
            }
        });
    }
}
