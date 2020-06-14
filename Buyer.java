class Buyer extends User
{
    private int bonus;
    private String buyerCategory;
    private String ShoppingCart;
    private boolean completeOrder;
    private int costOfOrder;
    private int transportationExpenses;
    public Buyer(String Name, String Surname, String Email, int UserId, String Town, String Address, int NumberOfAddress, int TK, int bonus, String buyerCategory, String ShoppingCart, boolean completeOrder, int costOfOrder, int transportationExpenses)
    {
        super(Name, Surname, Email, UserId, Town, Address, NumberOfAddress, TK);
        this.bonus = bonus;
        this.buyerCategory = buyerCategory;
        this.ShoppingCart = ShoppingCart;
        this.completeOrder = completeOrder;
        this.costOfOrder = costOfOrder;
        this.transportationExpenses = transportationExpenses;
    }
    public void awardBonus(int bonus)
            {this.bonus = bonus;}
    public int getAwardBonus()
            {return bonus;}
    public void setBuyerCategory(String buyerCategory)
            {this.buyerCategory = buyerCategory;}
    public String getbuyerCategory()
            {return buyerCategory;}
    public void setShoppingCart(String ShoppingCart)
            {this.ShoppingCart = ShoppingCart;}
    public String getShoppingCart()
            {return ShoppingCart;}
    public void setCompleteOrder(boolean completeOrder)
            {this.completeOrder = completeOrder;}
    public boolean getCompleteOrder()
            {return completeOrder;}
    public void setCostOfOrder(int costOfOrder)
            {this.costOfOrder = costOfOrder;}
    public int getCostOfOrder()
            {return costOfOrder;}
    public void setTransportationExpenses(int transportationExpenses)
            {this.transportationExpenses = transportationExpenses;}
    public int getTransportationExpenses()
            {return transportationExpenses;}
            
    public String awardBonus()
    {
        if(completeOrder=true)  
        {
            
            bonus = bonus + 5;
            {
                if (bonus < 101)
                {
                    buyerCategory = "BRONZE";
                }
                
                if (100 < bonus && bonus < 201)
                {
                    buyerCategory = "SILVER";
                }
                
                if (bonus > 200)
                {
                    buyerCategory = "GOLD";
                }
            }
        }
        else
            System.out.println("The order is not complet!");
        
        
        return ("Total points bonus are:  " + bonus);
            
    }
    
    public String setbuyerCategory()
    {
        while (bonus < 101)
        {
            buyerCategory = "BRONZE";
        }
                
        while (100 < bonus && bonus < 201)
        {
            buyerCategory = "SILVER";
            transportationExpenses = transportationExpenses / 2;
        }
                
        while (bonus > 200)
        {
            buyerCategory = "GOLD";
            transportationExpenses = 0;
        }
            
        return ("The buyer's category is: " + buyerCategory + " and transportation expenses are: " + transportationExpenses);
        
    }
    
    
}
        
            
            

