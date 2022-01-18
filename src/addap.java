import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class addap extends JFrame{
    private JPanel addap;
    private JLabel code;
    private JFormattedTextField codetf;
    private JLabel name;
    private JTextField nametf;
    private JLabel type;
    private JTextField typetf;
    private JLabel checktype;
    private JLabel checkprice;
    private JFormattedTextField prtf;
    private JLabel city;
    private JTextField citytf;
    private JLabel checkbeds;
    private JLabel nob;
    private JTextField bedstf;
    private JLabel checkavail;
    private JLabel avail;
    private JTextField availtf;
    private JLabel finalcheck;
    private JButton OKButton;
    private JButton clearButton;
    private JLabel setprice;

    public addap() {
        setContentPane(addap);
        setTitle("");
        setSize(450, 750);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int errors=0;
                if ((typetf.getText().equals("1") || typetf.getText().equals("2")) == false) {
                    errors++;
                    checktype.setForeground(Color.red);
                    checktype.setText("Type must be 1 or 2. Try again");
                }
                else
                {
                    int type=Integer.parseInt(typetf.getText());
                }
                try
                {
                    double price=Double.parseDouble(prtf.getText());
                    if (price<=0)
                    {
                        checkprice.setForeground(Color.red);
                        checkprice.setText("price must be positive");
                        errors++;
                    }
                }catch (NumberFormatException n)
                {
                    checkprice.setForeground(Color.red);
                    checkprice.setText("price must be a number");
                    errors++;
                }
                try
                {
                    int beds=Integer.parseInt(bedstf.getText());
                    if (beds<0)
                    {
                        checkbeds.setForeground(Color.red);
                        checkbeds.setText("Must must have a positive value");
                        errors++;
                    }
                }catch (NumberFormatException n)
                {
                    checkbeds.setForeground(Color.red);
                    checkbeds.setText("Number of beds must be an integer.");
                    errors++;
                }
                try
                {
                    int availability=Integer.parseInt(availtf.getText());
                    if (availability<0)
                    {
                        checkavail.setForeground(Color.red);
                        checkavail.setText("Availability must be positive");
                        errors++;
                    }
                }catch (NumberFormatException n)
                {
                    checkavail.setForeground(Color.red);
                    checkavail.setText("Availability must be an integer");
                    errors++;
                }
                if (errors > 0) {
                    finalcheck.setForeground(Color.red);
                    finalcheck.setText("Adding apartment failed. Please insert valid parameters for your apartment.");
                    //trexei alla mou eksafanizei to clear
                } else {
                    //edw to prosthetoume to apartment
                    provui pui = new provui();
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                codetf.setText("");
                nametf.setText("");
                typetf.setText("");
                checktype.setText("");
                citytf.setText("");
                bedstf.setText("");
                checkbeds.setText("");
                prtf.setText("");
                checkprice.setText("");
                availtf.setText("");
                checkavail.setText("");
            }
        });




    }
}
