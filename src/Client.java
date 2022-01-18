import java.io.Serializable;

public class Client extends User implements Serializable {
    private String  firstName, lastName;
    public Client(String fn,String ln,String un,String pw)
    {   super(un,pw);
        this.firstName=fn;
        this.lastName=ln;
    }

}
