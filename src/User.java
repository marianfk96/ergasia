import java.io.Serializable;

public class User implements Serializable {
        String username,password;


        public User(String un,String pw)
        {
            this.username=un;
            this.password=pw;


        }
}
