

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
import java.util.Map;

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
    private JPanel PROVIDER;
    private JButton addap;
    private JButton changeap;
    private JButton removeap;
    private JButton ex;
    private JPanel ADDAP;
    private JTextField nametf;
    private JTextField typetf;
    private JTextField citytf;
    private JTextField bedstf;
    private JTextField availtf;
    private JFormattedTextField codetf;
    private JButton OKButton2;
    private JButton CLEARButton2;
    private JFormattedTextField prtf;
    private JLabel checktype;
    private JLabel checkbeds;
    private JLabel checkprice;
    private JLabel checkavail;
    private JLabel finalcheck;
    private JButton showaps;
    private JPanel CLIENT;
    private JButton browseApartmentsButton;
    private JButton seeYourReservationsButton;
    private JLabel wrong;


    public GUI()
    {
        Admin a1=new Admin("Stelios", "Tsernikoudis", "tse", "1234");
        users.put(a1.username,a1.password);
        roles.put(a1.username,3);
        Provider p1=new Provider("John","Doe","jd", "pw");
        providers.add(p1);
        users.put(p1.username,p1.password);
        roles.put(p1.username,1);
        Accommodation a=new Accommodation(4,100, "Athens", 1, 5,
                "4bpr", "ImprovHotel");
        Accommodation b= new Accommodation(3, 75.0, "Athens", 1, 5, "3bdprv", "ImprovHotel");
        Accommodation c=new Accommodation(2, 50.0, "Athens", 1, 5, "2bddprv", "ImprovHotel");
        p1.apartments.add(a);
        p1.apartments.add(b);
        p1.apartments.add(c);
        Provider bamfil=new Provider("George", "Damianos", "bamfilakos", "leleflwrina");
        providers.add(bamfil);
        users.put(bamfil.username, bamfil.password);
        roles.put(bamfil.username, 1);
        Accommodation pr=new Accommodation(3, 40, "Thessaloniki", 1, 1, "chprr", "Crossroads Hostel");
        Accommodation d4=new Accommodation(1, 15, "Thessaloniki", 2, 4, "4bddrm", "Crossroads Hostel");
        Accommodation d6=new Accommodation(1, 14.5, "Thessaloniki", 2, 6, "6bddrm", "Crossroads Hostel");
        bamfil.apartments.add(pr);
        bamfil.apartments.add(d4);
        bamfil.apartments.add(d6);
        Client c1=new Client("Marianna","Foudouli","mar","456");
        clients.add(c1);
        users.put(c1.username,c1.password);
        roles.put(c1.username,2);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        CardLayout cl=(CardLayout) mainPanel.getLayout();




        //INITIAL CARD BUTTONS
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



        //REGISTER CARD BUTTONS
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



        //LOGIN CARD BUTTONS
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
                    if (users.containsKey(UN2.getText())==false)
                    {
                        wrong.setForeground(Color.RED);
                        wrong.setText("Username does not exist");

                    }
                    else
                    {
                        if (users.get(UN2.getText())!=PW2.getText())
                        {
                            wrong.setForeground(Color.RED);
                            wrong.setText("Wrong password");
                        }
                    }
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
                        else
                        {
                            adminui aui=new adminui();
                        }
                    }
                }
            }
        });



        //PROVIDER CARD BUTTONS
        ex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(mainPanel,"Card1");
            }
        });
        addap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cl.show(mainPanel,"Card6");
            }
        });


        OKButton2.addActionListener(new ActionListener() {
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

                } else {
                    //edw to prosthetoume to apartment
                    Accommodation a=new Accommodation(Integer.parseInt(bedstf.getText()),Double.parseDouble(prtf.getText()),citytf.getText(),Integer.parseInt(typetf.getText()),
                            Integer.parseInt(availtf.getText()),codetf.getText(),nametf.getText());
                    for(Provider pr:providers)
                    {
                        if(UN2.getText().equals(pr.username))
                        {
                            pr.addAp(a);

                        }

                    }


                   cl.show(mainPanel,"Card4");
                }
            }
        });
        CLEARButton2.addActionListener(new ActionListener() {
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

        showaps.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame acc;

                for(Provider p:providers)
                {
                    if(UN2.getText().equals(p.username))
                    {
                        for (Accommodation a:p.apartments)
                        {
                            acc=new AccPanel(a,p);


                        }
                    }
                }


            }
        });
        browseApartmentsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reservationTab tab=new reservationTab();
               /* ApPanel ap;
                for(Provider p:providers)
                {
                    for(Accommodation a:p.apartments)
                    {
                        ap=new ApPanel(a);

                    }
                }*/
            }
        });
        seeYourReservationsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nothingToSee nn=new nothingToSee();
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
