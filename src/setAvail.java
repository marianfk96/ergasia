import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class setAvail extends JFrame{
    private JPanel setav;
    private JLabel avmsg;
    private JTextField avtf;
    private JButton OKButton;
    private JLabel chavail;

    setAvail()
    {
        setContentPane(setav);
        setTitle("");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int errors=0;
                try
                {
                    int avail=Integer.parseInt(avtf.getText());
                    if (avail<0)
                    {
                        errors++;
                        chavail.setForeground(Color.red);
                        chavail.setText("Availability cannot be negative");
                    }
                }catch (NumberFormatException n)
                {
                    errors++;
                    chavail.setForeground(Color.red);
                    chavail.setText("Availability must be an integer value");
                }
                if (errors==0)
                {
                    changeap cap=new changeap();
                }
            }
        });
    }
}
