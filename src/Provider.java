import java.io.Serializable;
import java.util.ArrayList;

public class Provider extends User implements Serializable {

    private String  firstName, lastName;
    ArrayList<Accommodation> apartments;
    public Provider(String fn,String ln,String un,String pw)
    {   super(un,pw);
        this.firstName=fn;
        this.lastName=ln;
        apartments=new ArrayList<Accommodation>();
    }


}
