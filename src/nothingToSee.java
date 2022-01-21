import javax.swing.*;

public class nothingToSee extends JFrame
{
    private JLabel mesg;
    private JPanel sad;

    nothingToSee()
    {
        setContentPane(sad);
        setTitle("Nothing to see here");
        setSize(900,900);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
