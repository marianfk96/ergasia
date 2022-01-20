

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class GUI extends JFrame {
    public ArrayList<Provider> providers=new ArrayList<>();
    public HashMap<String,String>users=new HashMap<>();
    public ArrayList<Client> clients=new ArrayList<>();
    public HashMap<String,Integer> roles =new HashMap<>();
    String file="data.bin";


    private JPanel mainPanel;
    private JLabel q;
    private JButton YESButton;
    private JButton NOButton;
    private JTextField FN;
    private JTextField LN;
    private JTextField UN;
    private JTextField PW;
    private JButton OKButton;
    private JButton CLEARButton;
    private JPanel REGISTER;
    private JLabel fn;
    private JLabel ln;
    private JLabel un;
    private JLabel pw;
    private JLabel un1;
    private JLabel pw1;
    private JButton OKButton1;
    private JButton CLEARButton1;
    private JTextField UN2;
    private JPasswordField PW2;
    private JLabel r;
    private JButton providerButton;
    private JButton clientButton;
    private JButton AdminButton;
    private JLabel check;
    private JPanel LOGIN;
    private JButton yes;
    private JButton loginButton;


    public GUI()
    {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        CardLayout cl=(CardLayout) mainPanel.getLayout();


        YESButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(mainPanel,"Card2");


            }
        });
        NOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(mainPanel,"Card3");

            }
        });
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(mainPanel,"Card1");
            }
        });
        CLEARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FN.setText("");
                UN.setText("");
                LN.setText("");
                PW.setText("");
            }
        });

        providerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Provider a=new Provider(FN.getText(),LN.getText(),UN.getText(),PW.getText());
                providers.add(a);
                users.put(UN.getText(),PW.getText());
                roles.put(UN.getText(),1);
                check.setText("Registration complete");

                /*Save(users);
                Save(roles);
                Save(providers);*/

            }
        });
        clientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Client a=new Client(FN.getText(),LN.getText(),UN.getText(),PW.getText());
                clients.add(a);
                users.put(UN.getText(),PW.getText());
                roles.put(UN.getText(),2);
                check.setText("Registration complete");
                /*Save(clients);
                Save(users);
                Save(roles);*/

            }
        });
        CLEARButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UN2.setText("");
                PW2.setText("");


            }
        });
        OKButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // HashMap<String,String>us=(HashMap<String, String>)Load();


                for (String a:users.keySet())
                {
                    if(UN2.getText().equals(a) && PW2.getText().equals(users.get(a)))
                    {//HashMap<String,Integer>rol=(HashMap<String, Integer>) Load();
                        if(roles.get(UN2.getText())==1)
                        {
                            cl.show(mainPanel,"Card4");
                        }
                        else if(roles.get(UN2.getText())==2)
                        {
                            cl.show(mainPanel,"Card5");
                        }
                    }
                }
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }


    /*public void Save(Object obj)
    {
        try {

            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);

            System.out.println("The Object  was successfully written to a file");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public Object Load(){
        try{
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Object obj = in.readObject();

            System.out.println("The Object has been read from the file");
            return obj;

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }}*/
}
