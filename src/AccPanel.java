import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccPanel extends  JFrame{
    private JButton OKButton;
    private JLabel Name;
    private JLabel City;
    private JLabel Type;
    private JLabel Beds;
    private JLabel Availability;
    private JLabel Code;
    private JLabel Price;
    private JPanel AccPanel;

    public AccPanel(Accommodation a)
    {
        setContentPane(AccPanel);
        setSize(300,300);
        Name.setText(a.name);
        City.setText(a.city);
        Type.setText(String.valueOf(a.type));
        Beds.setText(String.valueOf(a.beds));
        Availability.setText(String.valueOf(a.availability));
        Code.setText(a.code);
        Price.setText(String.valueOf(a.price));
        setVisible(true);


        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeap c=new changeap(a);
            }
        });
    }
}
