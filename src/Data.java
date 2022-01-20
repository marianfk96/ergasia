import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Data implements Serializable{
    public HashMap<String, String> users =new HashMap<>();
    public HashMap<String,Integer> roles=new HashMap<>();
    public ArrayList<Provider> providers=new ArrayList<>();
    public ArrayList<Client> clients=new ArrayList<>();
    String file="data.bin";
    public Data() {


    }
    public void Save(Object obj)
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
    }}

    }



