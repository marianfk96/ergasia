import java.util.HashMap;

public class Accommodation {
    public int beds, availability, type;
    public double price;
    public String city, name, code;
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
    public void setPrice(int price)
    {this.price=price;

    }
    public void setType(int type)
    {this.type=type;

    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setCity(String city)
    {this.city=city;

    }
    public void setCode(String code)
    {this.code=code;

    }
    public void setAvailability(int availability)
    {
        this.availability=availability;
    }
    public void setBeds(int beds)
    {
        this.beds=beds;
    }
}
