import javax.swing.*;
import javax.swing.text.DefaultEditorKit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

public class register extends JFrame{
    private JPanel register;
    private JLabel fn;
    private JTextField tf1;
    private JLabel ln;
    private JTextField tf2;
    private JLabel un;
    private JTextField tfun;
    private JLabel pw;
    private JTextField tfpw;
    private JButton okbtn;
    private JButton clbtn;
    private JButton ad;
    private JButton prov;
    private JButton clnt;
    private JLabel msg;

    register()
    {  Data data=new Data();
        setContentPane(register);
        setTitle("");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        okbtn.addActionListener(new ActionListener() {
            @Override
            //κανουμε set τα στοιχεια που διαβασαμε στο ui
            public void actionPerformed(ActionEvent e) {


                setVisible(false);
                inmess in=new inmess();

            }
        });
        clbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText("");
                tf2.setText("");
                tfun.setText("");
                tfpw.setText("");
            }

        });
        prov.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //bazoume sto hasmap roles 1
                msg.setText("Registration Complete!");
                Provider a=new Provider(tf1.getText(),tf2.getText(),tfun.getText(),tfpw.getText());
                data.providers.add(a);
                data.users.put(tfun.getText(),tfpw.getText());
                data.roles.put(tfun.getText(),1);
                data.Save(data.providers);

                ArrayList<Provider> pros=(ArrayList<Provider>) data.Load();
                for (Provider b: pros)
                {
                    System.out.println(b.username+" "+b.password);
                }
                HashMap<String,Integer> rol=( HashMap<String,Integer>) data.Load();
                for (int i=0;i<rol.size();i++)
                {
                    System.out.println(rol.keySet()     );
                }


            }
        });
        clnt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //bazoume sto hm 2
                msg.setText("Registration Complete!");
                Client a=new Client(tf1.getText(),tf2.getText(),tfun.getText(),tfpw.getText());
                data.clients.add(a);
                data.users.put(tfun.getText(),tfpw.getText());
                data.roles.put(tfun.getText(),2);
                data.Save(data.clients);
                ArrayList<Client> pros=(ArrayList<Client>) data.Load();
                for (Client b: pros)
                {
                    System.out.println(b.username+" "+b.password);
                }




            }
        });
        ad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //bazoume sto hm 3
                msg.setText("Registration Complete!");

            }
    });

}}
