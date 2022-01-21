import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccPanel extends  JFrame{
    private JButton EditButton;
    private JLabel Name;
    private JLabel City;
    private JLabel Type;
    private JLabel Beds;
    private JLabel Availability;
    private JLabel Code;
    private JLabel Price;
    private JPanel AccPanel;
    private JButton removeButton;

    public AccPanel(Accommodation a,Provider p)
    {
        setContentPane(AccPanel);
        setSize(300,300);
        setTitle("Move the window to see previous entries");
        Name.setText(a.name);
        City.setText(a.city);
        Type.setText(String.valueOf(a.type));
        Beds.setText(String.valueOf(a.beds));
        Availability.setText(String.valueOf(a.availability));
        Code.setText(a.code);
        Price.setText(String.valueOf(a.price));
        setVisible(true);


        EditButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeap c=new changeap(a);

            }
        });
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p.apartments.remove(a);
                setVisible(false);


            }
        });
    }
}
