import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class setBeds extends JFrame{
    private JPanel setbeds;
    private JLabel bedsmsg;
    private JTextField btf;
    private JLabel chbeds;
    private JButton OKButton;

    setBeds()
    {
        setContentPane(setbeds);
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
                    int beds=Integer.parseInt(btf.getText());
                    if (beds<0)
                    {
                        errors++;
                        chbeds.setForeground(Color.red);
                        chbeds.setText("Beds must be a positive value");
                    }
                }catch (NumberFormatException n)
                {
                    errors++;
                    chbeds.setForeground(Color.red);
                    chbeds.setText("Number of beds must be an integer value");
                }
                if (errors==0)
                {
                    changeap cap=new changeap();
                }

            }
        });
    }
}
