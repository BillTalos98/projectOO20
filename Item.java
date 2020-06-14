import java.util.*;
public abstract class Item  
{
    private String name;
    private double price;
    private String description;
    private int stock;
    private int id;
    
    public Item(String name, double price, String description, int stock, int id)
    {
        this.name=name;
        this.price=price;
        this.description=description;
        this.stock=stock;
        this.id=id;
    }
    public void setName(String n)
    {
        this.name = n;
    }
    public String getName()
    {
        return name;
    }
    public void setPrice(double p)
    {
        this.price = p;
    }
    public double getPrice()
    {
        return price;
    }
    public void setDescription(String d)
    {
        this.description = d;
    }
    public String getDescription()
    {
        return description;
    }
    public void setStock(int s)
    {
        this.stock = s;
    }
    public int getStock()
    {
        return stock;
    }
    public void setId(int id)
    {
        this.id = id;}
    public int getId()
    {
        return id;
    }
        
    public String getBasicInfo()
    {
        return ("Item's name: " + name + ", " + " Item's price: "  + price + ", " + 
        " Item's description: " + description + ", " + " Item's stock: " + stock + ", " + " Item's id: " + id + ".");
    }
    
    public abstract String getDetails();
    
    public String toString()
    {
         return getBasicInfo();
    }
}

      