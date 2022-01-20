import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

public class login extends JFrame {
    private JPanel login;
    private JLabel un;
    private JTextField tf1;
    private JLabel pw;
    private JTextField tf2;
    private JButton okb;
    private JButton clearb;
    private JLabel msg;
    String username;
    String password;

    login()
    {
        setContentPane(login);
        setTitle("");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        okb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                username=tf1.getText();
                password=tf2.getText();
                Data a=new Data();
                ArrayList<Provider>pr=(ArrayList<Provider>) a.Load();

                for(Provider b :pr)
                {
                    System.out.println(b.username+b.password);
                }


                int b=1;

                if (b==1)
                {
                    msg.setText("Welcome "+username);
                    //psaxnoume rolo, anoigoume analogo ui
                    provui prui=new provui();


                }
                else if (username.equals("adm") && password.equals("admin"))
                {

                }
                else if (username.equals("cli") && password.equals("client"))
                {
                    clui clientui=new clui();

                }
                else
                {
                    msg.setText("Wrong username or password");

                }

            }
        });
        clearb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText("");
                tf2.setText("");
                msg.setText("");
            }
        });
    }


}
