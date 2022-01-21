import java.io.Serializable;
import java.util.ArrayList;

class Client extends User implements Serializable {
    public String  firstName, lastName;
    public ArrayList<Reservation> reservations;

    public Client(String fn,String ln,String un,String pw)
    {   super(un,pw);
        this.firstName=fn;
        this.lastName=ln;
        this.reservations=new ArrayList<>();
    }

}
