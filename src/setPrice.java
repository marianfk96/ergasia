import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class setPrice extends JFrame{
    private JPanel setpr;
    private JLabel pr;
    private JTextField prtf;
    private JButton OKButton;
    private JLabel checkpr;

    setPrice()
    {
        setContentPane(setpr);
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
                    double price=Double.parseDouble(prtf.getText());
                    if (price<=0)
                    {
                        errors++;
                        checkpr.setForeground(Color.red);
                        checkpr.setText("Price must be a positive value");
                    }
                }catch (NumberFormatException n)
                {
                    errors++;
                    checkpr.setForeground(Color.red);
                    checkpr.setText("Price must be a number");
                }
                if (errors==0)
                {
                    changeap cap=new changeap();
                }
            }
        });
    }
}
