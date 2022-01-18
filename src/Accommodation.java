import java.util.HashMap;

public class Accommodation {
    int beds, availability, type;
    double price;
    String city, name, code;
    public Accommodation(int beds,double price,String city,int type, int availability, String code, String name)
    {
        this.code=code;
        this.name=name;
        this.price=price;
        this.beds=beds;
        this.city=city;
        this.type=type;
        this.availability=availability;

    }
}
