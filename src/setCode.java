import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class setCode extends JFrame{
    private JTextField codetf;
    private JButton OKButton;
    private JPanel setCode;

    public setCode(Accommodation a) {
        setContentPane(setCode);
        setSize(450,300);
        setVisible(true);
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a.setCode(codetf.getText());
                setVisible(false);

            }
        });
    }
}
