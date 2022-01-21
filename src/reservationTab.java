import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class reservationTab extends GUI{
    private JLabel q;
    private JTextField textField1;
    private JLabel people;
    private JTextField textField2;
    private JLabel dates;
    private JTextField arrivalfield;
    private JTextField departurefield;
    private JButton OKButton;
    private JButton clearButton;
    private JPanel rese;
    private JLabel chpeople;
    private JLabel checkarrival;
    private JLabel checkdep;

    boolean checkDate(int date)
    {
        if (date/10000000==0)
        {
            return false;
        }
        else if(date<20220122)
        {
            return false;
        }
        else
        {
            int month=(date%10000)/100;
            if (month==0 || month>12)
            {
                return false;
            }
            else
            {
                int year=date/10000;
                int day=date%100;
                if (day==0 || day>31)
                {
                    return false;
                }
                else
                {
                    if ((month==4 || month ==6 || month==9 || month==11) && day>30)
                    {
                        return false;
                    }
                    else if (month==2)
                    {
                        if (isLeap(year) && day>29)
                        {
                            return false;
                        }
                        else if (!isLeap(year) && day>28)
                        {
                            return false;
                        }
                        else
                        {
                            return true;
                        }
                    }
                    else
                    {
                        return true;
                    }
                }
            }
        }
    }

    boolean isLeap(int year)
    {
        if (year%4==0)
        {
            if (year%100==0)
            {
                if (year%400==0)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            return true;
        }
        return false;
    }


    boolean browseAvailable(ArrayList<Provider> providers, int guests, String dest, int arrival, int departure)
    {
        boolean hasPrinted=false;
        for (int i=0;i<providers.size();i++)
        {
            for (Accommodation a:providers.get(i).apartments)
            {
                if (a.type==1)
                {
                    if (a.beds>=guests && a.city.equals(dest) )
                    {
                        boolean flag=false;
                        for(int date=arrival;date<departure;date++)
                        {
                            if (a.reservations.containsKey(date))
                            {
                                if (a.reservations.get(date)==a.availability)
                                {
                                    flag=true;
                                }
                            }
                        }
                        if (flag==false)
                        {
                            hasPrinted=true;
                            System.out.println("Code:"+a.code+" Name:"+a.name+" Beds:"+a.beds+" Price:"+a.price+" euros City:"+a.city+" Type:"+a.type+" Availability:"+a.availability+"\r\n");
                        }
                    }
                }
                else
                {
                    if (a.city.equals(dest) && a.availability>=guests)
                    {
                        boolean flag=false;
                        for(int date=arrival;date<departure;date++)
                        {
                            if (a.reservations.containsKey(date))
                            {
                                if (a.reservations.get(date)==a.availability)
                                {
                                    flag=true;
                                }
                            }
                        }
                        if (flag==false)
                        {
                            hasPrinted=true;
                            System.out.println("Code:"+a.code+" Name:"+a.name+" Beds:"+a.beds+" Price:"+a.price+" euros City:"+a.city+" Type:"+a.type+" Availability:"+a.availability+"\r\n");
                        }
                    }
                }
            }
        }
        if (hasPrinted==false)
        {
            return false;
        }
        return true;
    }


    reservationTab()
    {
        setContentPane(rese);
        setTitle("");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int errors=0;
                try
                {
                    int people=Integer.parseInt(textField2.getText());
                    if (people<0)
                    {
                        errors++;
                        chpeople.setForeground(Color.red);
                        chpeople.setText("The people in a group cannot be a negative number");
                    }
                }catch (NumberFormatException n)
                {
                    errors++;
                    chpeople.setForeground(Color.red);
                    chpeople.setText("Must be an integer");
                }
                try
                {
                    int arrival=Integer.parseInt(arrivalfield.getText());
                    boolean ch=checkDate(arrival);
                    if (!ch)
                    {
                        errors++;
                        checkarrival.setText("Invalid date");
                    }
                }catch (NumberFormatException n)
                {
                    errors++;
                    checkarrival.setForeground(Color.red);
                    checkarrival.setText("Invalid format");
                }
                try
                {
                    int departure=Integer.parseInt(departurefield.getText());
                    boolean ch=checkDate(departure);
                    if (!ch)
                    {
                        errors++;
                        checkdep.setText("Invalid date");
                    }
                }catch (NumberFormatException n)
                {
                    errors++;
                    checkdep.setForeground(Color.red);
                    checkdep.setText("Invalid format");
                }

                if (errors==0)
                {
                    browseAvailable(providers, Integer.parseInt(textField2.getText()), textField1.getText(), Integer.parseInt(arrivalfield.getText()), Integer.parseInt(departurefield.getText()));



                }


            }
        });


        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                chpeople.setText("");
                textField2.setText("");
                checkarrival.setText("");
                arrivalfield.setText("");
                checkdep.setText("");
                departurefield.setText("");
            }
        });
    }
}
