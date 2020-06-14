public abstract class User 
{
    private String Name;
    private String Surname;
    private String Email;
    private int UserId;
    private String Town;
    private String Address;
    private int NumberOfAddress;
    private int TK;
    public User(String Name, String Surname, String Email, int UserId, String Town, String Address, int NumberOfAddress, int TK)
    {
        this.Name = Name;
        this.Surname = Surname;
        this.Email = Email;
        this.UserId = UserId;
        this.Town = Town;
        this.Address = Address;
        this.NumberOfAddress = NumberOfAddress;
        this.TK = TK;
    }
    public void setName(String n)
    {this.Name = n;}
    public String getName()
    {return Name;}
    public void setSurname(String a)
    {this.Surname = a;}
    public String getSurname()
    {return Surname;}
    public void setEmail(String l)
    {this.Email = l;}
    public String getEmail()
    {return Email;}
    public void setUserId(int id)
    {this.UserId = id;}
    public int getUserId()
    {return UserId;}
    public void setTown(String t)
    {this.Town = t;}
    public String getTown()
    {return Town;}
    public void setAddress(String ad)
    {this.Address = ad;}
    public String getAddress()
    {return Address;}
    public void setNumberOfAddress(int nad)
    {this.NumberOfAddress = nad;}
    public int getNumberOfAddress()
    {return NumberOfAddress;}
    public void setTK(int tk)
    {this.TK = tk;}
    public int getTK()
    {return TK;}
}
    
    
    
