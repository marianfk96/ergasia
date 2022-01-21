import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class setCity extends JFrame{
    private JButton Okbutton;
    private JTextField citytf;
    private JPanel setCity;

    public setCity(Accommodation a) {
        setContentPane(setCity);
        setSize(450,300);
        setVisible(true);
        Okbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a.setCity(citytf.getText());
                setVisible(false);

            }
        });
    }
}
