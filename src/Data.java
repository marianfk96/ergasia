import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Data implements Serializable{
    public HashMap<String, String> users;
    public HashMap<String,Integer> roles;
    public ArrayList<Provider> providers;
    public ArrayList<Client> clients;
    String file="data.bin";
    public Data() {
        users=new HashMap<>();
        roles=new HashMap<>();
        providers=new ArrayList<>();
        clients =new ArrayList<>();

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



