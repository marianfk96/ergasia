import java.io.Serializable;
import java.util.ArrayList;

public class Provider extends User implements Serializable {

    public String  firstName, lastName;
    ArrayList<Accommodation> apartments;
    public Provider(String fn,String ln,String un,String pw)
    {   super(un,pw);
        this.firstName=fn;
        this.lastName=ln;
        apartments=new ArrayList<>();
    }
    public void addAp(Accommodation a)
    {
        this.apartments.add(a);
    }
    public void changeAP(String cd)
    {
        for(Accommodation a:this.apartments)
        {
            if (a.code.equals(cd))
            {


            }
        }
    }


}
