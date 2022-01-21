import java.io.Serializable;
import java.util.ArrayList;

public class Admin extends User implements Serializable{
        public String  firstName, lastName;

        public Admin(String fn,String ln,String un,String pw)
        {   super(un,pw);
            this.firstName=fn;
            this.lastName=ln;
        }


}
