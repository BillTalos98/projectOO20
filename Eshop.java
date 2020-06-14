import java.util.Random;
import java.io.*;
import java.util.*;
public class Eshop 
{
    private String name = "";
    private String owner = "";
    
    public Eshop(String name, String owner)
    {
        this.name=name;
        this.owner=owner;
    }
    
    public static void main(String[] args) 
    {
        Random id = new Random(1000);
        int id1 = id.nextInt(1000);
        int id2 = id.nextInt(1000);
        int id3 = id.nextInt(1000);
        int id4 = id.nextInt(1000);
        ArrayList Items = new ArrayList(1);
        {
            Items.add("Pen" + " (id: " + id1 + ")");
            Items.add("Pencil" + " (id: " + id2 + ")");
            Items.add("Notebook" + " (id: " + id3 + ")");
            Items.add("Paper" + " (id: " + id4 + ")");
        }
        System.out.print("+");
        System.out.print("*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("+");
        System.out.print("|");
        System.out.print("!!The list of Items!!");
        System.out.println("|");
        System.out.print("+");
        System.out.print("*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("+");
        for (int i = 0; i < Items.size(); i++)
        {
            System.out.print("-> ");
            System.out.println(Items.get(i));
        }
    
        ArrayList Buyers = new ArrayList(2);
        {
            Buyers.add("Vasileios Talos");
            Buyers.add("Despoina Arkadou");
            Buyers.add("Giorgos Petachtaris");
        }
        
        System.out.println("");
        System.out.print("+");
        System.out.print("*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("+");
        System.out.print("|");
        System.out.print("!!The list of Buyers!!!");
        System.out.println("|");
        System.out.print("+");
        System.out.print("*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("+");
        
        for (int j = 0; j < Buyers.size(); j++)
        {
            System.out.print("* ");
            System.out.println(Buyers.get(j));
        }
    }
    
    
        
    public String addItem()
    {
         int alreadyInList;
         System.out.println("Enter the new Item: ");
         Scanner newItem = new Scanner(System.in);
         String Item = newItem.nextLine();
         System.out.println("new Item is: " + Item);
            
        
        try
        {
            Scanner alreadyInList1 = new Scanner(System.in);
            System.out.println("Is this product in the list??: ");
            alreadyInList = alreadyInList1.nextInt();
            if (alreadyInList < 1)
            {
                throw new Exception("Exception: this Item is already at the List!!");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return("Order a other product!!");
        }
        
        
        {
            
           
                Random id = new Random(1000);
                int id1 = id.nextInt(1000);
                int id2 = id.nextInt(1000);
                int id3 = id.nextInt(1000);
                int id4 = id.nextInt(1000);
                int newId = id.nextInt(1000);
                ArrayList<String> Items = new ArrayList<String>(1);
                {
                    Items.add("Pen" + " (id: " + id1 + ")");
                    Items.add("Pencil" + " (id: " + id2 + ")");
                    Items.add("Notebook" + " (id: " + id3 + ")");
                    Items.add("Paper" + " (id: " + id4 + ")");
                    Items.add(Item + "(id: " + newId + ")");
                }
                System.out.print("+");
                System.out.print("*-*-*-*-*-*-*-*-*-*-*");
                System.out.println("+");
                System.out.print("|");
                System.out.print("!!The new list of Items!!");
                System.out.println("|");
                System.out.print("+");
                System.out.print("*-*-*-*-*-*-*-*-*-*-*");
                System.out.println("+");
                for (int i = 0; i < Items.size(); i++)
                {
                    System.out.print("-> ");
                    System.out.println(Items.get(i));
                }
                System.out.println("The new list of products: ");
                System.out.println(Items);
            }
            return("ok");
    }
        
    
    public String addBuyer()
    {
         int alreadyInList;
         System.out.println("Enter name of new Buyer : ");
         Scanner newBuyer = new Scanner(System.in);
         String Buyer = newBuyer.nextLine();
         System.out.println("new Buyer is: " + Buyer);
            
        
        try
        {
            Scanner alreadyInList1 = new Scanner(System.in);
            System.out.println("Is this Buyer in the list??: ");
            alreadyInList = alreadyInList1.nextInt();
            if (alreadyInList < 1)
            {
                throw new Exception("Exception: this Buyer is already at the List!!");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return("He/She is a old customer!!");
        }
        
        finally
        {
            ArrayList Buyers = new ArrayList(2);
            {
                Buyers.add("Vasileios Talos");
                Buyers.add("Despoina Arkadou");
                Buyers.add("Giorgos Petachtaris");
                Buyers.add(Buyer);
            }
        
                System.out.println("");
                System.out.print("+");
                System.out.print("*-*-*-*-*-*-*-*-*-*-*-*");
                System.out.println("+");
                System.out.print("|");
                System.out.print("!!The list of Buyers!!!");
                System.out.println("|");
                System.out.print("+");
                System.out.print("*-*-*-*-*-*-*-*-*-*-*-*");
                System.out.println("+");
        
                for (int j = 0; j < Buyers.size(); j++)
                {
                    System.out.print("* ");
                    System.out.println(Buyers.get(j));
                }
                return("it's ok");
            }
        }
        public String toString()
        {
            return addItem();
        }
        public String toString1()
        {
            return addBuyer();
        }
    }





        
        
    
    
    


    
 