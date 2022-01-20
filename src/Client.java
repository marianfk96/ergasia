import java.io.Serializable;
class Client extends User implements Serializable {
    private String  firstName, lastName;
    public Client(String fn,String ln,String un,String pw)
    {   super(un,pw);
        this.firstName=fn;
        this.lastName=ln;
    }

}
