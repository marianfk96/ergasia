import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class table extends JFrame{


   // private JPanel showaps;
    private JTable table;

    table()
    {
        User b=new User("bam", "123");

        Accommodation a=new Accommodation(3, 45, "Thessaloniki", 1, 2, "r1", "myHotel");
        Provider bam= new Provider("George", "Smith", "bam", "123");
        bam.apartments.add(a);

        String[] col={"id", "name"};

        DefaultTableModel tableModel=new DefaultTableModel(col, 0);
        for (Accommodation ac:bam.apartments)
        {
            Object[] obs={ac.code, ac.name};
            System.out.println(obs);
            tableModel.addRow(obs);
        }

        setLayout(new FlowLayout());



        /*setLayout(new FlowLayout());


        table.setPreferredScrollableViewportSize(new Dimension(500,50));
        table.setFillsViewportHeight(true);

        JScrollPane scrollPane=new JScrollPane(table);
        add(scrollPane);*/

    }
}
